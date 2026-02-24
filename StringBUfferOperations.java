import java.util.Scanner;
public class StringBUfferOperations{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a string:");
        String input =sc.nextLine();

        StringBuffer sb = new StringBuffer(input);

        System.out.println("Capacity of StringBuffer: " + sb.capacity());

        sb.reverse();
        String reversedUpper = sb.toString().toUpperCase();
        System.out.println("Reversed and Uppercase String: " + reversedUpper);

        System.out.print("Enter another string to append:");
        String another = sc.nextLine();

        sb.append(another);
        System.out.println("Final String after appending:" + sb);
    }
}