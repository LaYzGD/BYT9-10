import java.util.List;
import java.util.StringJoiner;

public class Order {
    private int orderId;
    private List<String> items;
    private String orderDate;
    private double totalPrice;

    public Order(int orderId, List<String> items, String orderDate, double totalPrice) {
        this.orderId = orderId;
        this.items = items;
        this.orderDate = orderDate;
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString(){
        StringJoiner joiner = new StringJoiner(", ");
        for(String item : items){
            joiner.add(item);
        }
        return orderId + ", " + joiner + ", " + orderDate + ", " + totalPrice;
    }
}
