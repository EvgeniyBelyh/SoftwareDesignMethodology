package ru.edu.mti.labwork1;

import java.util.ArrayList;

/**
 * Класс факультет
 * @author Белых Евгений
 *
 */
public class Faculty {
	
	private String facultyName; //название факультета
	private ArrayList<Course> courses; //
	private ArrayList<Student> students; //коллекция студентов на курсе
	private ArrayList<Professor> professors; //коллекция преподавателей на курсе

	public Faculty(String facultyName) {
		this.facultyName = facultyName;
		this.students = new ArrayList<Student>();
		this.professors = new ArrayList<Professor>();
		this.courses = new ArrayList<Course>();
	}
	
	/**
	 * Метода добавления нового курса
	 * @param course - новый курс
	 */
	public void addCourse(Course course) {
		this.courses.add(course);
	}
	
	/**
	 * Метод добавления студента
	 * @param student - новый студент
	 */
	public void addStudent(Student student) {
		this.students.add(student);
	}
	
	/**
	 * Метод добавления преподавателя
	 * @param professor - новый преподаватель
	 */
	public void addProfessor(Professor professor) {
		this.professors.add(professor);
	}
	
	/**
	 * Метод отчисления неуспевающих студентов
	 */
	public void expelStudents() {
		
		float averageMark = 0; // средняя оценка
		int count = 0; //количество отчисленных студентов
		
		//идем по всем курсам
		for(Course course : courses) {
			//обходим всех студентов
			for(Student student : students) {
				averageMark = course.averageMark(student);
				//если средняя оценка студента ниже 3 балов, то отчисляем
				if(averageMark < 3) {
					students.remove(student);
					count++;
				}
			}
		}
		System.out.println("Отчислено " + count + " студентов");
	}
}
