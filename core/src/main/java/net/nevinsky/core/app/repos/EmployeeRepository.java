package net.nevinsky.core.app.repos;

import net.nevinsky.global.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by inver on 22.06.14.
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
