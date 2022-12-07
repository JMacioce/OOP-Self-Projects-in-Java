public class MovieScores {
   public static void main(String[] args) {
      Movies Movie1 = new Movies(); // Calls the constructor
      Movies Movie2 = new Movies("Mugen Train", 9);
      Movies Movie3 = new Movies("Finding Nemo", 8);

      Movie1.print();
      System.out.println();

      Movie1.setName("Inception");
      Movie1.setRating(8);
      Movie1.print();
      Movie2.print();
      Movie3.print();
   }
}
