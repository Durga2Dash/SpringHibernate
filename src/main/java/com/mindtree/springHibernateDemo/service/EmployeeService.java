package com.mindtree.springHibernateDemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.springHibernateDemo.entity.Employee;

@Service
public interface EmployeeService {
	public String create(Employee employee);

	public int update(Employee employee);

	public Employee read(int id);

	public int delete(int id);

	public List<Employee> getAllEmployee();

}
