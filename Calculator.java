package week1.day2;

public class Calculator {
	public static void main(String[] args) {
		
	System.out.println("main class");
	}
	public void addNumbers(int num1, int num2, int num3) {
		System.out.println(num1 + num2 + num3);
	}

	public void subNumbers(int num1, int num2) {
		int c = num1 - num2;
		System.out.println(c);
	}

	public int multiplyTwoNumbers(int num1, int num2) {
		return num1 * num2;
	}

	public float divideTwoNumbers(int num1, int num2) {
		return num1 / num2;
	}


}
