package net.nevinsky.core.app;

import net.nevinsky.global.app.EmployeeDataService;
import net.nevinsky.global.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Created by inver on 27.06.14.
 */
@Service
public class EmployeeDataServiceBean implements EmployeeDataService {
    @Override
    public Employee find(String name) {
        return null;
    }

    @Override
    public void create() {

    }

    @Override
    public void update(Employee employee) {

    }

    @Override
    public void delete(UUID uuid) {

    }

    @Override
    public List<Employee> list() {
        return null;
    }
}
