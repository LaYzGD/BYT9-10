import java.util.Map;
import java.util.StringJoiner;

public class PC {
    private Map<String, String> specifications;
    private String name;
    private double price;

    public PC(Map<String, String> specifications, String name, double price){
        this.specifications = specifications;
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString(){
        StringJoiner pc = new StringJoiner(", ");
        for (String specification: specifications.values()) {
            pc.add(specification);
        }
        pc.add(name);
        return pc.toString();
    }
}
