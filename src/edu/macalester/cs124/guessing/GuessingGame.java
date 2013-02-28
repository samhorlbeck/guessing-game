package edu.macalester.cs124.guessing;

import acm.program.ConsoleProgram;

public class GuessingGame extends ConsoleProgram {
//    private GameMaster master;
//    private Player player;

    public void run() {
//        master = new GameMaster(); 
//        player = new Player();
        
        boolean playAgain = true;
        while(playAgain) {
            playOneGame();
            playAgain = readBoolean("Play again (y/n)? ", "y", "n");
        }
        println("See you later!");
    }

    private void playOneGame() {
//        master.startNewGame();
//        player.startNewGame();
//        
//        while(true) {
//            int guess = player.nextGuess();
//            println("The player guesses " + guess);
//            
//            int result = master.submitGuess(guess);
//            if(result == GameMaster.LOW) {
//                println("Game master says: too low.");
//                player.guessWasLow();
//            } else if(result == GameMaster.HIGH) {
//                println("Game master says: too high.");
//                player.guessWasHigh();
//            } else {
//                println("That's correct!");
//                println("The player got it in " + master.getGuessCount() + " guesses.");
//                break;
//            }
//        }
    }
}
