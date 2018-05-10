import models.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    public Employee employee;

    @Before
    public void setUp() {
        employee = new Employee("Jack Jarvis", 12000.00);
    }

    @Test
    public void testHasName() throws Exception{
        assertEquals("Jack Jarvis", employee.getName());
    }

    @Test
    public void testCanGetSalary() throws Exception{
        assertEquals(12000.00, employee.getSalary(), 0.01);
    }

    @Test
    public void testCanRaiseSalary() throws Exception{
        employee.raiseSalary(2000.00);
        assertEquals(14000.00, employee.getSalary(), 0.01);
    }
}
