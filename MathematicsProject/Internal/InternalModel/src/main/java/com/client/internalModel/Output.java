package com.client.internalModel;

/**
 * @author Rachana Sharma Output Class for response
 */
public class Output {
	/**
	 * The Result
	 */
	private int result;

	/**
	 * @param result
	 */
	public Output(int result) {

		this.result = result;
	}

	/**
	 * empty constructor
	 */
	public Output() {

	}

	/**
	 * @return the result
	 */
	public int getResult() {
		return result;
	}

	/**
	 * @param result the result to set
	 */
	public void setResult(int result) {
		this.result = result;
	}
}
