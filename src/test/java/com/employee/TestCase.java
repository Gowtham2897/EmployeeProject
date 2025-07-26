package com.employee;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import com.employee.empController.EmployeeController;
import com.employee.empEntity.Employee;
import com.employee.empService.EmployeeService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class TestCase {

	@InjectMocks
	private EmployeeController employeeController;

	@Mock
	private EmployeeService employeeService;

	private Employee emp1;
	private Employee emp2;

	@BeforeEach
	void setUp() {
		MockitoAnnotations.openMocks(this);

		emp1 = new Employee();
		emp1.setId(4);
		emp1.setName("Raghu");
		emp1.setRole("Senior");
		emp1.setSalary(35000);

		emp2 = new Employee();
		emp2.setId(5);
		emp2.setName("Raman");
		emp2.setRole("Trainee");
		emp2.setSalary(25000);
	}

	@Test
	void testGetAllObj() {
		List<Employee> mockList = Arrays.asList(emp1, emp2);

		when(employeeService.getObject()).thenReturn(mockList);

		List<Employee> result = employeeController.getObject();

		assertEquals(2, result.size());
		assertEquals("Raghu", result.get(0).getName());
		assertEquals("Raman", result.get(1).getName());
	}
	
}