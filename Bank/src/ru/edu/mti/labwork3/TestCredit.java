package ru.edu.mti.labwork3;

/**
 * ���� ������ ������
 * @author ����� �������
 *
 */
public class TestCredit {

	public static void main(String[] args) {
		
		System.out.println("����������� �������� ������ ������� �� ����� 10000,\n"
				+ "���������� ������ 17% �������, ������ 36 �������");
		//������� ������ �������
		Credit credit = new Credit();
		
		System.out.println("������������ ����������� ������");
		//������� ������ ������������ �������
		AnnuityPayment payment = new AnnuityPayment();
		credit.repayment(payment);
		
		System.out.println("������������ ������������������ ������ �� 1 �����");
		DifferentiatedPayment payment2 = new DifferentiatedPayment(1);
		credit.repayment(payment2);
	}

}
