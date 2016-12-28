package com.ws;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import hello.wsdl.GetCityForecastByZIPResponse;

@SpringBootApplication
public class SpringBootWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWsApplication.class, args);

	}

	@Bean
	CommandLineRunner lookup(WeatherClient weatherClient) {
		return args -> {
			String zipCode = "94304";

			if (args.length > 0) {
				zipCode = args[0];
			}
			GetCityForecastByZIPResponse response = weatherClient.getCityForecastByZip(zipCode);
			weatherClient.printResponse(response);
		};
	}
}
