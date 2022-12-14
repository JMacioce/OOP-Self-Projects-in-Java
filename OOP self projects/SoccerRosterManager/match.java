import java.util.Random;

public class match {
    private Random a, b;
    private int aNum, bNum;

    public team t1, t2;

    public match(team t1, team t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public void record() {
        a = new Random();
        b = new Random();

        for (int i = 0; i < 9; i++) {
            aNum = a.nextInt(100) + 1; // 1-100
            bNum = b.nextInt(100) + 1; // 1-100

            if (aNum > t1.teamRating && bNum <= t2.teamRating) {
                t1.addLoss(t1);
                t2.addWin(t2);
                break;
            } else if (aNum <= t1.teamRating && bNum > t2.teamRating) {
                t2.addLoss(t2);
                t1.addWin(t1);
                break;
            } else if (i == 8) {
                t1.addDraw(t1);
                t2.addDraw(t2);
            }

            aNum = 0;
            bNum = 0;
        }
    }
}
