package com.java.springboot.data;

import com.java.springboot.model.Department;
import com.java.springboot.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Repository("employeeDao")
public class EmployeeDataAccessService implements EmployeeDao {

    private static List<Department> db2 = new ArrayList<>();

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public EmployeeDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insertEmployee(Employee employee) {
        String insertQuery = "insert into Employee(jobTitleName, firstName, lastName, phoneNumber, emailAddress) values (?,?,?,?,?)";
        jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, employee.getJobTitleName());
            ps.setString(2, employee.getFirstName());
            ps.setString(3, employee.getLastName());
            ps.setString(4, employee.getPhoneNumber());
            ps.setString(5, employee.getEmailAddress());

            return ps;
        });
        return 1;
    }

    @Override
    public int insertDepartment(Department department) {
        String insertQuery = "insert into Department(deptName, phoneNumber, emailAddress) values (?,?,?)";
        jdbcTemplate.update(connection -> {
           PreparedStatement ps = connection.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS);
           ps.setString(1, department.getDeptName());
           ps.setString(2, department.getPhoneNumber());
            ps.setString(3, department.getEmailAddress());

            return ps;
        });
        return 1;
    }

    @Override
    public List<Employee> selectAllEmployee() {
        String sql = "select * from Employee";
        List<Employee> query = jdbcTemplate.query(sql, (resultSet, i) -> new Employee(Integer.parseInt(resultSet.getString(1)), resultSet.getString(2),
                resultSet.getString(3), resultSet.getString(4),
                resultSet.getString(5), resultSet.getString(6)));

        return query;
    }
    @Override
    public List<Department> selectAllDepartment() {
        String sql = "select * from Department";
        List<Department> query = jdbcTemplate.query(sql, (resultSet, i) -> new Department(Integer.parseInt(resultSet.getString(1)), resultSet.getString(2),
                                                    resultSet.getString(3), resultSet.getString(4)));
        return query;
    }

    @Override
    public List<Employee> selectEmployee(int userId) {
        String sql = "select * from Employee where userId="+userId;
        List<Employee> query = jdbcTemplate.query(sql, (resultSet, i) -> new Employee(Integer.parseInt(resultSet.getString(1)), resultSet.getString(2),
                resultSet.getString(3), resultSet.getString(4),
                resultSet.getString(5), resultSet.getString(6)));
        return query;
    }

    @Override
    public List<Department> selectDepartment(int deptId) {
        String sql = "select * from Department where deptId="+deptId;
        List<Department> query = jdbcTemplate.query(sql, (resultSet, i) -> new Department(Integer.parseInt(resultSet.getString(1)), resultSet.getString(2),
                resultSet.getString(3), resultSet.getString(4)));
        return query;
    }
}
