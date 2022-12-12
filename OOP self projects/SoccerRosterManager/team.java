public class team {
    public String teamName;
    public int teamRating;

    public team(String teamName, int teamRating) {
        this.teamName = teamName;
        this.teamRating = teamRating;
    }

    public String getTeamName() {
        return this.teamName;
    }

    public int getTeamRating() {
        return this.teamRating;
    }

    public String toString() {
        return this.teamName + ": " + this.teamRating;
    }
}
