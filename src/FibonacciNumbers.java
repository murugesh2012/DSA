import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of Fibonacci Number : ");
        int noOfElements=sc.nextInt();
        int first=0,second=1;
        ArrayList<Integer> fibonacciNumbers=new ArrayList<>();
        fibonacciNumbers.add(first);
        fibonacciNumbers.add(second);
        while(noOfElements>2)
        {
            int nextDigit=first+second;
            first=second;
            second=nextDigit;
            fibonacciNumbers.add(nextDigit);
            noOfElements--;
        }
        System.out.println(fibonacciNumbers.toString());

    }
//    static void fibonacci(ArrayList result,int first, int second,int noOfElements) {
//        int nextDigit = first + second;
//        first = second;
//        second = nextDigit;
//        result.add(nextDigit);
//    }

    }
