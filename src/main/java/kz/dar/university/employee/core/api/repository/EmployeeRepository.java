package kz.dar.university.employee.core.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeEntity, Long> {
    List<EmployeeEntity> getEmployeeEntitiesBySurname(String surname);
    EmployeeEntity getEmployeeEntityByEmployeeId(String employeeId);
    List<EmployeeEntity> getEmployeeEntityBy();
    @Transactional
    void deleteEmployeeEntityByEmployeeId(String employeeId);
}
