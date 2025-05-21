public class Cards {
   public int number;
   public String suit;
   public boolean isEleven; //i.e for ace is it 11 or 1
   public int value;

   //constructor
   public Cards(int pValue, String pSuit, boolean pisEleven, int pNumber) {
      value = pValue;
      isEleven = pisEleven;
      suit=pSuit;
      number = pNumber;

      if(pValue==13){
         value=10;
         suit= "diamonds";
         isEleven=false;
         number=10;


      }
   }

   public void print(){
      System.out.println("your card is an " + number + " of " + suit + " your total value is " + value);
   }
}
