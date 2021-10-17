import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Calculator calculator = new Calculator();
        System.out.println("Welcome to the Calculator");
        String command = "";
        while (!command.equals("stop")) {
            System.out.println("Enter a command:");

            Scanner scanner = new Scanner(System.in);
            command = scanner.nextLine();
            String[] inputs = command.split(" ");

            if (inputs[0].equals("add")) {
                System.out.println(calculator.add(Integer.valueOf(inputs[1]), Integer.valueOf(inputs[2])));
            }

            else if (inputs[0].equals("subtract")) {
                System.out.println(calculator.subtract(Integer.valueOf(inputs[1]), Integer.valueOf(inputs[2])));
            }

            else if (inputs[0].equals("multiply")) {
                System.out.println(calculator.multiply(Integer.valueOf(inputs[1]), Integer.valueOf(inputs[2])));
            }

            else if (inputs[0].equals("divide")) {
                System.out.println(calculator.divide(Integer.valueOf(inputs[1]), Integer.valueOf(inputs[2])));
            }

            else if (inputs[0].equals("fibonacci")) {
                System.out.println(calculator.fibonacciNumberFinder(Integer.valueOf(inputs[1])));
            }

            else if (inputs[0].equals("binary")) {
                System.out.println(calculator.intToBinaryNumber(Integer.valueOf(inputs[1])));
            }
        }
    }
}
