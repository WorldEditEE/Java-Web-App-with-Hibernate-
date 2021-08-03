package com.ukolov.spring.mvc.hibernate.dao;

import com.ukolov.spring.mvc.hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Employee> getAllEmployees() {

        Session session = sessionFactory.getCurrentSession();

        List<Employee> employeeList = session.createQuery("from Employee ", Employee.class).getResultList();

        return employeeList;
    }

    @Override
    public void saveEmployee(Employee employee) {

        Session session =  sessionFactory.getCurrentSession();
        session.save(employee);

    }
}
