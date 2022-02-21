package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.print("Size of array n : ");
        System.out.println();
        size = scanner.nextInt();
        System.out.println("Enter the elements of array : ");
        int[] arr = new int [size];
        for(int i = 0; i<arr.length; i++) {
            System.out.print((i+1) + ". element : \n");
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sorted : " + Arrays.toString(arr));
    }
}
