import java.util.Arrays;
import java.util.Scanner;

public class Search{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements:");
        int n = sc.nextInt();
        int[] arr =new int[n];
        System.out.println("Enter  sorted elements:");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Ente element to search:");
        int target = sc.nextInt();
        int index = Arrays.binarySearch(arr, target);

        if (index >=0)
            System.out.println("Element found at" + index);
        else
            System.out.println("Element not found");
        sc.close();
    }
}