package ThisIsJava;

public class p131_Break_ex {

//	 ���� �ֻ����� ������ 6�� ������ ����.
	public static void main(String[] args) {
		while(true) { // ���ѷ���
			int num = (int)(Math.random()*6)+1;
			System.out.println(num);
			if(num == 6) {
				break;
			
			}
		}
		System.out.println("���α׷� ����");

	}

}