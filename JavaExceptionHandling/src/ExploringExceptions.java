import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExploringExceptions {

    public static void main(String[] args) throws IOException {

        System.out.println("Contents of the file:\n:");

        FileInputStream myfile = null;

        try {

            myfile = new FileInputStream("/Users/juan/code/skillsoft/java-novice-to-javanista/track-2-java-apprentice/handling-errors-an-introduction-to-exceptions/JavaExceptionHandling/myFile.txt");

            DataInputStream readFile = new DataInputStream(myfile);

            while (true) {

                System.out.println(readFile.readUTF()); // java.io.EOFException
            }
        } catch (EOFException e) {

            System.out.println("An EOFException has been thrown.");
            e.printStackTrace();
        }
    }

//    public static void main(String[] args) {
//
//        System.out.println("Contents of the file:\n:");
//
//        FileInputStream myfile = null;
//
//        try {
//
//            myfile = new FileInputStream("/Users/juan/code/skillsoft/java-novice-to-javanista/track-2-java-apprentice/handling-errors-an-introduction-to-exceptions/JavaExceptionHandling/myFile.txt");
//
//            DataInputStream readFile = new DataInputStream(myfile);
//
//            while (true) {
//
//                System.out.println(readFile.readUTF()); // java.io.EOFException
//            }
//        } catch (IOException e) {
//
//            System.out.println("An IOException has been thrown.");
//            e.printStackTrace();
//        }
//    }

//    public static void main(String[] args) {
//
//        System.out.println("Contents of the file:\n:");
//
//        FileInputStream myfile = null;
//
//        try {
//
//            myfile = new FileInputStream("/Users/juan/code/skillsoft/java-novice-to-javanista/track-2-java-apprentice/handling-errors-an-introduction-to-exceptions/JavaExceptionHandling/myFile.txt");
//
//            DataInputStream readFile = new DataInputStream(myfile);
//
//            while (true) {
//
//                System.out.println(readFile.readUTF()); // java.io.EOFException
//            }
//        } catch (Exception e) {
//
//            System.out.println("An Exception has been thrown.");
//            e.printStackTrace();
//        }
//    }

//    public static void main(String[] args) throws FileNotFoundException {
//
//        try {
//            FileReader file = new FileReader("/Users/juan/Downloads/samplefile.txt"); // java.io.FileNotFoundException
//        } catch (FileNotFoundException e) {
//
//            System.out.println("\nThe file was not found. Create samplefile.txt and re-run.");
//        }
//
//        System.out.println("The code execution is complete!");
//    }

//    public static void main(String[] args) throws FileNotFoundException {
//
//        FileReader file = new FileReader("/Users/juan/Downloads/samplefile.txt"); // java.io.FileNotFoundException
//
//    }

//    public static void main(String[] args) {
//
//        try {
//            FileReader file = new FileReader("/Users/juan/Downloads/samplefile.txt"); // java.io.FileNotFoundException
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//
//            System.out.println("\nCaught the exception");
//        }
//    }
}
