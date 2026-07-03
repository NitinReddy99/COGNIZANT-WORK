package week1.module2.EcommerceSearchExample;

import java.util.Arrays;
import java.util.Comparator;

public class SearchTest {

    public static void main(String[] args) {

        Product[] products = {
                new Product(103, "Laptop", "Electronics"),
                new Product(101, "Shoes", "Fashion"),
                new Product(105, "Phone", "Electronics"),
                new Product(102, "Book", "Education"),
                new Product(104, "Watch", "Accessories")
        };

        System.out.println("Linear Search:");

        Product result = Search.linearSearch(products, 102);

        if (result != null)
            result.display();
        else
            System.out.println("Product not found");

        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        System.out.println("\nBinary Search:");

        result = Search.binarySearch(products, 102);

        if (result != null)
            result.display();
        else
            System.out.println("Product not found");
    }
}
