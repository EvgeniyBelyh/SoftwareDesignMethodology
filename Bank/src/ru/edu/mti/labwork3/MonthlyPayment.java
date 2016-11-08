package ru.edu.mti.labwork3;

/**
 * ����� ��������� �������� ������������ �������
 * @author ����� �������
 *
 */
public abstract class MonthlyPayment {
	/**
	 * ������������ ����������� ������
	 * @param creditAmount - ����� �������
	 * @param period - ���������� �������� ������
	 * @param rate - ������ �� �������
	 * @return - ����� ������������ �������
	 */
	public abstract double calculation(double creditAmount, int period, double rate);
}
