package ch3;

public class Op1 {

	public static void main(String[] args) {
		int a=20, b=10, c=0;
		
		c = a + b;
		System.out.println(c); //30
		
		c = a - b;
		System.out.println(c); //10
		
		c = a * b;
		System.out.println(c); //200
		
		c = a / b;
		System.out.println(c); //2
		
		c = a % b;
		System.out.println(c); //0
		
		c = 12 % 5;
		System.out.println(c); //2
		// 정수 나누기 정수는 정수 표현.
		// 실제값은 2.4(실수)이지만 2(정수)로 표현. 
		
	}

}
