package net.nevinsky.server;

import net.nevinsky.global.app.EmployeeDataService;
import net.nevinsky.global.entity.Employee;
import net.nevinsky.shared.SharedEmployee;
import net.nevinsky.web.employee.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
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
        Employee employee = new Employee(firstName, lastName, secondName, age, experience, description);
        dataService.create(employee);
    }

    @Override
    public void updateEmployee(String firstName, String lastName, String secondName, Integer age, String experience, String description) {

    }

    @Override
    public void deleteEmployee(Long id) {

    }

    @Override
    public List<SharedEmployee> list() {
        List<Employee> employees = dataService.list();
        if (employees != null && employees.size() > 0) {
            List<SharedEmployee> res = new ArrayList<SharedEmployee>();
            for (Employee employee : employees) {
                SharedEmployee sharedEmployee = new SharedEmployee();
                sharedEmployee.setFirstName(employee.getFirstName());
                sharedEmployee.setSecondName(employee.getSecondName());
                res.add(sharedEmployee);
            }
            return res;
        }
        return Collections.emptyList();
    }
}
