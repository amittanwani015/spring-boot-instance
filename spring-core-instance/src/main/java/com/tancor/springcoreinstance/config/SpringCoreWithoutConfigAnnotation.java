package com.tancor.springcoreinstance.config;

import org.springframework.context.annotation.Bean;

import com.tancor.springcoreinstance.domain.Department;
import com.tancor.springcoreinstance.domain.Employee;

/**
 * 
 * Bean methods may be declared in a @Component class or even in a plain old class. 
 * In such cases, a @Bean method will get processed in a so-called 'lite' mode. 
 * 
 * Bean method in the lite mode would be treated as plain factory methods,
 * thus if another bean method is called by a particular would result in creation
 * of new object.  
 * 
 * @author amitt
 *
 */
public class SpringCoreWithoutConfigAnnotation {

	@Bean("employee")
	public Employee employee() {
		return new Employee("Amit", "Chittorgarh");
	}

	@Bean("department")
	public Department department() {
		return new Department(employee());
	}
}
