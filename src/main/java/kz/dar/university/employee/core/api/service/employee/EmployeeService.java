package kz.dar.university.employee.core.api.service.employee;

import kz.dar.university.employee.core.api.model.EmployeeRequest;
import kz.dar.university.employee.core.api.model.EmployeeResponse;

import java.util.List;

public interface EmployeeService {
    EmployeeResponse createEmployee(EmployeeRequest employeeRequest);
    EmployeeResponse updateEmployee(EmployeeRequest employeeRequest);
    EmployeeResponse getEmployeeById(String employeeId);
    List<EmployeeResponse> getAllEmployees();
    void deleteEmployeeById(String employeeId);
}
