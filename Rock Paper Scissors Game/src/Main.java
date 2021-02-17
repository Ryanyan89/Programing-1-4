import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Rock Paper Scissors");

        Scanner scan = new Scanner (System.in);
        System.out.println("Choose 1 for Rock, 2 for Paper or 3 for Scissors than press enter to confirm ur choice.");

        int computerNumber, playerNumber, rock, paper, scissors;
        rock = 1;
        paper = 2;
        scissors = 3;

        //where player and computer chose number
        playerNumber = scan.nextInt();
        //if player does not chose number between 1 and 3
        while (playerNumber != 1 && playerNumber != 2 && playerNumber != 3){

            System.out.println("Choose 1 for Rock, 2 for Paper o 3 for Scissors than press enter to confirm your choice.");
            playerNumber = scan.nextInt();
        }
        computerNumber = (int) (Math.random() * 3 + 1);

        //possible outcomes
        if (playerNumber == rock && computerNumber == rock) {
            System.out.println("You chose Rock");
            System.out.println("Computer chose Rock");
            System.out.println("Tie.");
        }
        else if (playerNumber == paper && computerNumber == paper) {
            System.out.println("You chose Paper");
            System.out.println("Computer chose Paper");
            System.out.println("Tie.");
        }
        else if (playerNumber == scissors && computerNumber == scissors) {
            System.out.println("You chose Scissors");
            System.out.println("Computer chose Scissors");
            System.out.println("Tie.");
        }
        else if (playerNumber == rock && computerNumber == paper) {
            System.out.println("You chose Rock");
            System.out.println("Computer chose Paper");
            System.out.println("You lost.");
        }
        else if (playerNumber == paper && computerNumber == rock) {
            System.out.println("You chose Paper");
            System.out.println("Computer chose Rock");
            System.out.println("You Win!");
        }
        else if (playerNumber == scissors && computerNumber == rock) {
            System.out.println("You chose Scissors");
            System.out.println("Computer chose Rock");
            System.out.println("You lost.");
        }
        else if (playerNumber == rock && computerNumber == scissors) {
            System.out.println("You chose Rock");
            System.out.println("Computer chose Scissors");
            System.out.println("You win!");
        }
        else if (playerNumber == scissors && computerNumber == paper) {
            System.out.println("You chose Scissors");
            System.out.println("Computer chose Paper");
            System.out.println("You win!");
        }
        else if (playerNumber == paper && computerNumber == scissors) {
            System.out.println("You chose Paper");
            System.out.println("Computer chose Scissors");
            System.out.println("You lost.");
        }
    }
}
