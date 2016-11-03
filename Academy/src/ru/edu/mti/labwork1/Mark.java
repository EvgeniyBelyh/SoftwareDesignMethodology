package ru.edu.mti.labwork1;


/**
 * ����� - ������
 * @author ����� �������
 *
 */
public class Mark {
	private Student student; //�������, ���������� ������
	private Professor professor; //�������������, ����������� ������
	private String subject; //�������, �� ������� ���������� ������
	private int value; //������
	
	//����������� �� ���������
	public Mark() {
		
	}
	
	//����������� �� ����� ������
	public Mark(Student student, Professor professor, String subject, int value) {
		super();
		this.student = student;
		this.professor = professor;
		this.subject = subject;
		this.value = value;

	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	
	
}
