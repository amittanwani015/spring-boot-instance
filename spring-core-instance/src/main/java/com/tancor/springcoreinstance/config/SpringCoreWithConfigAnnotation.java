package com.tancor.springcoreinstance.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tancor.springcoreinstance.domain.Department;
import com.tancor.springcoreinstance.domain.Employee;


/**
 * 
 * Beans declared in the class with annotation @Configuration, 
 * can refer to other beans directly by calling respective bean methods.
 * 
 * Calling bean would get a singleton instance reference(shared reference), 
 * which means no new instance would be created.
 *  
 * Configuration class are method are not allowed to declare final,
 * because with configuration class beans are proxied in order to enforce bean life cycle behavior. 
 *   
 * This feature  requires method interception, implemented through a runtime-generated CGLIB subclass.
 *  
 * @author amitt
 *
 */

@Configuration
public class SpringCoreWithConfigAnnotation {

	@Bean("employee")
	public Employee employee() {
		return new Employee("Amit", "Chittorgarh");
	}

	@Bean("department")
	public Department department() {
		return new Department(employee());
	}
}
