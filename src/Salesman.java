public class Salesman {
    private int salesmanId;
    private String name;
    private String department;

    public Salesman(int salesmanId, String name, String department) {
        this.salesmanId = salesmanId;
        this.name = name;
        this.department = department;
    }

    public String processOrder(Customer customer, Order order) {
        return "Processed: " + order.toString() + ", by" + customer.toString();
    }
}
