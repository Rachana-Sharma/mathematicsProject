package com.client.externalService;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.client.clientInternal.MathematicsClient;
import com.client.externalModel.InputModel;
import com.client.externalModel.Result;

/**
 * @author Rachana Sharma External Controller
 *
 */
@SpringBootApplication
@ComponentScan("com.client")
@RestController
public class ExternalController {
	/**
	 * Autowiring ExternalService
	 *
	 */
	@Autowired
	ExternalService externalService;
	/**
	 * Autowiring RestTemplate
	 *
	 */
	@Autowired
	RestTemplate getRestTemplate;
	/**
	 * Autowiring MathematicsClient
	 *
	 */
	@Autowired
	MathematicsClient getClient;

	/**
	 * Main method
	 *
	 */
	public static void main(String[] args) throws IOException {
		SpringApplication.run(ExternalController.class, args);
	}

	/**
	 * calling getAdditionValueEservice of external service
	 * 
	 * @param numberModel
	 * 
	 * @return Output
	 */
	@RequestMapping(value = "/addition", method = RequestMethod.POST)
	public Result getAdditionValueEcontroller(@RequestBody InputModel numberModel) throws IOException {
		return externalService.getAdditionValueEservice(numberModel);
	}
}
