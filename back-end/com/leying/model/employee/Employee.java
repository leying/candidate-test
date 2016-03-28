package com.leying.model.employee;

import java.io.Serializable;
import java.util.List;

public class Employee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2388463258698051402L;
	private String id;
	private String name;
	private String status;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
