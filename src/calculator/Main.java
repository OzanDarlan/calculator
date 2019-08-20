package calculator;
import calculator.*;
import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		Model m = new Model();			
		View v = new View();
		Controller c = new Controller(m, v);		
	}
}
