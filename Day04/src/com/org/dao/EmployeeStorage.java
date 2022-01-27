package com.org.dao;

import java.util.List;

import com.org.dto.Employee;
import com.org.exceptions.EmployeeNotFoundException;

public interface EmployeeStorage {
	public int save(Employee emp);
    public Employee findEmployee(int id) throws EmployeeNotFoundException;
	public List<Employee> findEmployees();
	public void delete(int id)throws EmployeeNotFoundException;

}
