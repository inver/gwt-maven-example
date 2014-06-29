package net.nevinsky.core.app;

import net.nevinsky.core.app.repos.EmployeeRepository;
import net.nevinsky.global.app.EmployeeDataService;
import net.nevinsky.global.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Created by inver on 27.06.14.
 */
@Service
public class EmployeeDataServiceBean implements EmployeeDataService {

    @Autowired
    private EmployeeRepository repository;

    @Override
    public Employee find(String name) {
        return null;
    }

    @Override
    public void create(Employee employee) {
        repository.save(employee);
    }

    @Override
    public void update(Employee employee) {
        repository.save(employee);
    }

    @Override
    public void delete(UUID uuid) {

    }

    @Override
    public List<Employee> list() {
        return repository.findAll();
    }
}
