import java.util.Scanner;
public class Homework3 {
    public static void main(String[] args) {

        int sum = 0; // stores the sum of even numbers

        /* loop starts from 2 and terminates when value of i becomes greater than 100 At each iteration the value of i is incremented by 2 and added to the sum variable to add the even numbers */

        for (int i = 2; i <= 100; i += 2) {

            sum = sum + i;
            System.out.println("Sum of all even numbers between 2 and 100 (inclusive) is " + sum);
        }




        int square;

        int sum1 = 0;

        for (int i = 1; i <= 10; i++) {

            square = (i * i);

            sum1 += square;

            System.out.println("The sum of all squares between 1 and 100 (inclusive) is " + sum1);
        }
        double  power = 0; // stores the powers

        for(int i = 0; i <= 20; i++) // loop starts from i=0 and terminates at i>20

        {power = Math.pow(2, i); // computes power of 2 from 2^0 to 2^20

            System.out.println("2 ^ " + i + " = " + (int) power);}

//displays all powers of 2 by converting each power of 2 to integer


        Scanner input = new Scanner(System.in); // create object of class Scanner

//prompts user to enter a number

        System.out.println("Enter a number: ");

//scans and reads numbers from user

        int number = input.nextInt();

        int sum2=0; //stores the sum of odd digits of input number

        while(number>0){

// loop executes till value of number variable is greater than 0

            int remainder = number % 10;

            /*takes mode of input number to calculate the remainder of the number, this means each digit of the number is separated. For example if the number is 32677 then after taking mod we get 7 in first iteration */

            if(remainder % 2!=0){

                /*checks if the value in remainder is odd which means the digit is not completely divisible by 2 and the mod of the digit with 2 is not equal to 0 */

                sum2 = sum2 + remainder;      } // adds the odd digits of input number

            number = number / 10;    }

// divides the number by 10 for example 32677/10 is 3267 in first iteration

        System.out.println("sum of all odd digits is " + sum2);
    }
}
