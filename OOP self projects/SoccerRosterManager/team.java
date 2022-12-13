public class team {
    public String teamName;
    public int teamRating;
    public int Wins;
    public int Losses;
    public int Draws;

    public team(String teamName, int teamRating) {
        this.teamName = teamName;
        this.teamRating = teamRating;
        this.Wins = 0;
        this.Losses = 0;
        this.Draws = 0;
    }

    public String getTeamName() {
        return this.teamName;
    }

    public int getTeamRating() {
        return this.teamRating;
    }

    public String toString() {
        return teamName + ": " + teamRating;
    }

    public void printRecords() {
        System.out.println(teamName + ": " + Wins + " - " + Losses + " - " + Draws);
    }
}
