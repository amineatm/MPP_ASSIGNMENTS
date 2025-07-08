package Assignment05.prob4.extpackage;

import java.time.LocalDate;

import Assignment05.prob4.CustOrderFactory;
import Assignment05.prob4.Customer;
import Assignment05.prob4.Order;

public class Main {
    public static void main(String[] args) {
        Customer customer = CustOrderFactory.createCustomer("Bob");

        Order order = CustOrderFactory.createOrder(customer, LocalDate.now());

        order.addItem("Shirt");
        order.addItem("Laptop");

        order = CustOrderFactory.createOrder(customer, LocalDate.now());

        order.addItem("Pants");
        order.addItem("Knife set");

        System.out.println(customer.getOrders());
    }
}

		
