import java.util.Scanner;

public class Main {
    static int randomNumber = (int) (Math.random() * 100 + 1);
    public static void main(String[] args) {
        System.out.println("[Random number is " + randomNumber + "]");

        guessNumber();

    }

    public static void guessNumber(){
        Scanner scanner = new Scanner(System.in);
        int count = 5;
        int lowNumber = 1;
        int highNumber = 100;
        while (count > 0) {
            System.out.println("\u001B[36m" + "----------------------------------------");
            System.out.println( "\u001B[35m" + "Please guess a number from " + "\u001B[0m" + "[" + lowNumber +" to "
                    + highNumber + "]" + "\u001B[0m" + "\n You have " + count + " guesses left. -----||----- ");

                int guessedNumber = Integer.parseInt(scanner.nextLine());
                if (guessedNumber == randomNumber) {
                    System.out.println("\u001B[32m" + "\nYou guessed correct!! The random number was : " + randomNumber);
                    System.exit(0);
                }
                if (guessedNumber > randomNumber) {
                    count --;
                    System.out.println("\u001B[36m" + "----------------------------------------");
                    System.out.println("\u001B[34m" + "Choose a lower number than " + "\u001B[3m" + guessedNumber);
                }
                if (guessedNumber < randomNumber) {
                    count--;
                    System.out.println("\u001B[36m" + "----------------------------------------");
                    System.out.println("\u001B[34m" + "Choose a higher number than " + "\u001B[35m" + guessedNumber );
                }
                if (count == 0){
                    System.out.println("\u001B[36m" + "----------------------------------------");
                    System.out.println("\u001B[31m" + "You lose. You could not guess in 5 attempts.");
                    System.exit(0);
                }



        }
    }
}