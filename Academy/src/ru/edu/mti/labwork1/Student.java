package ru.edu.mti.labwork1;

/**
 * Класс Студент
 * @author Белых Евгений
 *
 */
public class Student {
	
	private String lastName; //фамилия студента
	private String firstName; //имя студента
	private String middleName; //отчество студента
	
	//конструктор
	public Student(String lastName, String firstName, String middleName) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.middleName = middleName;
	}
	
	/**
	 * Метод записи полученной информации
	 * @param notes
	 */
	public void writeNotes(String notes) {
		System.out.println("Студент записывает \"" + notes + "\"");
	}
	
	/**
	 * Метод описывает передачу информации со стороны студента
	 * (ответы на экзаменах, семинарах и т.д.)
	 * @return - информация от преподавателя
	 */
	public String speak() {
		return "Студент " + this.lastName + " " + this.firstName +
				" " + this.middleName + " передает информацию";
	}
	
	@Override
	public String toString() {
		return lastName + " " + firstName + " " + middleName;
		
	}
}
