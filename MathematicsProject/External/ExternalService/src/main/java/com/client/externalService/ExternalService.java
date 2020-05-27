package com.client.externalService;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.client.clientInternal.MathematicsClient;
import com.client.externalModel.InputModel;
import com.client.externalModel.Result;

/**
 * @author Rachana Sharma External Service
 *
 */
@Service
public class ExternalService {
	/**
	 * Autowiring MathematicsClient
	 *
	 */
	@Autowired
	MathematicsClient client;

	/**
	 * to call Client Class
	 * 
	 * @param numberModel
	 * 
	 * @return Output
	 */
	public Result getAdditionValueEservice(InputModel numberModel) throws IOException {
		return client.client(numberModel);
	}
}
