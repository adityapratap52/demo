package com.java.springboot.service;

import com.java.springboot.data.EmployeeDao;
import com.java.springboot.model.Department;
import com.java.springboot.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeDao employeeDao;

    @Autowired
    public EmployeeService(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public int addEmployee(Employee employee) {
        return employeeDao.insertEmployee(employee);
    }

    public int addDepartment(Department department) {
        return employeeDao.insertDepartment(department);
    }

    public List<Employee> getAllEmployee() {
        return employeeDao.selectAllEmployee();
    }

    public List<Department> getAllDepartment() {
        return employeeDao.selectAllDepartment();
    }

    public List<Employee> getEmployee(int userId){
        return employeeDao.selectEmployee(userId);
    }

    public List<Department> getDepartment(int deptId){
        return employeeDao.selectDepartment(deptId);
    }
}
