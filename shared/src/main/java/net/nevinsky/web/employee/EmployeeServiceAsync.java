package net.nevinsky.web.employee;

import com.google.gwt.user.client.rpc.AsyncCallback;
import net.nevinsky.shared.SharedEmployee;

import java.util.List;

public interface EmployeeServiceAsync {
    void getEmployee(String name, AsyncCallback<SharedEmployee> async);

    void createEmployee(String firstName, String lastName, String secondName, Integer age, String experience, String description, AsyncCallback<Void> async);

    void updateEmployee(String firstName, String lastName, String secondName, Integer age, String experience, String description, AsyncCallback<Void> async);

    void deleteEmployee(Long id, AsyncCallback<Void> async);

    void list(AsyncCallback<List<SharedEmployee>> async);
}
