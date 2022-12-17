public class standings {
    public static team[] s2 = new team[6];
    public static team[] s = new team[6];
    public static match[] games = new match[100];

    public static void setTeams() {
        s[0] = new team("Troia Chocobos", 84);
        s[1] = new team("Green Cap Mansions", 85);
        s[2] = new team("Giga Impact Snorlaxs", 93);
        s[3] = new team("PK Starstorms", 90);
        s[4] = new team("Roma DaVincis", 87);
        s[5] = new team("Shadow Moses Island Snakes", 91);

        s2[0] = new team("Bay City Bruisers", 88);
        s2[1] = new team("Choco Mountain Rockies", 84);
        s2[2] = new team("Hotel California Sound Check", 78);
        s2[3] = new team("Rapture BioShock", 91);
        s2[4] = new team("Nook Inc. Tanukis", 85);
        s2[5] = new team("Lavender Town Cubones", 82);
    }

    public static void sortTeamsByRating(team[] s) {
        for (int i = 0; i < s.length; i++) {
            for (int j = i + 1; j < s.length; j++) {
                team tmp = null;
                if (s[i].teamRating < s[j].teamRating) {
                    tmp = s[i];
                    s[i] = s[j];
                    s[j] = tmp;
                }
            }
        }
    }

    public static void sortTeamsByPoints(team[] s) {
        for (team name : s) {
            name.getTeamPoints();
        }
        for (int i = 0; i < s.length; i++) {
            for (int j = i + 1; j < s.length; j++) {
                team tmp = null;
                if (s[i].Points < s[j].Points) {
                    tmp = s[i];
                    s[i] = s[j];
                    s[j] = tmp;
                }
            }
        }
    }

    public static void callMatchEngine(team[] s) {
        games[0] = new match(s[0], s[1]);
        games[1] = new match(s[2], s[3]);
        games[2] = new match(s[4], s[5]);
        games[3] = new match(s[0], s[2]);
        games[4] = new match(s[1], s[4]);
        games[5] = new match(s[3], s[5]);
        games[6] = new match(s[0], s[5]);
        games[7] = new match(s[2], s[1]);
        games[8] = new match(s[4], s[3]);
        games[9] = new match(s[0], s[4]);
        games[10] = new match(s[1], s[3]);
        games[11] = new match(s[2], s[5]);
        games[12] = new match(s[0], s[3]);
        games[13] = new match(s[2], s[4]);
        games[14] = new match(s[1], s[5]);

        for (int i = 0; i < 15; i++) {
            games[i].record();
        }
    }

    public static void main(String[] args) {
        setTeams();
        sortTeamsByRating(s);
        sortTeamsByRating(s2);

        System.out.println("Teams Sorted by Rating: ");
        System.out.println("DIVISION 1 ");
        for (team name : s) {
            System.out.println(name);
        }
        System.out.println();
        System.out.println("DIVISION 2 ");
        for (team name : s2) {
            System.out.println(name);
        }
        System.out.println();

        for (int i = 1; i < 5; i++) {
            callMatchEngine(s);
            sortTeamsByPoints(s);
            callMatchEngine(s2);
            sortTeamsByPoints(s2);
            System.out.println("Standings Round " + i + ": ");
            System.out.println("DIVISION 1 ");
            for (team name : s) {
                name.printRecords();
            }
            System.out.println();
            System.out.println("DIVISION 2 ");
            for (team name : s2) {
                name.printRecords();
            }
            System.out.println();
        }
    }
}
