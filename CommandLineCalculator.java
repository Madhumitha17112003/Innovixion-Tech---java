package commandLineCalculator;
import java.util.Scanner;

public class CommandLineCalculator {

	public static void main(String[] args) {
		
		   Scanner scanner = new Scanner(System.in);

		        System.out.println("Welcome to Command-Line Calculator");
		        System.out.println("Enter an expression (e.g., 2 + 2):");

		        String input = scanner.nextLine();

		        // Split the input into operands and operator
		        String[] parts = input.split(" ");
		        double operand1 = Double.parseDouble(parts[0]);
		        String operator = parts[1];
		        double operand2 = Double.parseDouble(parts[2]);

		        double result = 0;

		        switch (operator) {
		            case "+":
		                result = operand1 + operand2;
		                break;
		            case "-":
		                result = operand1 - operand2;
		                break;
		            case "*":
		                result = operand1 * operand2;
		                break;
		            case "/":
		                if (operand2 != 0) {
		                    result = operand1 / operand2;
		                } else {
		                    System.out.println("Cannot divide by zero!");
		                    return;
		                }
		                break;
		            default:
		                System.out.println("Invalid operator!");
		                return;
		        }

		        System.out.println("Result: " + result);
		    }
		}

	
