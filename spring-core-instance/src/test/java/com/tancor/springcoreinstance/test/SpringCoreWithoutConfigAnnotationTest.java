package com.tancor.springcoreinstance.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tancor.springcoreinstance.config.SpringCoreWithoutConfigAnnotation;
import com.tancor.springcoreinstance.domain.Department;
import com.tancor.springcoreinstance.domain.Employee;

public class SpringCoreWithoutConfigAnnotationTest {

	@Test
	public void withoutConfigurationAnnotation() {

		AnnotationConfigApplicationContext context=null;

		try {

			context=new AnnotationConfigApplicationContext(SpringCoreWithoutConfigAnnotation.class);

			Employee employee = (Employee) context.getBean("employee");
			Department department = (Department) context.getBean("department");

			System.out.println(String.format("EMPLOYEE HASHCODE : %s", employee.hashCode()));
			System.out.println(String.format("DEPARTMENT::EMPLOYEE HASHCODE : %s", department.getEmployee()
					.hashCode()));

			assertTrue(!employee.equals(department.getEmployee()));

		}catch (Exception e) {

			System.out.println(e);
			throw e;			

		}finally {
			context.close();
		}	

	}

}
