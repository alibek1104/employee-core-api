package kz.dar.university.employee.core.api.service;

import kz.dar.university.employee.core.api.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    HashMap<String, Employee> employees = new HashMap<>();

    @Override
    public void createEmployee(Employee employee) {
        employee.setEmployeeId(UUID.randomUUID().toString());
        employees.put(employee.getEmployeeId(), employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employees.values());
    }

    @Override
    public Employee getEmployeeById(String id) {
        return employees.get(id);
    }

    @Override
    public void updateEmployee(String id, Employee employee) {
        String employeeId = employee.getEmployeeId();
        if (employees.containsKey(employeeId)) {
            employees.put(employee.getEmployeeId(), employee);
        }
    }

    @Override
    public void deleteEmployeeById(String id) {
        employees.remove(id);
    }
}
