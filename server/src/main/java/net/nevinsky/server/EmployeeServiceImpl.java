package net.nevinsky.server;

import net.nevinsky.global.app.EmployeeDataService;
import net.nevinsky.shared.SharedEmployee;
import net.nevinsky.web.employee.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by inver on 27.06.14.
 */
@Service(EmployeeService.NAME)
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDataService dataService;

    @Override
    public SharedEmployee getEmployee(String name) {
//       return dataService.find(name);
        return null;
    }

    @Override
    public void createEmployee(String firstName, String lastName, String secondName, Integer age, String experience, String description) {

    }

    @Override
    public void updateEmployee(String firstName, String lastName, String secondName, Integer age, String experience, String description) {

    }

    @Override
    public void deleteEmployee(Long id) {

    }

    @Override
    public List<SharedEmployee> list() {
        return null;
    }
}
