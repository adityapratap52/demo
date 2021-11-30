//package com.java.springboot.api;
//
//import com.java.springboot.model.Department;
//import com.java.springboot.model.Employee;
//import com.java.springboot.service.EmployeeService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RequestMapping("api/v1/department")
//@RestController
//public class DepartmentController {
//    private final EmployeeService employeeService;
//
//    @Autowired
//    public DepartmentController(EmployeeService employeeService) {
//        this.employeeService = employeeService;
//    }
//
////    @PostMapping("employee")
////    public void addEmployee(@RequestBody Employee employee) {
////        employeeService.addEmployee(employee);
////    }
//
//    @PostMapping()
//    public void addDepartment(@RequestBody Department department) {
//        employeeService.addDepartment(department);
//    }
//
////    @GetMapping("employee")
////    public List<Employee> getAllEmployee() {
////        return employeeService.getAllEmployee();
////    }
//
//    @GetMapping()
//    public List<Department> getAllDepartment() {
//        return employeeService.getAllDepartment();
//    }
//}
