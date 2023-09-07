package kz.dar.university.employee.core.api.repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.*;
@Entity
@Table(name = "employee_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeEntity {
    @Id
    @Generated
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
