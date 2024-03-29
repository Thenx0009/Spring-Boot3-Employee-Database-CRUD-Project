package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	//no need to write any code
	
	//add a mothod to sort by last name

	public List<Employee> findAllByOrderByLastNameAsc();
}
