package ru.edu.mti.labwork1;

import java.util.ArrayList;

/**
 * ����� �������������
 * @author ����� �������
 *
 */
public class Professor {
	
	private String lastName; //������� �������������
	private String firstName; //��� �������������
	private String middleName; //�������� �������������
	private String degree; //������ ������� �������������
	
	
	//�����������
	public Professor(String lastName, String firstName, String middleName, String degree) {

		this.lastName = lastName;
		this.firstName = firstName;
		this.middleName = middleName;
		this.degree = degree;
	}

	/**
	 * ����� ��������� �������� ���������� �� ������� �������������
	 * (������ ������, ���������������� � �.�.)
	 * @return - ���������� �� �������������
	 */
	public String speak() {
		return "������������� " + this.lastName + " " + this.firstName +
				" " + this.middleName + " �������� ����������";
	}
	
	/**
	 * ����� ����������� ������ �� �����, �������� ������� � �.�.
	 * @param answer - �����
	 * @return - ������ �� 5-�� ������� �����
	 */
	public int assess(String answer) {
		//���������� ���������� ��� �������� ������
		int markValue = 2;
		//���������� ����� ������
		int answerLength = answer.length();
		//���������� ������ ������ �� ����� ������
		if(answerLength >= 10 && answerLength < 20) {
			markValue = 3;
		} else if(answerLength >= 20 && answerLength < 30) {
			markValue = 4;
		} else if(answerLength >= 30) {
			markValue = 5;
		}
		
		return markValue;
		
	}
}
