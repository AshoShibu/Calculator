// Main.java

class Main {
    public static void main(String[] args) {
        UserInput ui = new UserInput();
        Calculator cal = new Calculator();
        boolean running = true;

        while (running) {
            int choice = ui.getChoice();

            switch (choice) {
                case 1: {
                    int[] numbers = ui.getTwoNumbers();
                    System.out.println("Sum: " + cal.sum(numbers[0], numbers[1]));
                    break;
                }
                case 2: {
                    int[] numbers = ui.getTwoNumbers();
                    System.out.println("Difference: " + cal.diff(numbers[0], numbers[1]));
                    break;
                }
                case 3: {
                    int[] numbers = ui.getTwoNumbers();
                    System.out.println("Multiplication: " + cal.multiply(numbers[0], numbers[1]));
                    break;
                }
                case 4: {
                    int[] numbers = ui.getTwoNumbers();
                    System.out.println("Division: " + cal.divide(numbers[0], numbers[1]));
                    break;
                }
                case 5: {
                    System.out.println("Enter the number of Fibonacci terms:");
                    int n = new java.util.Scanner(System.in).nextInt();
                    cal.fibonacci(n);
                    break;
                }
                case 6: {
                    int[] arr = ui.getArray();
                    System.out.println("Sum of Array: " + cal.sumOfArray(arr));
                    break;
                }
                case 7: {
                    int[] arr = ui.getArray();
                    System.out.println("Mean: " + cal.mean(arr));
                    break;
                }
                case 8: {
                    int[] arr = ui.getArray();
                    System.out.println("Variance: " + cal.variance(arr));
                    break;
                }
                case 9: {
                    int[] arr = ui.getArray();
                    System.out.println("Standard Deviation: " + cal.standardDeviation(arr));
                    break;
                }
                case 0:
                    running = false;
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
