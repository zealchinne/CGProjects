package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.entity.Employee;
import com.example.repository.EmployeeRepository;

@SpringBootApplication
public class Spring3rdpartyapiApplication implements CommandLineRunner {
	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(Spring3rdpartyapiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee e = Employee.builder().id(1).first_name("Sebastian").last_name("Eschweiler")
				.email("sebastian@codingthesmartway.com").build();
		Employee e2 = Employee.builder().id(2).first_name("Steve").last_name("Palmer")
				.email("steve@codingthesmartway.com").build();
		Employee e3 = Employee.builder().id(3).first_name("Ann").last_name("Smith").email("ann@codingthesmartway.com")
				.build();
		employeeRepository.save(e);
		employeeRepository.save(e2);
		employeeRepository.save(e3);
		System.out.println("-------------------all saved----------------");

	}

}
