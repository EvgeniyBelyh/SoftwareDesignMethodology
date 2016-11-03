package ru.edu.mti.labwork1;

import java.util.ArrayList;

/**
 * ����� ����
 * @author ����� �������
 *
 */
public class Course {
	
	private String courseName; //�������� �����
	private ArrayList<Mark> markRegister; //������ ������ ���������
	
	//�����������
	public Course(String courseName) {
		this.courseName = courseName;
		this.markRegister = new ArrayList<Mark>();
	}
	
	/**
	 * ����� ��������� ���������� ������
	 * @param professor - ������ �������������
	 * @param students - ��������� ���������
	 */
	public void conductLection(Professor professor, ArrayList<Student> students) {
		//������������� ����� ������
		System.out.println(professor.speak());
		//�������� ������ ������
		for(Student student : students) {
			student.writeNotes(professor.speak());
		}
	}
	
	/**
	 * ����� ��������� ���������� ��������
	 * @param professor - ������ �������������
	 * @param students - ��������� ���������
	 */
	public void conductSeminar(Professor professor, ArrayList<Student> students) {
		System.out.println("������������� ������ ������");
		System.out.println("�������� ��������� ������");
	}
	
	/**
	 * ����� ��������� ���������� ���������
	 */
	public void examinations(Professor professor, ArrayList<Student> students, String subject) {
		
		int markValue = 0;
		
		//������������� ������� ������ ������� �������� � ���������� ������
		for(Student student : students) {
			//������������� ��������� ����� ��������
			markValue = professor.assess(student.speak());
			//������ ��������� � ����� ������
			this.markRegister.add(new Mark(student, professor, subject, markValue));
			System.out.println("������� " + student + " ������� ������ " + markValue + " �� ������� �� �������� " + subject);
		}
	}
	
	/**
	 * ����� ������������ ������� ������ ��������
	 * @return - ������� ������
	 */
	public float averageMark(Student student) {
		
		int markValue = 0;
		int count = 0;
		
		//������� ���������� � ����� ������ ��������
		for(Mark mark : markRegister) {
			if(mark.getStudent().equals(student)) {
				markValue = markValue + mark.getValue();
				count++;
			}
		}
		//���������� ������� ������ ��������
		return markValue/count;
		
	}
}
