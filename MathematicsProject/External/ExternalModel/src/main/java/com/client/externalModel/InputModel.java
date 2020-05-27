package com.client.externalModel;

import org.springframework.stereotype.Component;

/**
 * @author Rachana Sharma InputModel class
 */
@Component
public class InputModel {
	/**
	 * The first number
	 */
	private int firstNumber;
	/**
	 * The second number
	 */
	private int secondNumber;

	/**
	 * @param firstNumber
	 * @param secondNumber
	 */
	public InputModel(int firstNumber, int secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}

	/**
	 * 
	 */
	public InputModel() {

	}

	/**
	 * @return the firstNumber
	 */
	public int getFirstNumber() {
		return firstNumber;
	}

	/**
	 * @param firstNumber the firstNumber to set
	 */
	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	/**
	 * @return the secondNumber
	 */
	public int getSecondNumber() {
		return secondNumber;
	}

	/**
	 * @param secondNumber the secondNumber to set
	 */
	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}
}
