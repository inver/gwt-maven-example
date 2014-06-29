package net.nevinsky.global.app;

import net.nevinsky.global.entity.Employee;

import java.util.List;
import java.util.UUID;

/**
 * Created by inver on 22.06.14.
 */
public interface EmployeeDataService {

    void create(Employee employee);

    void update(Employee employee);

    void delete(UUID uuid);

    List<Employee> list();

    Employee find(String name);
}
