package com.ukolov.spring.mvc.hibernate.dao;

import com.ukolov.spring.mvc.hibernate.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);
}
