package prosky.skyprospringhw25.servise;

import org.springframework.stereotype.Service;
import prosky.skyprospringhw25.exception.EmployeeAlreadyAddedException;
import prosky.skyprospringhw25.exception.EmployeeNotFounfException;
import prosky.skyprospringhw25.model.Employee;

import java.util.*;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final Map<String, Employee> employees = new HashMap<>();

    @Override
    public Employee add(String fullname) {
        Employee employee = new Employee(fullname);
        if (employees.containsKey(employee.getFullName())) {
            throw new EmployeeAlreadyAddedException();
        }
        employees.put(employee.getFullName(), employee);
        return employee;
    }

    @Override
    public Employee remove(String fullname) {
        Employee employee = new Employee(fullname);

        if (!employees.containsKey(employee.getFullName())) {
            throw new EmployeeNotFounfException();
        }
        employees.remove(employee.getFullName());
        return employee;
    }

    @Override
    public Employee find(String fullname) {
        Employee employee = new Employee(fullname);

        if (!employees.containsKey(employee.getFullName())) {
            throw new EmployeeNotFounfException();

        }
        return employee;
    }

    @Override
    public Collection<Employee> findAll() {
        return employees.values();
    }
}


