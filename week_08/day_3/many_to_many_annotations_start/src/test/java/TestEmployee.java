import db.DBHelper;
import models.Department;
import models.Employee;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestEmployee {

    private Employee employee;
    private Department department;




    @Before
    public void setUp() throws Exception {
        department = new Department("HR");
        employee = new Employee("Jeff", "Bridges", 40000, department);
        DBHelper.save(department);
        DBHelper.save(employee);
    }

    @After
    public void tearDown() throws Exception {
        DBHelper.delete(employee);
        DBHelper.delete(department);
    }

    @Test
    public void testCanSave() {
        List<Employee> results = DBHelper.getAll(Employee.class);
        assertEquals(1, results.size());
    }

    @Test
    public void testCanUpdate() {
        Employee found = DBHelper.find(Employee.class, employee.getId());
        found.setFirstName("Jess");
        DBHelper.update(found);
        found = DBHelper.find(Employee.class, employee.getId());
        assertEquals("Jess", found.getFirstName());
    }
}
