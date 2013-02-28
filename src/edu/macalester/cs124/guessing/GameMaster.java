package edu.macalester.cs124.guessing;

import java.util.Random;

public class GameMaster {
	public static final int HIGH = 1;
	public static final int LOW = 0;
	private static final int CORRECT = -1;
	private int counter;
	private int answer;
	
	public GameMaster() {
		counter = 0;
		answer = 0;
	}
	
	public void startNewGame() {
		Random rand = new Random();
		answer = rand.nextInt(100);
		counter = 0;
	}
	
	
	public int submitGuess(int guess) {
		counter++;
		if(guess > answer)
			return HIGH;
		else if(guess < answer)
			return LOW;
		else
			return CORRECT;
	}
	
	public int getGuessCount() {
		return counter;
	}
	
	public int getAnswer() {
		return answer;
	}
}
