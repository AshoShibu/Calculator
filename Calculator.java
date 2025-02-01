// Calculator.java

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    int diff(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN;
        }
        return (double) a / b;
    }

    void fibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci series: " + a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
        System.out.println();
    }

    int sumOfArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    double mean(int[] arr) {
        return (double) sumOfArray(arr) / arr.length;
    }

    double variance(int[] arr) {
        double mean = mean(arr);
        double sumSqDiff = 0;
        for (int num : arr) {
            sumSqDiff += Math.pow(num - mean, 2);
        }
        return sumSqDiff / arr.length;
    }

    double standardDeviation(int[] arr) {
        return Math.sqrt(variance(arr));
    }
}
