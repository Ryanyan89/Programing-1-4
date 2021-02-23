import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Rock Paper Scissors");

        Scanner scan = new Scanner (System.in);
        Random randomNmb = new Random ();

        int random, playerWin, computerWin;
        String playerNumber;
        String computerNumber;
        String playAgain;
        String r = "rock";
        String s = "scissor";
        String p = "paper";
        String y = "yes";
        String n = "no";

        String [] plays = {r, p, s};

        playerWin = 0;
        computerWin = 0;

        boolean gameReplay = true;
        do {
            System.out.println("Choose Rock, Paper or Scissors than press enter to confirm ur choice.");
        //where player and computer chose number
        playerNumber = scan.next();

            //if player does not chose number between 1 and 3
            while (!(r).equals(playerNumber) && !(p).equals(playerNumber) && !(s).equals(playerNumber)) {

                System.out.println("Choose Rock, Paper or Scissors than press enter to confirm ur choice.");
                playerNumber = scan.next();
            }
            random = randomNmb.nextInt(3);
            computerNumber = plays[random];

            //possible outcomes
            if (playerNumber.equals(r) && computerNumber.equals(r)) {
                System.out.println("You chose Rock");
                System.out.println("Computer chose Rock");
                System.out.println("Tie.");
            } else if (playerNumber.equals(p) && computerNumber.equals(p)) {
                System.out.println("You chose Paper");
                System.out.println("Computer chose Paper");
                System.out.println("Tie.");
            } else if (playerNumber.equals(s) && computerNumber.equals(s)) {
                System.out.println("You chose Scissors");
                System.out.println("Computer chose Scissors");
                System.out.println("Tie.");
                System.out.println("Your score is: " + playerWin);
                System.out.println("The computer's score is: " + computerWin);
            } else if (playerNumber.equals(r) && computerNumber.equals(p)) {
                System.out.println("You chose Rock");
                System.out.println("Computer chose Paper");
                System.out.println("You lost.");
                computerWin = computerWin + 1;
            } else if (playerNumber.equals(p) && computerNumber.equals(r)) {
                System.out.println("You chose Paper");
                System.out.println("Computer chose Rock");
                System.out.println("You Win!");
                playerWin = playerWin + 1;
            } else if (playerNumber.equals(s) && computerNumber.equals(r)) {
                System.out.println("You chose Scissors");
                System.out.println("Computer chose Rock");
                System.out.println("You lost.");
                computerWin = computerWin + 1;
            } else if (playerNumber.equals(r) && computerNumber.equals(s)) {
                System.out.println("You chose Rock");
                System.out.println("Computer chose Scissors");
                System.out.println("You win!");
                playerWin = playerWin + 1;
            } else if (playerNumber.equals(s) && computerNumber.equals(p)) {
                System.out.println("You chose Scissors");
                System.out.println("Computer chose Paper");
                System.out.println("You win!");
                playerWin = playerWin + 1;
            } else if (playerNumber.equals(p) && computerNumber.equals(s)) {
                System.out.println("You chose Paper");
                System.out.println("Computer chose Scissors");
                System.out.println("You lost.");
                computerWin = computerWin + 1;
            }
            //scoreboard
            System.out.println("Your score is: " + playerWin);
            System.out.println("The computer's score is: " + computerWin);
            System.out.println("Type 1 if you wanna play again type 2 if you don't want to play again");
            playAgain = scan.next();

            while (!(y).equals(playAgain) && (!(n).equals(playAgain))){
                System.out.println("Type yes if you wanna play again type no if you don't want to play again");
                playAgain = scan.next();
                }
            if (playAgain.equals(n)) {
                System.out.println("Thanks for playing.");
                System.out.println("Your score was: " + playerWin);
                System.out.println("The computer's score was: " + computerWin);
                gameReplay = false;
            }
        }  while(gameReplay);
    }
}