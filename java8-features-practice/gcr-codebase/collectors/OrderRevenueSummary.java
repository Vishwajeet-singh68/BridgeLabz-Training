package collectors;

import java.util.*;
import java.util.stream.Collectors;

class Order {
    String customerName;
    double orderTotal;

    public Order(String customerName, double orderTotal) {
        this.customerName = customerName;
        this.orderTotal = orderTotal;
    }
}

public class OrderRevenueSummary {

    public static void main(String[] args) {

        List<Order> orders = Arrays.asList(
            new Order("Amit", 1200.50),
            new Order("Rahul", 3000.00),
            new Order("Amit", 850.75),
            new Order("Neha", 4200.00),
            new Order("Rahul", 1500.25),
            new Order("Amit", 999.99),
            new Order("Neha", 1800.00),
            new Order("Pooja", 2200.00)
        );

        Map<String, Double> revenuePerCustomer = orders.stream().collect(Collectors.groupingBy(o -> o.customerName,Collectors.summingDouble(o -> o.orderTotal)));

        System.out.println("Order Revenue Summary:");
        revenuePerCustomer.forEach((customer, total) ->
            System.out.println(customer + " : " + total)
        );
    }
}
