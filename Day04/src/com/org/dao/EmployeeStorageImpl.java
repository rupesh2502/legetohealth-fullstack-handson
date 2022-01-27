package com.org.dao;

import java.util.ArrayList;
import java.util.List;

import com.org.dto.Employee;
import com.org.exceptions.EmployeeNotFoundException;

public class EmployeeStorageImpl implements EmployeeStorage{
    List<Employee> listEmp = new ArrayList<Employee>();
	@ Override
	public int save(Employee emp) {
		listEmp.add(emp);
		return emp.getId();
	}

	@Override
	public Employee findEmployee(int id) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findEmployees() {
		return listEmp;
	}

	@Override
	public void delete(int id) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		
	}

}
