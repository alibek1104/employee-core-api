package kz.dar.university.employee.core.api.service.deprecated;

import kz.dar.university.employee.core.api.model.Employee;

import java.util.List;

public interface EmployeeServiceOId {
    void createEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(String id);

    void updateEmployee(String id, Employee employee);

    void deleteEmployeeById(String id);
}
