
public class Method_Returns {
// ��� �� ��ȯ �� �����ִ� ��
	public static void main(String[] args) {
		int result;
		result = adder(4, 5);
		
		System.out.println("4 + 5 = "+result);
		System.out.println("3.5 + 3.5 = "+square(3.5));
	}
	
//  adder �Լ� ����
	public static int adder(int num1, int num2) {
		int addResult = num1 + num2;
		return addResult;
	}
	
//  square �Լ� ����
	public static double square	(double num) {
		return num * num;
	}
}