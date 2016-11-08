package ru.edu.mti.labwork3;

/**
 * ����� ��������� �������� �������
 * @author ����� �������
 */
public class Credit {
	
	private double rate = 0.17; //������� ������ �� �������, �����������
	private int period = 36; //���������� �������� ������, ������
	private double amount; //����� �������
	
	//������������
	public Credit() {
		this.amount = 10000;
	}	
	
	public Credit(double rate, int period, double amount) {
		this.rate = rate;
		this.period = period;
		this.amount = amount;
	}

	//������� � �������
	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	/**
	 * ����� ��������� �������
	 * @param payment - ������ �������
	 */
	public void repayment(MonthlyPayment payment) {
		System.out.println("����� �������: " + payment.calculation(this.amount, this.period, this.rate));
		
	}
	
}
