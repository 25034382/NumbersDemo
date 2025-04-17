/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package seisani10.numbersdemo;





/**
 *
 * @author SEISANI GUNDO JR
 */
public class NumbersDemo {

 
    public static void main(String[] args) {
        // Declare and assign values to two integer variables
        int number1 = 8;
        int number2 = 9;

        // Display results for the first number
        displayTwiceTheNumber(number1);
        displayNumberPlusFive(number1);
        displayNumberSquared(number1);

        // Display results for the second number
        displayTwiceTheNumber(number2);
        displayNumberPlusFive(number2);
        displayNumberSquared(number2);
    }

    // Method that desplay the number that is twice
    public static void displayTwiceTheNumber(int number) {
        System.out.println(number + " doubled is " + (number * 2));
    }

    // Method that desplay that the number that is added to five
    public static void displayNumberPlusFive(int number) {
        System.out.println(number + " plus 5 is " + (number + 5));
    }

    // Method that desplay the number that is squared
    public static void displayNumberSquared(int number) {
        System.out.println(number + " squared is " + (number * number));
    }
}
