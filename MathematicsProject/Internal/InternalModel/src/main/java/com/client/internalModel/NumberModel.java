package com.client.internalModel;

import org.springframework.stereotype.Component;

/**
 * @author Rachana Sharma
 *
 */
@Component
public class NumberModel {
	/**
	 * The first number
	 */
	private int firstNumber;
	/**
	 * The Second Number
	 */
	private int secondNumber;

	/**
	 * @param firstNumber
	 * @param secondNumber
	 */
	public NumberModel(int firstNumber, int secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}

	/**
	 * empty constructor
	 */
	public NumberModel() {

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
