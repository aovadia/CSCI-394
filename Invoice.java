/**
 * Created by oadam11 on 7/12/17.
 */
public class Invoice {
    private int PartNumber, Quantity;
    private  String PartDescription;
    private  double Price;

    Invoice(int partNumber, int Quantity, String PartDescription, double Price) {
        this.PartNumber = partNumber;
        this.Quantity = Quantity;
        this.PartDescription = PartDescription;
        this.Price = Price;
    }

    @Override
    public String toString() {
        return String.format("%-10d \t %-15s \t %-5d \t %-5.2f", PartNumber, PartDescription, Quantity, Price);
    }

    // Getters
    int getPartNumber() {
        return PartNumber;
    }
    int getQuantity() {
        return Quantity;
    }

    String getPartDescription() {
        return PartDescription;
    }

    double getPrice() {
        return Price;
    }

    String getPartDescQuantity() {
       // return ("" + PartDescription + " " +Quantity);
        return String.format("%-15s\t %-15s", PartDescription, Quantity);
    }

    double getValue() {
        return Quantity * Price;
    }

    String getDescriptionValue() {
        return String.format("%-15s\t %-15s", PartDescription, getValue());
    }
}