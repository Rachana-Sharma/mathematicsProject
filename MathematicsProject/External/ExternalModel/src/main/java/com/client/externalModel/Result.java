package com.client.externalModel;

/**
 * @author Rachana Sharma Model class Ouput for response
 */
public class Result {
	/**
	 * The result
	 */
	private int result;

	/**
	 * @param result
	 */
	public Result(int result) {

		this.result = result;
	}

	/**
	 * Empty Constructor
	 */
	public Result() {

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
