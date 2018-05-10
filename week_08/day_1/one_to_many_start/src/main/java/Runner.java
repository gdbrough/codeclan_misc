import db.DBHelper;
import models.Department;
import models.Employee;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Department dept1 = new Department("HR");
        DBHelper.save(dept1);

        Department dept2 = new Department("Sales");
        DBHelper.save(dept2);

        Employee employee1 = new Employee("Jack", "Jarvis", 25000, dept1);
        DBHelper.save(employee1);

        Employee employee2 = new Employee("Isa", "Drennan", 30000, dept2);
        DBHelper.save(employee2);

        List<Employee> employees = DBHelper.getAll("Employee");

        List<Department> departments = DBHelper.getAll("Department");

        List<Employee> employeesOfDept1 = DBHelper.getEmployees(dept1.getId());

//        employee2 = new Employee("Victor", "McDade", 35000, dept1);
        employee2.setFirstName("Victor");
        employee2.setLastName("McDade");
        DBHelper.update(employee2);

        List<Employee> moreEmployees = DBHelper.getAll("Employee");

//        DBHelper.delete(employee1);

        List<Employee> evenMoreEmployees = DBHelper.getAll("Employee");

//        DBHelper.deleteById(employee2.getId(), "Employee");

        List<Employee> noEmployees = DBHelper.getAll("Employee");

    }
}