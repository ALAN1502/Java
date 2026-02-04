import java.util.Arrays;
import java.util.Scanner;

public class StringSort {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings:");
        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];

        System.out.println("Enter the strings:");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextLine();
        }

        Arrays.sort(arr);

        System.out.println("Strings in sorted order:");
        for (String s : arr){
            System.out.println(s);
        }
    }
}