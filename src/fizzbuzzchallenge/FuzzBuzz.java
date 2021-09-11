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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer between 1 and 100: ");
        int number = scanner.nextInt();
        if (number >= 1 && number <= 100) {
            System.out.println(number);
        } else {
            System.out.println("WARNING!!! OUT OF BOUNDS!!!");
        }
    }
}
