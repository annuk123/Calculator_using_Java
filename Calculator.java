import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner cal = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the Operator: ");
            //int result = 0;

            char calc = cal.next().trim().charAt(0);
            if (calc == '+' || calc == '-' || calc == '*' || calc == '/' || calc == '%') {
                System.out.print("Enter first integer: ");
                int num1 = cal.nextInt();
                System.out.print("Enter sec integer: ");
                int num2 = cal.nextInt();
                if (calc == '+') {
                    int result = num1 + num2;
                    System.out.println("Sum of " + num1 + " + " +  num2 + " = " + result);
                }
                if (calc == '-') {
                    int result = num1 - num2;
                    System.out.println("Difference of " + num1 + " - " +  num2 + " = " + result);
                }
                if (calc == '*') {
                    int result = num1 * num2;
                    System.out.println("Product of " + num1 + " * " +  num2 + " = " + result);
                }
                if (calc == '/') {
                    if (num2 != 0) {
                        int result = num1 / num2;
                        System.out.println("Divide of " + num1 + " / " +  num2 + " = " + result);
                    }
                }
                if (calc == '%') {
                    int result = num1 % num2;
                    System.out.println("Modulus of " + num1 + " % " +  num2 + " = " + result);

                }

            } else if (calc == 'x' || calc == 'X') {
                break;
            }
            else {
                System.out.println("Invaild Operation");
            }
            System.out.println();
        }

    }
}