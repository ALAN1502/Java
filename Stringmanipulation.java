import java.util.Scanner;

public class Stringmanipulation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

       
        System.out.println("Length of string: " + str.length());

        
        if (str.length() >= 4) {
            System.out.println("Character at second position: " + str.charAt(1));
            System.out.println("Character at fourth position: " + str.charAt(3));
        } else {
            System.out.println("String is too short for 2nd and 4th position.");
        }

       
        if (str.length() > 2) {
            System.out.println("Substring from index 2: " + str.substring(2));
        }

       
        if (str.length() >= 5) {
            System.out.println("Substring from index 1 to 4: " + str.substring(1, 4));
        }

       
        System.out.print("Enter another string to concatenate: ");
        String str2 = sc.nextLine();
        String concatenated = str.concat(str2);
        System.out.println("Concatenated string: " + concatenated);

       
        System.out.println("Lowercase: " + str.toLowerCase());

       
        System.out.println("Uppercase: " + str.toUpperCase());

        sc.close();
    }
}
