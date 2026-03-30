import java.io.*;

public class FileReadWriteExample {
    public static void main(String[] args) {

        String filename = "sample.txt";

        // Writing to file
        try {
            FileWriter writer = new FileWriter(filename);
            writer.write("Hello, this is a sample file.\n");
            writer.write("Java File Handling Example.\n");
            writer.close();
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error while writing to file.");
        }

        // Reading from file
        try {
            FileReader reader = new FileReader(filename);
            BufferedReader br = new BufferedReader(reader);

            String line;
            System.out.println("\nReading from file:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            reader.close();

        } catch (IOException e) {
            System.out.println("Error while reading from file.");
        }
    }
}