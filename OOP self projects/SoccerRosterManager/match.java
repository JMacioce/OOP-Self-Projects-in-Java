import java.util.Random;

public class match {
    private Random a, b;
    private int aNum, bNum;

    public void game (team x, team y) {
        a = new Random();
        b = new Random();

        for (int i = 0; i < 10; i++) {
            // aNum = a.nextInt(100) + 1; //1-100
            // bNum = b.nextInt(100) + 1; //1-100

            aNum = 99;
            bNum = 4;

            if(aNum > x.teamRating && bNum <= y.teamRating) {
                x.addLoss(x);
                y.addWin(y);
                break;
            }
        }


    }
}
