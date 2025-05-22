public class Cards {
   public int number;
   public String suit;
   public boolean isEleven;
   public int value;
   public String name;

   // constructor
   public Cards(int pValue, String pSuit, boolean pisEleven, int pNumber, String pName) {
      value = pValue;
      isEleven = pisEleven;
      suit = pSuit;
      number = pNumber;
      name = pName;
   }

   public void print() {
      System.out.println("Your card is the " + name + " of " + suit + ". Its value is " + value + ".");
   }
}
