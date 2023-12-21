import java.util.Date;
import java.util.List;

public class Purchase {
    private int purchaseId;
    private List<String> purchasedItems;
    private Date purchaseDate;
    private double totalCost;

    public Purchase(int purchaseId, List<String> purchasedItems, Date purchaseDate, double totalCost) {
        this.purchaseId = purchaseId;
        this.purchasedItems = purchasedItems;
        this.purchaseDate = purchaseDate;
        this.totalCost = totalCost;
    }
}
