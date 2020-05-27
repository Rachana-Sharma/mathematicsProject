package com.client.externalService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.client.clientInternal.MathematicsClient;

/**
 * @author Rachana Sharma Configuration Class
 */
@Configuration
public class ConfigurationClass {
	/**
	 * bean for RestTemplate
	 */
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	/**
	 * bean for Client
	 */
	@Bean
	public MathematicsClient client() {
		return new MathematicsClient();
	}

	/**
	 * bean for External Service
	 */
	public ExternalService externalService() {
		return new ExternalService();
	}
}
