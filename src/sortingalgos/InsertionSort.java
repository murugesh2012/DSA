package sortingalgos;

import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elements in the array: ");
        int numberOfElements = sc.nextInt();
        int[] arr = new int[numberOfElements];
        System.out.println("Enter the Elements for the array: ");
        for (int i = 0; i < numberOfElements; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < numberOfElements-1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
        for (int num : arr) {
            System.out.println(num);
        }
    }
}
