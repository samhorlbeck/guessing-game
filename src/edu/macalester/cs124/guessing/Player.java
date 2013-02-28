package edu.macalester.cs124.guessing;

public class Player {
	private int guess;
	private int newHigh;
	private int newLow;

	public Player(){
		guess = 0;
		newHigh = 0;
		newLow = 0;
	}
	
	public void startNewGame(){
		guess = 0;
		newHigh = 100;
		newLow = -1;
	}
	
	public int nextGuess(){
		
		guess = newLow+((newHigh-newLow)/2);
		return guess;
	}
	
	public void guessWasLow(){
		newLow = guess;
	}
	
	public void guessWasHigh(){
		newHigh = guess;
	}
}