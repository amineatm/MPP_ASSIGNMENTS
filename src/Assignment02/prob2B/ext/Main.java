package Assignment02.prob2B.ext;

import Assignment02.prob2B.Order;
import Assignment02.prob2B.OrderLine;

public class Main {
    public static void main(String[] args) {
        Order order = new Order("order test");

        OrderLine line1 = new OrderLine(order);
        OrderLine line2 = new OrderLine(order);

        order.addOrderLine(line1);
        order.addOrderLine(line2);


        System.out.println(order);
    }
}
