package com.asg.zelalem.service;

import com.asg.zelalem.domain.Employee;

public interface IEmployeeService
{
	public Iterable<Employee> findAllEmployees();
	public Employee findRoleById(int id);
	public void saveEmployee(Employee role);
	public void deleteEmployeeById(int id);
	void update(Employee employee);
}
