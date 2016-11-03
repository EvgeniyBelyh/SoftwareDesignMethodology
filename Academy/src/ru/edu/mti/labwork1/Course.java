package ru.edu.mti.labwork1;

import java.util.ArrayList;

/**
 * Класс курс
 * @author Белых Евгений
 *
 */
public class Course {
	
	private String courseName; //название курса
	private ArrayList<Mark> markRegister; //журнал оценок студентов
	
	//конструктор
	public Course(String courseName) {
		this.courseName = courseName;
		this.markRegister = new ArrayList<Mark>();
	}
	
	/**
	 * Метод описывает проведение лекции
	 * @param professor - объект преподаватель
	 * @param students - коллекция студентов
	 */
	public void conductLection(Professor professor, ArrayList<Student> students) {
		//преподаватель ведет лекцию
		System.out.println(professor.speak());
		//студенты делают записи
		for(Student student : students) {
			student.writeNotes(professor.speak());
		}
	}
	
	/**
	 * Метод описывает проведение семинара
	 * @param professor - объект преподаватель
	 * @param students - коллекция студентов
	 */
	public void conductSeminar(Professor professor, ArrayList<Student> students) {
		System.out.println("Преподаватель зедает заданя");
		System.out.println("Студенты выполняют заданя");
	}
	
	/**
	 * Метод описывает проведение экзаменов
	 */
	public void examinations(Professor professor, ArrayList<Student> students, String subject) {
		
		int markValue = 0;
		
		//преподаватель слушает ответы каждого студента и выставляет оценку
		for(Student student : students) {
			//преподаватель оценивает ответ студента
			markValue = professor.assess(student.speak());
			//оценка заносится в общий журнал
			this.markRegister.add(new Mark(student, professor, subject, markValue));
			System.out.println("Студент " + student + " получил оценку " + markValue + " за экзамен по предмету " + subject);
		}
	}
	
	/**
	 * Метод рассчитывает среднюю оценку студента
	 * @return - средняя оценка
	 */
	public float averageMark(Student student) {
		
		int markValue = 0;
		int count = 0;
		
		//считаем количество и сумму оценок студента
		for(Mark mark : markRegister) {
			if(mark.getStudent().equals(student)) {
				markValue = markValue + mark.getValue();
				count++;
			}
		}
		//возвращаем среднюю оценку студента
		return markValue/count;
		
	}
}
