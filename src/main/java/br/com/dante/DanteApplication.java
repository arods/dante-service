package br.com.dante;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DanteApplication {

	public static void main(String[] args) {
		SpringApplication.run(DanteApplication.class, args);
	}

}
