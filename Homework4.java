import java.util.Scanner;

public class Homework4 {
    //declare the main method
    public static void main(String[] args) {

        // welcome the user
        System.out.println("I loop throughn the charecters of an string. ");
        // get ready to read the user data
        Scanner keyboard = new Scanner(System.in);
        // prompt the user for input
        // store the user input
        System.out.print("Please enter a word or a name:");
        String userInput=keyboard.next();
        //String userInput = "";
        for (int inputCounter = 0; inputCounter < userInput.length(); inputCounter++) {
            System.out.println(userInput.charAt(inputCounter));
        }//input loop END
    }
}
