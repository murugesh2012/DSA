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
        boolean swapped=false;
        for (int i = 0; i < numberOfElements; i++) {
            for (int j = 1; j < numberOfElements-i; j++) {
                if (arr[j-1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
        for (int num : arr) {
            System.out.println(num);
        }
    }
}
