import java.util.Scanner;

enum Choices {
    ROCK, PAPER, SCISSORS;
}

class Game {
    static void game() {
        // make the game   
        System.out.println("Welcome to the game!");
        System.out.print("Please enter your choice(r/p/s): ");
        String userChoice = scanner.nextLine().toLowerCase();

        // get the computer's choice
        Choices computerChoice = Choices.values()[(int) (Math.random() * 3)];

        // if the user's choice is the same as the computer's choice
        if (userChoice.equals(computerChoice.toString())) {
            System.out.println("It's a tie!");
            PlayAgain();
        } else if (userChoice.equals("r") && computerChoice == Choices.PAPER) {
            System.out.println("You lose!");
            PlayAgain();
        } else if (userChoice.equals("r") && computerChoice == Choices.SCISSORS) {
            System.out.println("You win!");
            PlayAgain();
        } else if (userChoice.equals("p") && computerChoice == Choices.ROCK) {
            System.out.println("You win!");
            PlayAgain();
        } else if (userChoice.equals("p") && computerChoice == Choices.SCISSORS) {
            System.out.println("You lose!");
            PlayAgain();
        } else if (userChoice.equals("s") && computerChoice == Choices.ROCK) {
            System.out.println("You lose!");
            PlayAgain();
        } else if (userChoice.equals("s") && computerChoice == Choices.PAPER) {
            System.out.println("You win!");
            PlayAgain();
        } else {
            System.out.println("Invalid input!");
            PlayAgain();
        }
    }

    static void PlayAgain() {
        // ask if the user wants to play again
        System.out.print("Do you want to play again? (y/n): ");
        String answer = scanner.nextLine();
        if (answer.equals("y")) {
            game();
        } else if(answer.equals("n")) {
            System.out.println("Thank you for playing!");
        } else {
            System.out.println("Invalid input!");
            PlayAgain();
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    static void MainGameFunc() {
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.print("Start the game? (y/n): ");
        String input = scanner.nextLine();
        if(input.equals("y")) {
            game();
        } else if(input.equals("n")) {
            System.out.println("Thanks for playing!");
            System.exit(0);
        } else {
            System.out.println("Invalid input!");
            MainGameFunc();
        }
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Game.MainGameFunc();
    }
}

