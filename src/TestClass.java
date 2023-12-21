import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;
public class TestClass {
    @Test
    public void testOrderToString() {
        List<String> items = new ArrayList<>();
        items.add("Item1");
        items.add("Item2");
        Order order = new Order(1, items, "2023-12-21", 100.0);
        assertEquals("1, Item1, Item2, 2023-12-21, 100.0", order.toString());
    }

    @Test
    public void testOrderCustomPC() {
        Map<String, String> specs = new HashMap<>();
        specs.put("Processor", "Intel Core i7");
        specs.put("RAM", "16GB");
        PC pc = new PC(specs, "MyPC", 999.99);
        Customer customer = new Customer(1, "John Doe", "john@example.com", "123 Street");

        Order order = customer.orderCustomPC(specs, 1, pc);
        assertNotNull(order);
        assertEquals("1, Intel Core i7, 16GB, MyPC, today, 999.99", order.toString());
    }

    @Test
    public void testCustomerToString() {
        Customer customer = new Customer(1, "John Doe", "john@example.com", "123 Street");
        assertEquals("John Doe, 1", customer.toString());
    }

    @Test
    public void testPCToString() {
        Map<String, String> specs = new HashMap<>();
        specs.put("Processor", "Intel Core i7");
        specs.put("RAM", "16GB");
        PC pc = new PC(specs, "MyPC", 999.99);
        assertEquals("Intel Core i7, 16GB, MyPC", pc.toString());
    }

    @Test
    public void testRepairmanDiagnosePCs() {
        Map<String, String> specs = new HashMap<>();
        specs.put("Processor", "Intel Core i7");
        specs.put("RAM", "16GB");
        PC pc = new PC(specs, "MyPC", 999.99);
        Repairman repairman = new Repairman(1, "John", "Hardware");

        String result = repairman.diagnosePCs(pc);
        assertEquals("Diagnosed: Intel Core i7, 16GB, MyPC", result);
    }

    @Test
    public void testSalesmanProcessOrder() {
        Map<String, String> specs = new HashMap<>();
        specs.put("Processor", "Intel Core i7");
        specs.put("RAM", "16GB");
        PC pc = new PC(specs, "MyPC", 999.99);
        Customer customer = new Customer(1, "John Doe", "john@example.com", "123 Street");
        Order order = new Order(1, Collections.singletonList(pc.toString()), "2023-12-21", pc.getPrice());
        Salesman salesman = new Salesman(1, "Alice", "Sales");

        String result = salesman.processOrder(customer, order);
        assertEquals("Processed: 1, Intel Core i7, 16GB, MyPC, 2023-12-21, 999.99, byJohn Doe, 1", result);
    }

    @Test
    public void testUserLogin() {
        User user = new User("username", "password");
        assertTrue(user.login("username", "password"));
        assertFalse(user.login("user", "pass"));
    }
}
