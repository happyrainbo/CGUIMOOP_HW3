import java.util.ArrayList;
import java.util.Random;

public class Deck {
	private ArrayList<Card> cards;
	private ArrayList<Card> usedCard;
	public int nUsed;
	Random rand = new Random();
	
	public Deck(int nDeck){
		cards=new ArrayList<Card>();
		for(int i=0;i<nDeck;i++)
		{
			for(Card.Suit j:Card.Suit.values())
			{
				for(int k=1;k<=13;k++)
				{
					Card card=new Card(j,k);
					cards.add(card);
				}
			}
		}
		shuffle();
	}
	
	public void shuffle(){
		for(int i=0;i<cards.size();i++){
			Random rand = new Random();
			int j = rand.nextInt(52);
			Card temp=cards.get(i);
			cards.set(i, cards.get(j));
			cards.set(j, temp);
		}
		usedCard = new ArrayList<Card>();
		nUsed=0;
	}
	
	public Card getOneCard(){
		if(nUsed==cards.size())
		{
			shuffle();
			usedCard.add(cards.get(nUsed));
			nUsed++;
			return cards.get(nUsed-1);
		}
		else
		{
			usedCard.add(cards.get(nUsed));
			nUsed++;
			return cards.get(nUsed-1);
		}	
	}
	
	public void printDeck(){
		for(int i=0;i<getAllCards().size();i++)
		{
			Card c=cards.get(i);
			c.printCard();
		}
	}
	public ArrayList<Card> getAllCards(){
		return cards;
	}
}
