package prosky.skyprospringhw25.servise;

import org.springframework.stereotype.Service;
import prosky.skyprospringhw25.exception.EmployeeAlreadyAddedException;
import prosky.skyprospringhw25.exception.EmployeeNotFounfException;
import prosky.skyprospringhw25.model.Employee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final List<Employee> employees = new ArrayList<>();

    @Override
    public Employee add(String fullname) {
        Employee employee = new Employee(fullname);
        if (employees.contains(employee)) {
            throw new EmployeeAlreadyAddedException();
        }
        employees.add(employee);
        return employee;
    }

    @Override
    public Employee remove(String fullname) {
        Employee employee = new Employee(fullname);

        if (!employees.contains(employee)) {
            throw new EmployeeNotFounfException();
        }
        employees.remove(employee);
        return employee;
    }

    @Override
    public Employee find(String fullname) {
        Employee employee = new Employee(fullname);

        if (!employees.contains(employee)) {
            throw new EmployeeNotFounfException();

        }
        return employee;
    }

    @Override
    public Collection<Employee> findAll() {
        return employees;
    }
}


