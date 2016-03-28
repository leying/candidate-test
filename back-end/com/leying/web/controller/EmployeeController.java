package com.leying.web.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leying.model.employee.Employee;
import com.leying.model.employee.GetEmployeeRequest;
import com.leying.model.employee.GetEmployeeResponse;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @RequestMapping(value = "/getEmployee")
    public GetEmployeeResponse getEmployees(@RequestBody GetEmployeeRequest request) {
    	System.out.println("============"+request.getEmployeeId());
    	GetEmployeeResponse response = new GetEmployeeResponse();
    	Employee em = new Employee();
    	em.setId(request.getEmployeeId());
		return response;
    }

}
