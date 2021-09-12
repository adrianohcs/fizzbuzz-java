package fizzbuzzchallenge;

import java.util.Scanner;

import static java.lang.Integer.*;

public class FuzzBuzz {
    /*FizzBuzz
    - Write a program that prompts the user for a number between 1 and 100, and prints that number.
    - If the number is divisible by three, then print "Fizz" instead of the number.
    - If the number is divisible by five, then print "Buzz" instead of the number.
    - If the number is divisible by both three and five, then print "FizzBuzz" instead of the number.
    - Otherwise the program prints the number given by the user.
    */
    public static void main(String[] args) {
        System.out.println("THE FIZZBUZZ CHALLENGE-----------------");
        double number;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter an integer between 1 and 100: ");
            number = Double.parseDouble(scanner.nextLine());
            if (number >= 1 && number <= 100) {
                System.out.println(number + " is a valid entry. Proceed to the challenge.");
                String decision = (number % 3 == 0 && number % 5 == 0) ? "FizzBuzz"
                        : (number % 3 == 0) ? "Fizz"
                        : (number % 5 == 0) ? "Buzz"
                        : String.valueOf(number);
                System.out.println("And the program returns: " + decision);
                break;
            }
            if (number < 1 || number > 100) {
                System.out.println("Unfit number! Try again.");
            }
        }
    }
}
