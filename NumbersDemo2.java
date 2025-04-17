/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package seisani10.numbersdemo2;

/**
 *
 * @author SEISANI GUNDO JR
 */
import java.util.Scanner ; 
public class NumbersDemo2 {

    public static void main(String[] args) {
 
     Scanner scanner = new Scanner(System.in);
     
System.out.println("Enter the first integer: ");
        int number1 = scanner.nextInt();
        
     System.out.println("Enter the second integer: ");
        int number2 = scanner.nextInt();
   // call the methods so that it can desplay the results
        displayTwiceTheNumber(number1);
        displayNumberPlusFive(number1);
        displayNumberSquared(number1);

        displayTwiceTheNumber(number2);
        displayNumberPlusFive(number2);
        displayNumberSquared(number2);

    }
    //method that deplayed the number that  is twiced 
      public static void displayTwiceTheNumber(int number) {
        System.out.println(number + " doubled is " + (number * 2));
                } 
      // method that deplays the number that is added to five 
        public static void displayNumberPlusFive(int number) {
        System.out.println(number + " plus 5 is " + (number + 5));         
        }
        
        //method that desplay the number squared
       public static void displayNumberSquared(int number) {
        System.out.println(number + " squared is " + (number * number));
    }  
}
N