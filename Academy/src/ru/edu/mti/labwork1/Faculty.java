package ru.edu.mti.labwork1;

import java.util.ArrayList;

/**
 * ����� ���������
 * @author ����� �������
 *
 */
public class Faculty {
	
	private String facultyName; //�������� ����������
	private ArrayList<Course> courses; //
	private ArrayList<Student> students; //��������� ��������� �� �����
	private ArrayList<Professor> professors; //��������� �������������� �� �����

	public Faculty(String facultyName) {
		this.facultyName = facultyName;
		this.students = new ArrayList<Student>();
		this.professors = new ArrayList<Professor>();
		this.courses = new ArrayList<Course>();
	}
	
	/**
	 * ������ ���������� ������ �����
	 * @param course - ����� ����
	 */
	public void addCourse(Course course) {
		this.courses.add(course);
	}
	
	/**
	 * ����� ���������� ��������
	 * @param student - ����� �������
	 */
	public void addStudent(Student student) {
		this.students.add(student);
	}
	
	/**
	 * ����� ���������� �������������
	 * @param professor - ����� �������������
	 */
	public void addProfessor(Professor professor) {
		this.professors.add(professor);
	}
	
	/**
	 * ����� ���������� ������������ ���������
	 */
	public void expelStudents() {
		
		float averageMark = 0; // ������� ������
		int count = 0; //���������� ����������� ���������
		
		//���� �� ���� ������
		for(Course course : courses) {
			//������� ���� ���������
			for(Student student : students) {
				averageMark = course.averageMark(student);
				//���� ������� ������ �������� ���� 3 �����, �� ���������
				if(averageMark < 3) {
					students.remove(student);
					count++;
				}
			}
		}
		System.out.println("��������� " + count + " ���������");
	}
}
