package com.client.clientInternal;

import java.io.IOException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import com.client.externalModel.InputModel;
import com.client.externalModel.Result;

/**
 * @author Rachana Sharma Client Class
 */
public class MathematicsClient {

	@Autowired
	private RestTemplate restTemplate;

	/**
	 * to call Internal Service
	 * 
	 * @param numberModel
	 * 
	 * @return Result
	 */
	public Result client(InputModel numberModel) throws IOException {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<InputModel> entity = new HttpEntity<InputModel>(numberModel, headers);
		Result result = restTemplate.exchange("http://localhost:8084/add", HttpMethod.POST, entity, Result.class)
				.getBody();
		return result;
	}
}
