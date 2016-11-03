package ru.edu.mti.labwork1;

import java.util.ArrayList;

/**
 * Класс Преподаватель
 * @author Белых Евгений
 *
 */
public class Professor {
	
	private String lastName; //фамилия преподавателя
	private String firstName; //имя преподавателя
	private String middleName; //отчество преподавателя
	private String degree; //ученая степень преподавателя
	
	
	//конструктор
	public Professor(String lastName, String firstName, String middleName, String degree) {

		this.lastName = lastName;
		this.firstName = firstName;
		this.middleName = middleName;
		this.degree = degree;
	}

	/**
	 * Метод описывает передачу информации со стороны преподавателя
	 * (чтение лекции, консультирование и т.д.)
	 * @return - информация от преподавателя
	 */
	public String speak() {
		return "Преподаватель " + this.lastName + " " + this.firstName +
				" " + this.middleName + " передает информацию";
	}
	
	/**
	 * Метод выставления оценки за ответ, домашнее задание и т.д.
	 * @param answer - ответ
	 * @return - оценка по 5-ти бальной шкале
	 */
	public int assess(String answer) {
		//определяем переменную для хранения оценки
		int markValue = 2;
		//определяем длину ответа
		int answerLength = answer.length();
		//определяем оценку исходя из длины ответа
		if(answerLength >= 10 && answerLength < 20) {
			markValue = 3;
		} else if(answerLength >= 20 && answerLength < 30) {
			markValue = 4;
		} else if(answerLength >= 30) {
			markValue = 5;
		}
		
		return markValue;
		
	}
}
