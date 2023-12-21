import java.util.Date;
import java.util.List;

public class Sale {
    private int saleId;
    private List<String> soldItems;
    private Date saleDate;
    private double totalRevenue;

    public Sale(int saleId, List<String> soldItems, Date saleDate, double totalRevenue) {
        this.saleId = saleId;
        this.soldItems = soldItems;
        this.saleDate = saleDate;
        this.totalRevenue = totalRevenue;
    }
}
