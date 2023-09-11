package kz.dar.university.employee.core.api.controller;

import kz.dar.university.employee.core.api.model.EmployeeRequest;
import kz.dar.university.employee.core.api.model.EmployeeResponse;
import kz.dar.university.employee.core.api.service.employee.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public EmployeeResponse createEmployee(@RequestBody EmployeeRequest employeeRequest) {
        return employeeService.createEmployee(employeeRequest);
    }
    @PutMapping
    public EmployeeResponse updateEmployee(@RequestParam String employeeId, @RequestBody EmployeeRequest employeeRequest) {
        employeeRequest.setEmployeeId(employeeId);
        return employeeService.updateEmployee(employeeRequest);
    }
    @GetMapping
    public EmployeeResponse getEmployeeById(@RequestParam String employeeId) {
        return employeeService.getEmployeeById(employeeId);
    }
    @GetMapping("/all")
    public List<EmployeeResponse> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
    @DeleteMapping
    public void deleteEmployeeById(@RequestParam String employeeId) {
        employeeService.deleteEmployeeById(employeeId);
    }
}
