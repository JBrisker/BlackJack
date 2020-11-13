package com.twoblackcatz.projects.blackJack;

public class Card {
	 // array of card names and suits 
	private static String[] Ranks = {"Ace", "King", "Queen", "Jack", "10",
                                   "9", "8", "7", "6", "5", "4", "3", "2"};
	 
	private static String[] Suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    private String cardRank;
    private String cardSuit;

	private int value;
 
	public Card (int r, int s){
		this.cardRank = Ranks[r];
		this.cardSuit = Suits[s];
	}

	public int getValue() {
		if(this.cardRank =="King") {
			this.value = 10;
		}else if(this.cardRank =="Queen") {
			this.value = 10;
		}else if(this.cardRank =="Jack") {
			this.value=10;
		}else if((this.cardRank) =="Ace") {
			this.value = 10;
		}else {
		this.value = Integer.parseInt(this.cardRank);
		}
		// TODO Auto-generated method stub
		return this.value;
	}
	
	public String toString(){
		return this.cardRank.toString() + " of " + this.cardSuit.toString();
	}

}

	
