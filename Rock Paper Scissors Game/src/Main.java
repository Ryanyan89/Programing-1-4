import java.awt.print.Paper;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Rock Paper Scissors");
        String Rock = "Rock";
        String Scissors = "Scissors";
        String Paper = "Paper";
        int randomNumber, playerNumber;

        randomNumber = (int)(Math.random() * 3 + 1);

        if (randomNumber == 1)
            System.out.println("Bot played: " + Rock);
        if (randomNumber == 2)
            System.out.println("Bot played: " + Scissors);
        if (randomNumber == 3)
            System.out.println("Bot played: " + Paper);


    }
}
