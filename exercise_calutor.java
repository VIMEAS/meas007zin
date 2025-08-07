
import java.util.Scanner;

public class exercise_calutor {

    public static void main(String[] args) {
        int operator, num1, num2;

        System.out.println("Welcome to My the Calculator 1: Add, 2: Sub, 3: Mul, 4: Div");

        System.out.println("Choose Operator");

        Scanner sc = new Scanner(System.in);

        operator = sc.nextInt();
        System.out.println("Enter the first number");
        num1 = sc.nextInt();
        System.out.println("Enter the Second number");
        num2 = sc.nextInt();
       
        if (operator == 1){
            System.out.println("The result is: " + (num1 + num2));
        } else if (operator == 2) {
            System.out.println("The result is: " + (num1 - num2));
        } else if (operator == 3) {
            System.out.println("The result is: " + (num1 * num2));
        } else if (operator == 4) {
            System.out.println("The result is: " + (num1 / num2));
        } else {
            System.out.println("Invalid Operator");
        }
    }

}
