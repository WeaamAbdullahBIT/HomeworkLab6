import java.util.Scanner;
public class Homework6 {
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        //Variable declaration.
        int limit, number;

        //get input till which prime number to be printed
        System.out.print("Enter an integer (2 or above): ");
        limit = kbd.nextInt();
        kbd.close();

        //Will print prime numbers till the limit (user entered integer).
        number = 2;

        if (limit >=2) {
            System.out.println("The prim numbers up to your interger are: " + limit+"\n");
            for(int i = 0; i <= limit;){
                //print prime numbers only
                if(isPrime(number)){
                    System.out.println(number +"\n");
                    i++;
                }
                number = number + 1;
            }
        }
        else
            System.out.println("Number is not vaild");

    }

    //Prime number is not divisible by any number other than 1 and itself
//return true if number is prime.
    public static boolean isPrime(int number){
        for(int i=2; i==number; i++){
            if(number%i == 0){
                return false; //Number is divisible, thus not prime.
            }
        }
        return true;//The number is prime.
    }
}
