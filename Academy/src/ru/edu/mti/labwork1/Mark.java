package ru.edu.mti.labwork1;


/**
 * Класс - оценка
 * @author Белых Евгений
 *
 */
public class Mark {
	private Student student; //студент, получивший оценку
	private Professor professor; //преподаватель, выставивший оценку
	private String subject; //предмет, за который выставлена оценка
	private int value; //оценка
	
	//конструктор по умолчанию
	public Mark() {
		
	}
	
	//конструктор со всеми полями
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
