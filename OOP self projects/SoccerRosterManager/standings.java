import java.util.*;

public class standings {
    static team[] s = new team[6];

    public static void setTeams() {
        s[0] = new team("Bay City Bruisers", 88);
        s[1] = new team("Choco Mountain Rockies", 84);
        s[2] = new team("Hotel California Sound Check", 78);
        s[3] = new team("Rapture BioShock", 91);
        s[4] = new team("Nook Inc. Tanukis", 85);
        s[5] = new team("Lavender Town Cubones", 82);
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

    public static void main(String[] args) {
        setTeams();
        System.out.println("Teams: ");
        for (team name : s) {
            System.out.println(name);
        }
        System.out.println();

        sortTeamsByRating(s);

        System.out.println("Teams Sorted by Rating: ");
        for (team name : s) {
            System.out.println(name);
        }
        System.out.println();

        System.out.println("Standings: ");
        for (team name : s) {
            name.printRecords();
        }
    }
}
