import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        boolean done = false;
        Scanner scan = new Scanner(System.in);
        Double ans = null;
        while (!done) {
            System.out.println("What would you like to do?");
            String choice = scan.nextLine();
            System.out.println("First operand");
            String firstInput = scan.nextLine();
            double firstNumber;
            if (ans != null && firstInput.equals("ans")) {
                firstNumber = ans;
            }
            else {
                firstNumber = Double.parseDouble(firstInput);
            }
            System.out.println("Second operand");
            String secondInput = scan.nextLine();
            double secondNumber;
            if (ans != null && secondInput.equals("ans")) {
                secondNumber = ans;
            }
            else {
                secondNumber = Double.parseDouble(secondInput);
            }
            if (choice.equals("add")) {
                ans = firstNumber + secondNumber;
                System.out.println("= " + ans);
            } else if (choice.equals("subtract")) {
                ans = firstNumber - secondNumber;
                System.out.println("= " + ans);
            } else if (choice.equals("multiply")) {
                ans = firstNumber * secondNumber;
                System.out.println("= " + ans);
            } else if (choice.equals("divide")) {
                ans = firstNumber / secondNumber;
                System.out.println("= " + ans);
            } else if (choice.equals("exit")) {
                done = true;
            }
            else {
                System.out.println("I didn't understand.");
            }
        }
    }
}
