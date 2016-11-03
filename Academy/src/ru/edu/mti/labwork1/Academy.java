package ru.edu.mti.labwork1;

import java.util.ArrayList;

/**
 * ����� ���
 * @author ����� �������
 *
 */
public class Academy {
	
	private String academyName; //������������ ����
	private String licenseNumber; //����� ��������
	private ArrayList<Faculty> faculties; //��������� �����������
	
	
	
	//����������� �� ���������
	public Academy() {
		this.academyName = "���";
		this.licenseNumber = "1042";
		this.faculties = new ArrayList<Faculty>();
	}
	
	/**
	 * ������ �������� ������ ���������
	 * @param faculty - ����� ���������
	 */
	public void addFaculty(Faculty faculty) {
		this.faculties.add(faculty);
	}
	
}
