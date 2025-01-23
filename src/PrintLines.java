import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class PrintLines {


    public static void main(String[] args) throws FileNotFoundException {

        String line;
        // Wrap scanner around the FileReader that opens the file.
        System.out.println("Working Directory = " + System.getProperty("user.dir"));
        Scanner inFile = new Scanner(new FileReader("C:\\Users\\josla\\Java Projects\\Basic Java Program\\uploads\\quotes.txt"));

        // EOF loop
        while ( inFile.hasNext() ) {
            line = inFile.nextLine();
            System.out.println(line);
        }
        inFile.close();
    }
}
