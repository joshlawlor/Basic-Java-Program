import java.util.Scanner;

public class ForLoopPractice {

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {

        int sum = 0;
        int x, value;
        double avg;

        // loop iterates from 1 to 3, inclusive.
        x = 1;    // initialization
        while ( x <= 3 ) {  // condition
            System.out.print("Enter value #" + x + ": ");
            value = kb.nextInt();
            sum = sum + value;
            x++;      //update
        }

        avg = sum / 3.0;

        System.out.println("The sum is " + sum + ".");
        System.out.println("The average is " + avg + ".");
    }
}
