package kz.dar.university.employee.core.api.repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.*;
@Entity
@Table(name = "employees")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeEntity {
    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true)
    private String employeeId;
    @Column(nullable = false, length = 50)
    private String name;
    @Column(nullable = false, length = 50)
    private String surname;
    @Column(nullable = false, length = 50)
    private String company;
    @Column(nullable = false, length = 50)
    private String position;
    @Column(nullable = false, length = 50)
    private String email;
    @Column(nullable = false, length = 50)
    private double salary;
}
