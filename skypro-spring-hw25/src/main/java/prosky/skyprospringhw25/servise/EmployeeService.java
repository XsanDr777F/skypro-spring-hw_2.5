package prosky.skyprospringhw25.servise;

import prosky.skyprospringhw25.model.Employee;

import java.util.Collection;

public interface EmployeeService {
    Employee add(String fullname);

    Employee remove(String fullname);

    Employee find(String fullname);

    Collection<Employee> findAll();
}
