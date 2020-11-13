/*Black Jack Java Game

You are making a mini Java Black Jack simulation using standard console output
(printing to console).

Please refer to the link on the rules of how to play Black Jack

Minimum Requirments:
- a player (user) must be able to type using the keyboard to make game selections
- The game will played with 1 human (user) and the house (1 computer)
- you only need to implement logic for 'hit' or 'stand'
	- you do not need to do 'split' , 'insurance' or any other advanced rules
	or moves for Black Jack.
- The game is played on 1 single DECK of 52 Playing Cards, no Jokers
- As cards are played to the player and the House, remember to remove them from
	the deck (no duplicate cards)
- implement random drawing and playing of cards
- each game is done win either the house or the player wins.  Your program should
  start a new game and run a new game indefinitely, until the player chooses to
  stop playing
 - you do not need to take bets or track currency
 - after every game move - ie. dealing cards, choosing hit or stand, etc.
 		the program should print the House Cards and player cards to the console,
		as well as any instructions if it's time to choose a move in the game.
- work to make CLEAN, ORGANIZED, REUSABLE CODE.  So, follow the principles of 
	OOP.
	- ^ HOWEVER - focus on making a functional program FIRST (get logic working)
	then go back and refactor your code as time permits to better use OOP principles

 
 - Bonus Areas -
 	- Make your DECK a SINGLETON object
	- implement betting - your player can run out of money
	- implement SPLIT to work in your play strategy
	- instead of printing a Card such as "4 of Spades", use console characters
		to mimic drawing a card - so have a 'visual' representation of each card.
 * 
 */
package com.twoblackcatz.projects.blackJack;

import java.util.Scanner;


public class BlackJackRunner {
	
	
	static BlackJack newGame; 

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Would you like to play? ");
		System.out.println("Press 1 to play or 2 to exit");
		int input = scan.nextInt();
		if(input == 1) {
			newGame = new BlackJack();
			
		} else if(input == 2) {
			System.out.println("See ya!");
			
		}
		else {
			System.out.println("not a valid input");
		}
		
		scan.close();
		}
			
		
}
		
	
	
     


