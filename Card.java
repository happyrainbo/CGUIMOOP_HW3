
public class Card {
	Suit suit;
	public enum Suit{Club,Diamond,Heart,Spade}
	private int rank;
	public Card(Suit s,int r){
		suit=s;
		rank=r;
	}	
	
	public void printCard(){
		System.out.println(getSuit()+","+getRank());
	}
	public Card.Suit getSuit(){
		return suit;
	}
	public int getRank(){
		return rank;
	}
}
