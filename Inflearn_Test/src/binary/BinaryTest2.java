package binary;

public class BinaryTest2 {

	public static void main(String[] args) 
	{
		int num1 = 0B00000000000000000000000000000101; // 5
		int num2 = 0B11111111111111111111111111111011; // ���� ���� 010 ������ 1�� ���������Ƿ� 011�� ���� = -5
		
		int sum = num1 + num2;
		System.out.println(num1 + "�� " + num2 + "�� ���ϸ� " + sum + "�� �ȴ�.");

	}

}