package kz.dar.university.employee.core.api.controller;

import kz.dar.university.employee.core.api.model.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import kz.dar.university.employee.core.api.service.EmployeeService;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeController {

//    HashMap<String, Employee> employees; (мы перенесли этот функционал)
//    @Autowired
//    private EmployeeService employeeService;

    private final EmployeeService employeeService;

    @PostMapping
    public void createEmployee(@RequestBody @Valid Employee employee) {
        employeeService.createEmployee(employee);
    }

    @GetMapping("/all")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable String id) {
        return employeeService.getEmployeeById(id);
    }

    @PutMapping("/{id}")
    public void updateEmployee(@PathVariable String id,
                               @RequestBody Employee employee) {
        employee.setEmployeeId(id);
        employeeService.updateEmployee(id, employee);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable String id) {
        employeeService.deleteEmployeeById(id);
    }

    @GetMapping("check")
    public String check() {
        return "employee-core-api is working";
    }

}
