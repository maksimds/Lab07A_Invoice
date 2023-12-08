import java.util.ArrayList;

public class Invoice
{
    private String Name;
    private String Address;
    private ArrayList <LineItem> ItemsLine;
    private double AmountTotalDue;

    public Invoice() {
        this.Name = Name;
        this.Address = Address;
        this.ItemsLine = new ArrayList<LineItem>();
        this.AmountTotalDue = 0.0;

    }

    public void addLineItem(LineItem item) {
        this.ItemsLine.add(item);
        this.AmountTotalDue += item.getTotal();

    }
    public double getAmountTotalDue() {
        return this.AmountTotalDue;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.Name + "\n");
        builder.append(this.Address + "\n");
        builder.append("| Item | Qty | Price | Total |\n");
        for (LineItem item: this.ItemsLine) {
            builder.append("| " + item.getProduct().getName() + " | " + item.getQuantity() + " | " + item.getProduct().getPriceUnit() + " | " + item.getTotal() + "|\n");
        }
        builder.append("\nAMOUNT DUE: $" + this.AmountTotalDue);
        return builder.toString();

    }


}