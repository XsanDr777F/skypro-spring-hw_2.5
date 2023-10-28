package prosky.skyprospringhw25.model;

import org.apache.commons.lang3.StringUtils;

import java.util.Objects;
import java.util.Random;

import static org.apache.commons.lang3.StringUtils.*;

public class Employee {
    private String fullName;
    private int sallary;
    private int depId;
    private final Random random = new Random();

    public Employee(String fullName) {
        this.fullName = capitalize(fullName.toLowerCase());
        this.sallary = random.nextInt(10000) + 1000;
        this.depId = random.nextInt(5) + 1;
    }

    public Employee(String fullName, int sallary, int depId) {

        this.fullName = fullName;
        this.sallary = sallary;
        this.depId = depId;
    }

    public String getFullName() {
        return fullName;
    }

    public Integer getSallary() {
        return sallary;
    }

    public Integer getDepId() {
        return depId;
    }

    public void setDepId(Integer depId) {
        this.depId = depId;
    }

    public void setSallary(Integer sallary) {
        this.sallary = sallary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(fullName, employee.fullName) && Objects.equals(sallary, employee.sallary) && Objects.equals(depId, employee.depId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, sallary, depId);
    }

    @Override
    public String toString() {
        return "Сотрудник {" +
                ", ФИО " + fullName + '\'' +
                ", зарплата = " + sallary +
                ", номер отдела = " + depId +
                '}';
    }
}