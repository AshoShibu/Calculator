// UserInput.java

import java.util.*;

class UserInput {
    Scanner scan = new Scanner(System.in);

    int[] getTwoNumbers() {
        int[] numbers = new int[2];
        System.out.println("Enter first number:");
        numbers[0] = scan.nextInt();
        System.out.println("Enter second number:");
        numbers[1] = scan.nextInt();
        return numbers;
    }

    int[] getArray() {
        System.out.println("Enter the number of elements in the array:");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    int getChoice() {
        System.out.println("\nSelect an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Fibonacci Series");
        System.out.println("6. Sum of Array");
        System.out.println("7. Mean of Array");
        System.out.println("8. Variance of Array");
        System.out.println("9. Standard Deviation");
        System.out.println("0. Exit");

        return scan.nextInt();
    }
}
