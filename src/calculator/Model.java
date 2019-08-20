package calculator;

public class Model {
	//a function interface
	interface Calculation {
		int operation(int a, int b);
	}
	
	public int operate (int a, int b, Calculation calculation ) {
		return calculation.operation(a, b);
	}
	
	Calculation addition = (int x, int y) -> x + y;
	Calculation substraction = (int x, int y) -> x - y;
	Calculation multiplication = (int x, int y) -> x * y;
	Calculation division = (int x, int y) -> x / y;
}
