package com.java.springboot.api;

import com.java.springboot.model.Department;
import com.java.springboot.model.Employee;
import com.java.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/")
@RestController
public class EmployeeController {
    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("employee")
    public void addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
    }

    @PostMapping("department")
    public void addDepartment(@RequestBody Department department) {
        employeeService.addDepartment(department);
    }

    @GetMapping("employee")
    public List<Employee> getAllEmployee() {
        return employeeService.getAllEmployee();
    }

    @GetMapping("department")
    public List<Department> getAllDepartment() {
        return employeeService.getAllDepartment();
    }

    @GetMapping("employee/{userId}")
    public List<Employee> getEmployee(@PathVariable("userId") int userId){
        return employeeService.getEmployee(userId);
    }

    @GetMapping("department/{deptId}")
    public List<Department> getDepartment(@PathVariable("deptId") int deptId){
        return employeeService.getDepartment(deptId);
    }
}
