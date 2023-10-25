package prosky.skyprospringhw25.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import prosky.skyprospringhw25.model.Employee;
import prosky.skyprospringhw25.servise.EmployeeService;

import java.util.Collection;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService, EmployeeService employeeService1) {

        this.employeeService = employeeService1;
    }
    @GetMapping("/add")
    public Employee add(@RequestParam String fullname)
    {
        return employeeService.add(fullname);
    }
    @GetMapping("/remove")
    public Employee remove(@RequestParam String fullname)
    {
        return employeeService.remove(fullname);
    }
    @GetMapping("/find")
    public Employee find(@RequestParam String fullname)
    {
        return employeeService.find(fullname);
    }
    @GetMapping
    public Collection<Employee> findAll()    {
        return employeeService.findAll();

    }
}
