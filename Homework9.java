import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author dcraw
 */
public class Homework9 {
    public static void main (String [] args)
    {
        // Identify Scanner
        Scanner input = new Scanner(System.in);

        // Declare variables
        double USDtoJPY; //JPY stands for Japanese Yen
        double USD;// USD stands for US Dollar

        // Formatting input
        DecimalFormat f = new DecimalFormat ("#,###.##");

        // Ask user to input exchange rate from JPY to USD
        System.out.println("What is today's price in JPY for 1 USD?"); // As of 6/6/2021, 1 USD = 109.55 JPY
        USDtoJPY = input.nextDouble();

        // Ask user to input how many USD dollars they want to convert
        System.out.println("Enter amount in USD to convert: (0 to Quit)");

        // Process Data until sentinel is entered
        do {
            USD = input.nextDouble();

            if (USD > 0)
            {
                double JPY = USDtoJPY * USD; // Perform calculation with exchange rate
                System.out.println("Your " + USD + " dollars is converted to " + f.format(JPY) + " yen");
            }
            else
            {
                System.out.println("Incorrect Data"); // If data is entered incorrectly print Incorrect data
            }
        } while (USD != 0);
    }
}
