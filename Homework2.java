import java.util.*;
import java.lang.Math;
public class Homework2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //This initializes sum to 0

        int sum=0;

        //The following loop calculates the sum of even numbers between 2 and 100

        for(int i=2; i<=100; i+=2){

            sum = sum + i;

        }

        //The prints the calculated sum

        System.out.println("Sum of even numbers " + sum);



        //This initializes sum to 0

        sum = 0;

        //The following loop calculates the square of numbers between 1 and 10

        for(int i = 1; i<=10; i++) {

            sum += (i * i);

        }

        //The prints the calculated sum

        System.out.println("Sum of squares " + sum);



        //This initializes sum to 0

        sum = 0;

        //The following loop calculates the sum of the powers of 2 from 0 and 20

        for(int i = 0; i <= 20; i++){

            sum+=Math.pow(2, i);

        }

        //The prints the calculated sum

        System.out.println("Powers of 2 " + sum);



        //This initializes sum to 0

        sum = 0;

        //This declares variables a and b as integers

        int a, b;

        //This gets input for a

        a = input.nextInt();

        //This gets input for b

        b = input.nextInt();

        //The following loop calculates the sum of odd numbers between a and b

        for(int i = a; i <= b; i++){

            if(i%2 != 0){

                sum+=i;

            }

        }

        //The prints the calculated sum

        System.out.println("Odd numbers " + sum);



        //This initializes sum to 0

        sum = 0;

        //This gets input for a

        a = input.nextInt();

        //The following loop calculates the sum of odd digits in a

        while(a>0){

            int rem = a % 10;

            if(rem % 2!=0){

                sum = sum + rem;

            }

            a/=10;

        }

        //The prints the calculated sum

        System.out.println("Odd numbers " + sum);

    }
}
