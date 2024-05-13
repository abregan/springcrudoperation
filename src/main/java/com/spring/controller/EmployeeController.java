package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entity.Employee;
import com.spring.service.EmployeeService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/emp")
public class EmployeeController {
	
	@Autowired
	private EmployeeService es;
	@GetMapping("/employee")
    public List<Employee> getEmployee()
	{
        return es.getAllEmployee();
    }
	@PostMapping("/addEmployee")

	public Employee addEmployee(@RequestBody @Valid Employee e) 
	{
	    return es.addEmployee(e);
	}
	@GetMapping("/employee/{id}")
	public Employee getEmployeebyid(@PathVariable int id)
	{
		return es.getEmployeeById(id);

	}
	@DeleteMapping("/deleteemployee/{id}")
	
	public void deleteEmployeebyid(@PathVariable int id)
	{
		 es.deleteEmployeeById(id);

	}

	

}
