import java.util.Date;

public class Subscription {
    private int subscriptionId;
    private String packageType;
    private String startDate;
    private String endDate;

    public Subscription(int subscriptionId, String packageType, String startDate, String endDate) {
        this.subscriptionId = subscriptionId;
        this.packageType = packageType;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
