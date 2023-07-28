package kz.dar.university.employee.core.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private String employeeId;
    private String name;
    private String surname;
    private String company;
    private String position;
    private String email;
    private double salary;

}
