package com.sahanbcs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
@RestController
@RequestMapping("insurence-service")
public class InsuranceProvideApplication {

	@GetMapping("/getAllPlans")
	public List<String> getAllPlans(){
		return Stream.of("Premium","Gold","Platinum").collect(Collectors.toList());
	}

	public static void main(String[] args) {
		SpringApplication.run(InsuranceProvideApplication.class, args);
	}

}
