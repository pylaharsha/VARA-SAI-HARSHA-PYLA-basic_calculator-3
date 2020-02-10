package epam.com.basic_calculator;

public class calculate {
	public static int plus(int a,int b) {
		return a+b;
	}
	public static int multiply(int a,int b) {
		return a*b;
	}
	public static int subtract(int a,int b) {
		return a-b;
	}
	public static int divide(int a,int b) {
		try {
		return a/b;
	}
		catch(ArithmeticException e) {
			System.out.println(e);
			return -1;
		}
	}
	public static int modulusdivision(int a,int b) {
		return a%b;
	}

}
