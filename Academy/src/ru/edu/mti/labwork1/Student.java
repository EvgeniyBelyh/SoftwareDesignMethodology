package ru.edu.mti.labwork1;

/**
 * ����� �������
 * @author ����� �������
 *
 */
public class Student {
	
	private String lastName; //������� ��������
	private String firstName; //��� ��������
	private String middleName; //�������� ��������
	
	//�����������
	public Student(String lastName, String firstName, String middleName) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.middleName = middleName;
	}
	
	/**
	 * ����� ������ ���������� ����������
	 * @param notes
	 */
	public void writeNotes(String notes) {
		System.out.println("������� ���������� \"" + notes + "\"");
	}
	
	/**
	 * ����� ��������� �������� ���������� �� ������� ��������
	 * (������ �� ���������, ��������� � �.�.)
	 * @return - ���������� �� �������������
	 */
	public String speak() {
		return "������� " + this.lastName + " " + this.firstName +
				" " + this.middleName + " �������� ����������";
	}
	
	@Override
	public String toString() {
		return lastName + " " + firstName + " " + middleName;
		
	}
}
