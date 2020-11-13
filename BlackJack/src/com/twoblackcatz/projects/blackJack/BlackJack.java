package com.twoblackcatz.projects.blackJack;

import java.util.Scanner;

public class BlackJack {

	Scanner in = new Scanner(System.in);
	boolean endTurn = false;

	public BlackJack() {

		while (true) {
			CardDeck playingCards = new CardDeck();
			playingCards.createDeck();
			playingCards.shuffle();
			// create hand for player and dealer
			CardDeck playerHand = new CardDeck();
			CardDeck dealerHand = new CardDeck();
			playerHand.drawCard(playingCards);
			playerHand.drawCard(playingCards);
			dealerHand.drawCard(playingCards);
			dealerHand.drawCard(playingCards);

			while (true) {
				// Display player cards
				System.out.println("Your Hand: " + playerHand.toString());
				System.out.println("with a value of: " + playerHand.scoreTally());

				// Display dealer cards
				System.out.println(
						"Dealer Hand: " + (dealerHand.getCard(dealerHand.handSize() - 1).toString()) + " and [hidden]");

				// Take in user input to hit or stand
				System.out.println("Would you like to 1:Hit or 2:Stand");
				int response = in.nextInt();
				// They hit
				if (response == 1) {
					playerHand.drawCard(playingCards);
					System.out
							.println("You've drawn the: " + (playerHand.getCard(playerHand.handSize() - 1).toString()));
					System.out.println("Your hand value : " + playerHand.scoreTally());
					// Bust if they go over 21
					if (playerHand.scoreTally() > 21) {
						System.out.println("Players gone Bust. " + playerHand.scoreTally());
						endTurn = true;
						break;
					}

					if (response == 2) {
						break;
					}
				}

				if ((dealerHand.scoreTally() > playerHand.scoreTally()) && endTurn == false) {
					System.out.println("House wins " + dealerHand.scoreTally() + " to " + playerHand.scoreTally());

					endTurn = true;
				}

				// Dealer hits at 16 stands at 17
				while ((dealerHand.scoreTally() < 17) && endTurn == false) {
					dealerHand.drawCard(playingCards);
					System.out.println("Dealer draws: " + dealerHand.getCard(0).toString());
				}
				System.out.println("Dealers hand value: " + dealerHand.scoreTally());
				
				if ((dealerHand.scoreTally() > 21) && endTurn == false) {
					System.out.println("House went Busts!");
					endTurn = true;
					break;
				}

				if ((dealerHand.scoreTally() == playerHand.scoreTally()) && endTurn == false) {
					System.out.println("It's a tie!");
					endTurn = true;
					break;
				}
				// Determine if player wins
				if ((playerHand.scoreTally() > dealerHand.scoreTally()) && endTurn == false) {
					System.out.println("You win the hand.");
					endTurn = true;
					break;
				} else if (endTurn == false) {// dealer wins
					System.out.println("Dealer wins.");
				}
				// End of hand - put cards back in deck
				playerHand.clearHand();
				dealerHand.clearHand();
				System.out.println("End of Hand");
			}

			// Close Scanner
			System.out.println("Would you like to play again? 1: YES  2: NO");
			int reply = in.nextInt();
			if (reply == 2) {
				break;
			}

		}
		in.close();
	}
}
