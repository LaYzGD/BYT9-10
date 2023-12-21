import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Customer {
    private int customerId;
    private String name;
    private String email;
    private String address;

    public Customer(int customerId, String name, String email, String address) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public Order orderCustomPC(Map<String, String> specifications, int orderId, PC pc) {
        List<String> items = new ArrayList<String>();
        items.add(pc.toString());
        return new Order(orderId, items, "today", pc.getPrice());
    }

    public Subscription subscribeToMaintenancePackage(String packageType, int id, String endDate) {
        return new Subscription(id, packageType, "today", endDate);
    }

    @Override
    public String toString(){
        return name + ", " + customerId;
    }
}
