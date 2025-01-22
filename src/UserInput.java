import java.util.Scanner;
public class UserInput {

    static Scanner jl = new Scanner(System.in);

    public static void main(String[] args) {

        int test1, test2, test3;
        double average;

        System.out.print("Enter Test 1: ");
        test1 = jl.nextInt();

        System.out.print("Enter Test 2: ");
        test2 = jl.nextInt();

        System.out.print("Enter Test 3: ");
        test3 = jl.nextInt();

        average = (test1 + test2 + test3)/ 3.0;
        System.out.println("The average is " + average + ".");


    }
}
