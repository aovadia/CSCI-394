import java.util.ArrayList;
import java.util.List;

/**
 * Created by oadam11 on 7/12/17.
 */
public class finalProject {

    public static void main(String[] args) {
        List<Invoice> mList = new ArrayList<>();
        mList.add(new Invoice(83, 7, "Electric sander", 57.98));
        mList.add(new Invoice(24, 18, "Power saw", 99.99));
        mList.add(new Invoice(7, 11, "Sledge hammer", 21.50));
        mList.add(new Invoice(77, 76, "Hammer", 11.99));
        mList.add(new Invoice(39, 3, "Lawn mower", 79.50));
        mList.add(new Invoice(68, 106, "Screwdriver", 6.99));
        mList.add(new Invoice(56, 21, "Jig saw", 11.00));
        mList.add(new Invoice(3, 34, "Wrench", 7.50));

        System.out.println("Part Number:  Part Description:  Quantity:  Price: ");
        for (Invoice i : mList) {
            System.out.println(i);
        }


        System.out.println("\nSort by Part Description: \n");
        System.out.println("Part Number:  Part Description:  Quantity:  Price: ");
        mList.stream()
                .sorted( (Invoice p, Invoice p2) -> p.getPartDescription().compareTo(p2.getPartDescription()))
                .forEach(System.out::println);


        System.out.println("\nSort by Price: \n");
        System.out.println("Part Number:  Part Description:  Quantity:  Price: ");
        mList.stream()
                .sorted((Invoice p, Invoice p2) -> new Double(p.getPrice()).compareTo(p2.getPrice()))
                .forEach(System.out::println);

        System.out.println("\nUse lambdas and streams to map each Invoice to its PartDescription and Quantity , sort the\n" +
                "results by Quantity , then display the results\n");

        mList.stream()
                .sorted((Invoice p, Invoice p2) -> new Integer(p.getQuantity()).compareTo(p2.getQuantity()))
                .map((Invoice p1) -> p1.getPartDescQuantity())
                .forEach(System.out::println);


        System.out.println("\nUse lambdas and streams to map each Invoice to its PartDescription and the value of the\n" +
                "Invoice (i.e., Quantity * Price ). Order the results by Invoice value");

        mList.stream()
                .sorted((Invoice p1, Invoice p2) -> new Double(p1.getValue()).compareTo(p2.getValue()))
                .map((Invoice p1) -> p1.getDescriptionValue())
                .forEach(System.out::println);

        System.out.println("\nModify Part (d) to select the Invoice values in the range $200 to $500.\n");
        mList.stream()
                .sorted((Invoice p1, Invoice p2) -> new Double(p1.getValue()).compareTo(p2.getValue()))
                .filter((Invoice p1) -> p1.getValue() >= 200 && p1.getValue() <= 500)
                .map((Invoice p1) -> p1.getDescriptionValue())
                .forEach(System.out::println);
    }
}
