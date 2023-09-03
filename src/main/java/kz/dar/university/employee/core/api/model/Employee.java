package kz.dar.university.employee.core.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private String employeeId;
    @Size(min = 2, max = 10, message = "Name must be in range 2-10")
    private String name;
    @Size(min = 2, max = 10, message = "Surname must be in range 2-10")
    private String surname;
    @NotNull
    @NotBlank
    @NotEmpty
    private String company;
    private String position;
    @Email(message = "Not valid email")
    private String email;
    private double salary;

}
