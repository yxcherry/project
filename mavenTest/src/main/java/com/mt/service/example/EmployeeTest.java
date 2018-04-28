package com.mt.service.example;

import java.util.Arrays;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee[] employees = new Employee[3];
		employees[0] = new Employee("hery", 3000);
		employees[1] = new Employee("tom", 5000);
		employees[2] = new Employee("jack",8000);
		Arrays.sort(employees);
		for(Employee employee : employees) {
			System.out.println(employee.getName());
		}
	}

}
