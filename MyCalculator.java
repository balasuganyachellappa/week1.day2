package week1.day2;

public class MyCalculator {
	public static void main(String[] args) {
		Calculator num = new Calculator();
		num.addNumbers(3, 5, 6);
		num.subNumbers(5, 2);
		int answer = num.multiplyTwoNumbers(5, 6);
		System.out.println(answer);
		float answer1 = num.divideTwoNumbers(12, 6);
		System.out.println(answer1);

	}	
}
