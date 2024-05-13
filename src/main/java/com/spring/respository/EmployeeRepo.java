package com.spring.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>
{
	

}
