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
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	/**
	 * bean for Client
	 */
	@Bean
	public MathematicsClient getClient() {
		return new MathematicsClient();
	}

	/**
	 * bean for External Service
	 */
	public ExternalService getExternalService() {
		return new ExternalService();
	}
}
