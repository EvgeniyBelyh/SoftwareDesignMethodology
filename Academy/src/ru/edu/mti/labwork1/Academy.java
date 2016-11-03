package ru.edu.mti.labwork1;

import java.util.ArrayList;

/**
 * Класс ВУЗ
 * @author Белых Евгений
 *
 */
public class Academy {
	
	private String academyName; //наименование ВУЗа
	private String licenseNumber; //номер лицензии
	private ArrayList<Faculty> faculties; //коллекция факультетов
	
	
	
	//конструктор по умолчанию
	public Academy() {
		this.academyName = "МТИ";
		this.licenseNumber = "1042";
		this.faculties = new ArrayList<Faculty>();
	}
	
	/**
	 * Метода создания нового факльтета
	 * @param faculty - новый факультет
	 */
	public void addFaculty(Faculty faculty) {
		this.faculties.add(faculty);
	}
	
}
