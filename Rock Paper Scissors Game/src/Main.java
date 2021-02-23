import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Rock Paper Scissors");

        Scanner scan = new Scanner (System.in);

        int computerNumber, playerNumber, rock, paper, scissors, playerWin, computerWin, playAgain, yes, no;
        rock = 1;
        paper = 2;
        scissors = 3;
        yes = 1;
        no = 2;
        playerWin = 0;
        computerWin = 0;

        boolean gameReplay = true;
        do {
            System.out.println("Choose 1 for Rock, 2 for Paper or 3 for Scissors than press enter to confirm ur choice.");
        //where player and computer chose number
        playerNumber = scan.nextInt();

            //if player does not chose number between 1 and 3
            while (playerNumber != 1 && playerNumber != 2 && playerNumber != 3) {

                System.out.println("Choose 1 for Rock, 2 for Paper o 3 for Scissors than press enter to confirm your choice.");
                playerNumber = scan.nextInt();
            }
            computerNumber = (int) (Math.random() * 3 + 1);

            //possible outcomes
            if (playerNumber == rock && computerNumber == rock) {
                System.out.println("You chose Rock");
                System.out.println("Computer chose Rock");
                System.out.println("Tie.");
                System.out.println("Your score is: " + playerWin);
                System.out.println("The computer's score is: " + computerWin);
            } else if (playerNumber == paper && computerNumber == paper) {
                System.out.println("You chose Paper");
                System.out.println("Computer chose Paper");
                System.out.println("Tie.");
                System.out.println("Your score is: " + playerWin);
                System.out.println("The computer's score is: " + computerWin);
            } else if (playerNumber == scissors && computerNumber == scissors) {
                System.out.println("You chose Scissors");
                System.out.println("Computer chose Scissors");
                System.out.println("Tie.");
                System.out.println("Your score is: " + playerWin);
                System.out.println("The computer's score is: " + computerWin);
            } else if (playerNumber == rock && computerNumber == paper) {
                System.out.println("You chose Rock");
                System.out.println("Computer chose Paper");
                System.out.println("You lost.");
                System.out.println("Your score is: " + playerWin);
                System.out.println("The computer's score is: " + computerWin);
                computerWin = computerWin + 1;
            } else if (playerNumber == paper && computerNumber == rock) {
                System.out.println("You chose Paper");
                System.out.println("Computer chose Rock");
                System.out.println("You Win!");
                playerWin = playerWin + 1;
                System.out.println("Your score is: " + playerWin);
                System.out.println("The computer's score is: " + computerWin);
            } else if (playerNumber == scissors && computerNumber == rock) {
                System.out.println("You chose Scissors");
                System.out.println("Computer chose Rock");
                System.out.println("You lost.");
                computerWin = computerWin + 1;
                System.out.println("Your score is: " + playerWin);
                System.out.println("The computer's score is: " + computerWin);
            } else if (playerNumber == rock && computerNumber == scissors) {
                System.out.println("You chose Rock");
                System.out.println("Computer chose Scissors");
                System.out.println("You win!");
                playerWin = playerWin + 1;
                System.out.println("Your score is: " + playerWin);
                System.out.println("The computer's score is: " + computerWin);
            } else if (playerNumber == scissors && computerNumber == paper) {
                System.out.println("You chose Scissors");
                System.out.println("Computer chose Paper");
                System.out.println("You win!");
                playerWin = playerWin + 1;
                System.out.println("Your score is: " + playerWin);
                System.out.println("The computer's score is: " + computerWin);
            } else if (playerNumber == paper && computerNumber == scissors) {
                System.out.println("You chose Paper");
                System.out.println("Computer chose Scissors");
                System.out.println("You lost.");
                computerWin = computerWin + 1;
                System.out.println("Your score is: " + playerWin);
                System.out.println("The computer's score is: " + computerWin);
            }
            System.out.println("Type 1 if you wanna play again type 2 if you don't want to play again");
            playAgain = scan.nextInt();

            while (playAgain != yes && playAgain != no) {
                System.out.println("Type 1 if you wanna play again type 2 if you don't want to play again");
                playAgain = scan.nextInt();
                }
            if (playAgain == 2) {
                System.out.println("Thanks for playing.");
                System.out.println("Your score was: " + playerWin);
                System.out.println("The computer's score was: " + computerWin);
                gameReplay = false;
            }
        }  while(gameReplay);
    }
}