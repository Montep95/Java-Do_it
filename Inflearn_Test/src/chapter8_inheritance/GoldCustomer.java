package chapter8_inheritance;

public class GoldCustomer extends Customer
{
	double saleRatio; // ��ó�� �׳� ���� ������ش�.
	
	public GoldCustomer(int customerID, String customerName)
	{
		super(customerID, customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		// saleRatio�� VIPCustomer�� ���������� ���� ����� �ǰԵǸ� ����������.
		
	}

	@Override
	public int calcPrice(int price)
	{
		bonusPoint += price * bonusRatio;	
		return price - (int)(price * saleRatio);
	}
	
	
}