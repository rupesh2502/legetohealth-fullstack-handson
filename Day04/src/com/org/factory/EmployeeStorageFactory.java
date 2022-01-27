package com.org.factory;

import com.org.dao.EmployeeStorage;
import com.org.dao.EmployeeStorageImpl;

public class EmployeeStorageFactory {
	public static EmployeeStorage getInstance() {
		return new EmployeeStorageImpl();
	}
}
