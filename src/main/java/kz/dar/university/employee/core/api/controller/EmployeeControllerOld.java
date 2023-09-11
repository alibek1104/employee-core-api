package kz.dar.university.employee.core.api.controller;

import kz.dar.university.employee.core.api.model.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import kz.dar.university.employee.core.api.service.deprecated.EmployeeServiceOId;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/deprecated/employee")
@RequiredArgsConstructor
public class EmployeeControllerOld {

//    HashMap<String, Employee> employees; (мы перенесли этот функционал)
//    @Autowired
//    private EmployeeService employeeService;

    private final EmployeeServiceOId employeeServiceOId;

    @PostMapping
    public void createEmployee(@RequestBody @Valid Employee employee) {
        employeeServiceOId.createEmployee(employee);
    }

    @GetMapping("/all")
    public List<Employee> getAllEmployees() {
        return employeeServiceOId.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable String id) {
        return employeeServiceOId.getEmployeeById(id);
    }

    @PutMapping("/{id}")
    public void updateEmployee(@PathVariable String id,
                               @RequestBody Employee employee) {
        employee.setEmployeeId(id);
        employeeServiceOId.updateEmployee(id, employee);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable String id) {
        employeeServiceOId.deleteEmployeeById(id);
    }

    @GetMapping("check")
    public String check() {
        return "employee-core-api is working";
    }

}
