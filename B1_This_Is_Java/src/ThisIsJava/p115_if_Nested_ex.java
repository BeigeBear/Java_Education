package ThisIsJava;

public class p115_if_Nested_ex {

	public static void main(String[] args) {
		int score = (int)(Math.random()*20) + 81;
		System.out.println("����: " + score);

		String grade;
	
		if(score>=90) { 				// 90�̻�
			if(score>=95) {				// 90�̻� �� 95�̻�
				grade = "A+";
			} else {
				grade = "A";
			}
		} else {
			if(score>=85) {				// 85�̻�
				grade = "B+";
			} else {
				grade = "B";
			}
		}
		System.out.println("����: "+ grade);
	}
}