package com.client.internalService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.client.internalModel.NumberModel;
import com.client.internalModel.Output;

/**
 * @author Rachana Sharma Internal Controller
 *
 */
@SpringBootApplication
@ComponentScan("com.client")
@RestController
public class InternalController {
	/**
	 * Autowiring InternalService
	 */
	@Autowired
	InternalService firstInternalService;

	public static void main(String[] args) {
		SpringApplication.run(InternalController.class, args);
	}

	/**
	 * to call Internal Service to get the value of addition
	 * 
	 * @param numberModel
	 * 
	 * @return Output
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public Output getAdditionValue(@RequestBody NumberModel numberModel) {
		return firstInternalService.add(numberModel);
	}
}
