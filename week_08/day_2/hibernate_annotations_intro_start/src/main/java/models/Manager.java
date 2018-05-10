package models;

import db.DBHelper;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "managers")
public class Manager {

    private int id;
    private String firstName;
    private String lastName;
    private Department department;
    private int salary;
    private int budget;
    private Set<Employee> employees;

    public Manager() {
    }

    public Manager(String firstName, String lastName, int salary, int budget) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
        this.budget = budget;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "firstName")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "lastName")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @OneToOne(fetch = FetchType.EAGER, mappedBy = "manager")
    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Column(name = "salary")
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Column(name = "budget")
    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    @OneToMany(mappedBy = "manager", fetch = FetchType.LAZY, orphanRemoval = true)
    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    public void giveRaise(){
        for (Employee employee : this.employees){
            int oldSalary = employee.getSalary();
            double raise = oldSalary * 0.1;
            double newSalary = oldSalary + raise;
            employee.setSalary((int)newSalary);
            this.budget -= raise;
            DBHelper.update(employee);
        }
    }
}
