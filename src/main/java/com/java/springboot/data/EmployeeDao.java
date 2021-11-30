package com.java.springboot.data;

import com.java.springboot.model.Department;
import com.java.springboot.model.Employee;

import java.util.List;

public interface EmployeeDao {
    int insertEmployee(Employee employee);

    int insertDepartment(Department department);

    List<Employee> selectAllEmployee();

    List<Department> selectAllDepartment();

    List<Employee> selectEmployee(int userId);

    List<Department> selectDepartment(int deptId);
}
