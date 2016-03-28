package com.leying.model.employee;

import com.leying.model.Response;

public class GetEmployeeResponse extends Response{
	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee em) {
		this.employee = em;
	}
	
}
