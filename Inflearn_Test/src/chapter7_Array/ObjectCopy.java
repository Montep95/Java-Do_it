package chapter7_Array;

public class ObjectCopy { // ���� ���� ����

	public static void main(String[] args) {
		
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("�¹���1", "������");
		bookArray1[1] = new Book("�¹���2", "������");
		bookArray1[2] = new Book("�¹���3", "������");
		
	
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for(int i= 0; i < bookArray2.length; i++)
		{
			bookArray2[i].showBookInfo(); // �� ����� ���� Ȯ�� ����
		}
		
		bookArray1[0].setBookName("����");
		bookArray1[0].setAuthor("�ڿϼ�");
		
		for(int i= 0; i < bookArray1.length; i++)
		{
			bookArray1[i].showBookInfo();
		}
		
		System.out.println("=============");
		for(int i= 0; i < bookArray2.length; i++)
		{
			bookArray2[i].showBookInfo(); // bookArray1�� �����ʿ� ���� bookArray2�� �ٲ���� Ȯ�� ����.
										// ���ʿ� ����� �ּҰ��� �����ϴ� ���̱⶧���� �����Ǵ� ���� ��µȴ�.
		}
	}

}