package sortingalgos;

import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elements in the array: ");
        int numberOfElements = sc.nextInt();
        int[] arr = new int[numberOfElements];
        System.out.println("Enter the Elements for the array: ");
        for (int i = 0; i < numberOfElements; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < numberOfElements; i++) {
            for (int j = i + 1; j < numberOfElements; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int num : arr) {
            System.out.println(num);
        }
    }
}
