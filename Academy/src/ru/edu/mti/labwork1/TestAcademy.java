package ru.edu.mti.labwork1;

import java.util.ArrayList;

/**
 * ����� ����� ������ ��������
 * @author ����� �������
 *
 */
public class TestAcademy {
	
	public static void main(String[] args) {
		//������� �������� �����
		System.out.println("������� ������ ����");
		Academy academy = new Academy(); 
		
		System.out.println("������� ����� ���������");
		Faculty faculty = new Faculty("������� � ������");
		
		System.out.println("������� ������ �������������");
		Professor professor = new Professor("������","����������","������������","������ ������������� ����");
		
		System.out.println("������� ������ ��������");
		Student student = new Student("�������","������","���������");
		
		System.out.println("��������� �������� � ������");
		ArrayList<Student> group = new ArrayList<Student>();
		group.add(student);
		
		System.out.println("��������� �������� �� ���������");
		faculty.addStudent(student);
		
		System.out.println("�������� ������������� �� ���������");
		faculty.addProfessor(professor);
		
		System.out.println("������� ����� ����");
		Course course = new Course("���������� ����");
		
		System.out.println("��������� ���� �� ���������");
		faculty.addCourse(course);
		
		System.out.println("��������� ��������� � ���");
		academy.addFaculty(faculty);
		
		System.out.println("�������� ������");
		course.conductLection(professor, group);
		
		System.out.println("�������� �������");
		course.conductSeminar(professor, group);
		
		System.out.println("�������� �������");
		course.examinations(professor, group, "���������� ����������");
		
		System.out.println("��������� ������������ ���������");
		faculty.expelStudents();
	}
}
