package Rock_Paper_Scissors;
import java.util.Random;
import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select Your Choice...");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");

        int user_choice = sc.nextInt();

        Random random = new Random();
        int computer_guess = random.nextInt(3) + 1;

        if (user_choice == computer_guess) {
            System.out.println("It's a Tie...");
        }
        if (user_choice == 1 && computer_guess == 2) {
            System.out.println("You Chose Rock");
            System.out.println("Computer Chose Paper");
            System.out.println("Computer Won...");
        }
        if (user_choice == 2 && computer_guess == 1) {
            System.out.println("You Chose Paper");
            System.out.println("Computer Chose Rock");
            System.out.println("You Won...");
        }
        if (user_choice == 1 && computer_guess == 3) {
            System.out.println("You Chose Rock");
            System.out.println("Computer Chose Scissors");
            System.out.println("You Won...");
        }
        if (user_choice == 3 && computer_guess == 1) {
            System.out.println("You Chose Scissors");
            System.out.println("Computer Chose Rock");
            System.out.println("Computer Won...");
        }
        if (user_choice == 2 && computer_guess == 3) {
            System.out.println("You Chose Paper");
            System.out.println("Computer Chose Scissors");
            System.out.println("Computer Won...");
        }
        if (user_choice == 3 && computer_guess == 2) {
            System.out.println("You Chose Scissors");
            System.out.println("Computer Chose Paper");
            System.out.println("You Won...");
        }

        sc.close();
    }
}
