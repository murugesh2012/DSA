package pattern;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        pattern1(sc.nextInt());
//        pattern2(sc.nextInt());
//        pattern3(sc.nextInt());
//        pattern4(sc.nextInt());
//        pattern5(sc.nextInt());
        pattern7(sc.nextInt());
//        pattern6(sc.nextInt());
    }

    private static void pattern3(int n) {
        for (int row = n; row >= 1; row--) {
            for (int column = row; column >= 1; column--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int totalColsInRow = row <= n ? row : 2 * n - row;
            {
                for (int column = 1; column <= totalColsInRow; column++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

        }
    }

    static void pattern5(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int totalColsInRow = row <= n ? row : 2 * n - row;
            int numOfSpaces = n - totalColsInRow;
            for (int i = 1; i <= numOfSpaces; i++) {
                System.out.print(" ");
            }

            {
                for (int column = 1; column <= totalColsInRow; column++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

        }
    }

    static void pattern6(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int totalColsInRow = row <= n ? row : 2 * n - row;
            int numOfSpaces = n - totalColsInRow;
            for (int i = 1; i <= numOfSpaces; i++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalColsInRow; col++) {
                if (col == 1 || col == totalColsInRow) {
                    System.out.print("* ");
                } else {
                    {
                        System.out.print("  ");
                    }
                }
            }

            System.out.println();
        }
    }

    static void pattern7(int n) {
        int noOfLines = 2 * n-1;
        for (int row = 0; row < noOfLines; row++) {
            for (int col = 0; col < noOfLines; col++) {
                int atEveryIndex = n - (Math.min(Math.min(row, col), Math.min(noOfLines - row, noOfLines - col)));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }

    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
