import javax.smartcardio.Card;

public class PlayBlackJack {
    public Player player;
    public Dealer dealer;
    public Cards[] cardDeck;

    public static void main(String[] args) {
        PlayBlackJack play = new PlayBlackJack();
    }


    public PlayBlackJack(){
        System.out.println("Let's play Blackjack!");
        cardDeck = new Cards[52];


        for(int x=0; x< 13;x++) {
            Cards firstCard = new Cards(x+1, "diamonds", false, x+1);
            firstCard.print();
            cardDeck[x] = firstCard;
        }
    }



}