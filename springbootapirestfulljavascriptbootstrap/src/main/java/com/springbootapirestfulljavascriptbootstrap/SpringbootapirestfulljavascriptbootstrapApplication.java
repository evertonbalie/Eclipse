package com.springbootapirestfulljavascriptbootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan(basePackages= {"com.*"})
@EnableJpaRepositories(basePackages = {"com.repository"})
@EnableTransactionManagement
@RestController
@SpringBootApplication
@EntityScan(basePackages ={"com.model"})
public class SpringbootapirestfulljavascriptbootstrapApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootapirestfulljavascriptbootstrapApplication.class, args);
	}

}
