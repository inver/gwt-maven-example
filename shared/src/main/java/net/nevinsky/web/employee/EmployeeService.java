package net.nevinsky.web.employee;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import net.nevinsky.shared.SharedEmployee;

import java.util.List;

/**
 * Created by inver on 22.06.14.
 */
@RemoteServiceRelativePath("gwtServices/employeeService")
public interface EmployeeService extends RemoteService {
    String NAME = "employeeService";

    SharedEmployee getEmployee(String name);

    void createEmployee(String firstName, String lastName, String secondName, Integer age, String experience, String description);

    void updateEmployee(String firstName, String lastName, String secondName, Integer age, String experience, String description);

    void deleteEmployee(Long id);

    List<SharedEmployee> list();
}
