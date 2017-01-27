package com.asg.zelalem.service.impl;


import com.asg.zelalem.domain.Employee;
import com.asg.zelalem.repository.EmployeeRepository;
import com.asg.zelalem.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> findAllEmployees() {
		return (List<Employee>) employeeRepository.findAll();
	}

	@Override
	public Employee findRoleById(int id) {
		return employeeRepository.findOne(id);
	}

	@Override
	public void saveEmployee(Employee employee) {
		employeeRepository.save(employee);

	}

	@Override
	public void deleteEmployeeById(int id) {
			employeeRepository.delete(id);
	}

	@Override
	public void update(Employee employee) {
		this.saveEmployee(employee);
	}
}
