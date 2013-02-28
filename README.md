Comp 124: Guessing Game Lab
====

This lab in an exercise in designing and implementing your own classes. It builds on the number guessing game problem from the last homework — but now, instead of
asking a human player for the answers, we will implement a computer player.

Fork and clone this repository, and import it into Eclipse.

You will find a GuessingGame class. It has a bunch of code that is all correct and ready to go, but is commented out because it relies on two other classes that are not implemented yet: GameMaster and Player.


Step 1: Draw Up a Plan
---

Before you type anything, study the code in GuessingGame until you understand it.

- How does the code work? What will the output be when GameMaster and Player are working correctly?
- What methods must GameMaster implement for this code to work? What about Player?
  Be sure to keep track of which methods belong on which class.
  You can figure this out by examining which messages GuessingGame sends to which variable.
  **Write it down!**
- Now think about what instance variables each of those two classes will need.
  If you are GameMaster, what information do you need to remember between method calls?
    - Hint: GameMaster needs the named constants LOW, HIGH and CORRECT. Take a look at the bottom of page 66 of Roberts
      if you've forgotten the syntax for a named constant.
    - Hint: GameMaster needs a source of random numbers. Read page 181 of Roberts for a reminder on how to use a random number generator.
- What about Player? Well, it depends on the strategy Player uses. For now, let's make a stupid
  player who just guesses 0, then 1, then 2, etc.


Step 2: Implement GameMaster
---

Create the GameMaster class. Add a small run() method to GuessingGame so you can test your work as you go (but leave that commented-out code intact in GuessingGame — you'll need it later!). Think about how you will test your GameMaster.

Once you've tested it to your satisfaction, make sure that GameMaster is properly encapsulated, so that it keeps the answer secret!



Step 3: Implement Player
---

Remember, for now you're just implementing a stupid player who ignores the answers and guesses sequentially starting from zero.
You may be tempted to make a smarter player, but don't do that just yet!

It is probably smart to test your Player class in isolation first.
Once you think Player is working, remove your test code, uncomment the original code, and see if it all works correctly together!



Challenge: Implement a smarter player
---

Move your current player code into a CountingPlayer class. Make Player an abstract base class, and make CountingPlayer extend Player. Now make a SmartPlayer class with a better algorithm. Then in GameMaster, you can change one line so that you get either the one player:

        player = new CountingPlayer();

...or the other:

        player = new SmartPlayer();

Share your smarter algorithm when you have it working!
