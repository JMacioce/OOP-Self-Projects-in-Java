public class Movies {
   private String name;
   private int rating;

   public Movies() { // Constructor with no arguments
      name = "NoName"; // Default name: NoName indicates name was not set
      rating = -1; // Default rating: -1 indicates rating was not set
   }

   public Movies(String initName, int initRating) { // Constructor overloading with string and int arguments
      name = initName; 
      rating = initRating; 
   }

   public void setName(String movieName) {
      name = movieName;
   }

   public void setRating(int userRating) {
      rating = userRating;
   }

   public void print() {
      System.out.println(name + " -- " + rating);
   }
}