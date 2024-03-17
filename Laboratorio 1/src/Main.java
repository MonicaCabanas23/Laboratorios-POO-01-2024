import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // object for reading entries
        int option = 0;
        float a, b, result;

        System.out.println("-----------------------------------------------------------");
        System.out.println("Welcome to the calculator!");

        while(option != 5) {
            System.out.println("-----------------------------------------------------------");
            System.out.printf("1. Add %n2. Substract %n3. Multiply %n4. Divide %n5. Exit %n");
            System.out.print("Choose your option: ");
            option = sc.nextInt(); // reading the user's option
            System.out.println("-----------------------------------------------------------");

            switch (option) {
                case 1:
                    // add
                    System.out.print("a: ");
                    a = sc.nextFloat();
                    System.out.print("b: ");
                    b = sc.nextFloat();
                    result =  add(a, b);
                    System.out.printf("Result: %.2f %n", result);
                    break;
                case 2:
                    // substract
                    System.out.print("a: ");
                    a = sc.nextFloat();
                    System.out.print("b: ");
                    b = sc.nextFloat();
                    result =  substract(a, b);
                    System.out.printf("Result: %.2f %n", result);
                    break;
                case 3:
                    // multiply
                    System.out.print("a: ");
                    a = sc.nextFloat();
                    System.out.print("b: ");
                    b = sc.nextFloat();
                    result =  multiply(a, b);
                    System.out.printf("Result: %.2f %n", result);
                    break;
                case 4:
                    // divide
                    System.out.print("a: ");
                    a = sc.nextFloat();
                    System.out.print("b: ");
                    b = sc.nextFloat();
                    result =  divide(a, b);
                    if(result != -1)
                        System.out.printf("Result: %.2f %n", result);
                    else
                        System.out.println("Division by zero error");
                    break;
                case 5:
                    //exit
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Not valid option");
                    break;
            }
        }
    }

    public static float add(float a, float b) {
        return a + b;
    }

    public static float substract(float a, float b) {
        return a - b;
    }

    public static float multiply(float a, float b) {
        return a * b;
    }

    public static float divide(float a, float b) {
        if(b != 0)
            return a / b;
        else return -1;
    }
}