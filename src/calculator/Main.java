package calculator;
import calculator.*;
import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		Scanner scanner = new Scanner (System.in);
		Model m = new Model();
		int lastCalculation = 0;	
		
		View v = new View();
		Controller c = new Controller(m, v);
		while (true) {
			String input = scanner.nextLine();
			String delims = "[ ]+";
			String[] tokens = input.split(delims);
			if (tokens.length == 3) {
				int parameter1 = Integer.parseInt(tokens[0]);
				int parameter2 = Integer.parseInt(tokens[2]);
			
			
				if (tokens[1].equals("+")) {
					lastCalculation = m.operate(parameter1, parameter2, m.addition);
					System.out.println("= " + lastCalculation);
				}
				else if (tokens[1].equals("-")) {
					lastCalculation = m.operate(parameter1, parameter2, m.substraction);
					System.out.println("= " + lastCalculation);
				}
				else if (tokens[1].equals("*")) {
					lastCalculation = m.operate(parameter1, parameter2, m.multiplication);
					System.out.println("= " + lastCalculation);
				}	
				else if (tokens[1].equals("/")) {
					lastCalculation = m.operate(parameter1, parameter2, m.division);
					System.out.println("= " + lastCalculation);
				}	
			}

			else if (tokens.length == 2) {
				int parameter = Integer.parseInt(tokens[1]);
				
				if (tokens[0].equals("+")) {
					lastCalculation = m.operate(lastCalculation, parameter, m.addition);
					System.out.println("= " + lastCalculation);
				}
				else if (tokens[0].equals("-")) {
					lastCalculation = m.operate(lastCalculation, parameter, m.substraction);
					System.out.println("= " + lastCalculation);
				}
				else if (tokens[0].equals("*")) {
					lastCalculation = m.operate(lastCalculation, parameter, m.multiplication);
					System.out.println("= " + lastCalculation);
				}	
				else if (tokens[0].equals("/")) {
					lastCalculation = m.operate(lastCalculation, parameter, m.division);
					System.out.println("= " + lastCalculation);
				}	
			}
			
			else if (tokens.length == 1 && tokens[0].equals("c")) {
				
			}
		}
		
		
	}
}
