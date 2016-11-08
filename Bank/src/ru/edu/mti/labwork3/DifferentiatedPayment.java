package ru.edu.mti.labwork3;

/**
 * ������������������ ������
 * @author ����� �������
 *
 */
public class DifferentiatedPayment extends MonthlyPayment {
	
	private int periodNumber; //���������� ����� �������
	
	//�����������	
	public DifferentiatedPayment(int periodNumber) {
		this.periodNumber = periodNumber;
	}

	//������� � �������
	public int getPeriodNumber() {
		return periodNumber;
	}

	public void setPeriodNumber(int periodNumber) {
		this.periodNumber = periodNumber;
	}

	//������ ����� ������������������� �������
	@Override
	public double calculation(double creditAmount, int period, double rate) {
		rate = rate/12;
		return creditAmount/period + creditAmount * (period - this.periodNumber + 1) * rate/period;
	}

}
