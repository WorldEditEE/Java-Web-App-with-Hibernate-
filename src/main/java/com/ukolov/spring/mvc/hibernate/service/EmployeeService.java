package com.ukolov.spring.mvc.hibernate.service;

import com.ukolov.spring.mvc.hibernate.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

}
