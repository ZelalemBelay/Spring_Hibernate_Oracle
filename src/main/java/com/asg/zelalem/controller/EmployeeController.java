package com.asg.zelalem.controller;

import com.asg.zelalem.domain.Employee;
import com.asg.zelalem.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;

  @RequestMapping("/")
    public String redirectRoot() {
        return "redirect:/employees";
    }

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public String getAll(Model model) {

        model.addAttribute("employees", employeeService.findAllEmployees());
        return "employeeList";
    }

    @RequestMapping(value = "/addEmployee", method = RequestMethod.GET)
    public String addemp() {

        return "addEmployee";
    }

    @RequestMapping(value = "/employees", method = RequestMethod.POST)
    public String add(Employee employee) {
        employeeService.saveEmployee(employee);
        return "redirect:/employees";
    }

    @RequestMapping(value = "/employees/{id}", method = RequestMethod.GET)
    public String get(@PathVariable int id, Model model) {
        model.addAttribute("employee", employeeService.findRoleById(id));
        return "employeeDetail";
    }

    @RequestMapping(value = "/employees/{id}", method = RequestMethod.POST)
    public String update(Employee employee) {
        employeeService.update(employee);
        return "redirect:/employees";
    }

    @RequestMapping(value = "/employees/delete", method = RequestMethod.POST)
    public String delete(int employeeId) {
        employeeService.deleteEmployeeById(employeeId);
        return "redirect:/employees";
    }

    @RequestMapping(value = "/testedi", method = RequestMethod.GET)
    public String testedi()
    {

//        ArrayList<String> transData = new MyTalendJob().runInsideOfTOS(this).getAllData();
        return "redirect:/employees";
    }

}