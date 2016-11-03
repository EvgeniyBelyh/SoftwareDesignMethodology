package ru.edu.mti.labwork1;

import java.util.ArrayList;

/**
 * Класс теста работы академии
 * @author Белых Евгений
 *
 */
public class TestAcademy {
	
	public static void main(String[] args) {
		//создаем тестовую среду
		System.out.println("Создаем объект ВУЗа");
		Academy academy = new Academy(); 
		
		System.out.println("Создаем новый факультет");
		Faculty faculty = new Faculty("Финансы и кредит");
		
		System.out.println("Создаем объект преподавателя");
		Professor professor = new Professor("Петров","Константин","Владимирович","Доктор экономических наук");
		
		System.out.println("Создаем объект студента");
		Student student = new Student("Сидоров","Дмитрй","Сергеевич");
		
		System.out.println("Добавляем студента в группу");
		ArrayList<Student> group = new ArrayList<Student>();
		group.add(student);
		
		System.out.println("Зачисляем студента на факультет");
		faculty.addStudent(student);
		
		System.out.println("Нанимаем преподавателя на факультет");
		faculty.addProfessor(professor);
		
		System.out.println("Создаем новый курс");
		Course course = new Course("Банковское дело");
		
		System.out.println("Добавляем курс на факультет");
		faculty.addCourse(course);
		
		System.out.println("Добавляем факультет в ВУЗ");
		academy.addFaculty(faculty);
		
		System.out.println("Проводим лекцию");
		course.conductLection(professor, group);
		
		System.out.println("Проводим семинар");
		course.conductSeminar(professor, group);
		
		System.out.println("Проводим экзамен");
		course.examinations(professor, group, "Финансовый менеджмент");
		
		System.out.println("Отчисляем неуспевающих студентов");
		faculty.expelStudents();
	}
}
