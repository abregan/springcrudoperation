package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entity.Employee;
import com.spring.respository.EmployeeRepo;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo er;
	public List<Employee> getAllEmployee()
	{
		return er.findAll();
		
	}
	public Employee addEmployee(Employee e)
	{
		
		return er.save(e);
	}
	public Employee getEmployeeById(int id)
	{
		
		return er.findById(id).get();
	}
	public void deleteEmployeeById(int id)
	{
		
		Employee e = er.getById(id);
        
	 er.delete(e);
	}
	

}
