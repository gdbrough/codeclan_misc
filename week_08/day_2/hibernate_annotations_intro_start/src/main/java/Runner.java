import db.DBHelper;
import models.Department;
import models.Employee;
import models.Manager;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Manager manager1 = new Manager("John", "Reid", 150000, 10000);
        DBHelper.save(manager1);
        Manager manager2 = new Manager("Steve", "Kane", 155000, 15000);
        DBHelper.save(manager2);

        Department dept1 = new Department("HR", manager1);
        DBHelper.save(dept1);
        Department dept2 = new Department("Sales", manager2);
        DBHelper.save(dept2);

        Employee employee1 = new Employee("Al", "Bundy", 35000, manager1);
        DBHelper.save(employee1);

        Employee employee2 = new Employee("Peggy", "Bundy", 50000, manager2);
        DBHelper.save(employee2);

        Department foundDepartment = DBHelper.find(Department.class, dept1.getId());
        Employee foundEmployee = DBHelper.find(Employee.class, employee1.getId());
        Manager foundManager = DBHelper.find(Manager.class, manager1.getId());

        List<Employee> employeesByManager = DBHelper.findByManager(Employee.class, manager1);
        List<Department> departmentsByManager = DBHelper.findByManager(Department.class, manager1);

//        foundManager.giveRaise();
//        DBHelper.update(foundManager);
    }
}
