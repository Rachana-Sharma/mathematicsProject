package com.client.internalService;

import org.springframework.stereotype.Service;
import com.client.internalModel.NumberModel;
import com.client.internalModel.Output;

/**
 * @author Rachana Sharma Internal Service
 */
@Service
public class InternalService {

	/**
	 * Creating object of Ouput Class
	 */
	Output output = new Output();

	/**
	 * Adding two numbers
	 * 
	 * @param numberModel
	 * @return Output
	 */
	public Output add(NumberModel numberModel) {
		int number1 = numberModel.getFirstNumber();
		int number2 = numberModel.getSecondNumber();
		int number3 = number1 + number2;
		output.setResult(number3);
		return output;
	}
}
