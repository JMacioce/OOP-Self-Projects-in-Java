public class team {
    public String teamName;
    public int teamRating;
    public int Wins, Losses, Draws, Points;

    public team(String teamName, int teamRating) {
        this.teamName = teamName;
        this.teamRating = teamRating;
        this.Wins = 0;
        this.Losses = 0;
        this.Draws = 0;
        this.Points = 0;
    }

    public String getTeamName() {
        return this.teamName;
    }

    public int getTeamRating() {
        return this.teamRating;
    }

    public int getTeamPoints() {
        this.Points = (this.Wins * 3) + (this.Draws * 1);
        return this.Points;
    }

    public void addWin(team x) {
        this.Wins += 1;
    }

    public void addLoss(team x) {
        this.Losses += 1;
    }

    public void addDraw(team x) {
        this.Draws += 1;
    }

    public String toString() {
        return teamName + ": " + teamRating;
    }

    public void printRecords() {
        System.out.println(teamName + ": " + Wins + " - " + Losses + " - " + Draws);
    }
}
