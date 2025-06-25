package Assignment2.prob2B;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderNum;
    private List<OrderLine> lines = new ArrayList<>();

    public Order(String orderNum) {
        this.orderNum = orderNum;
    }

    public void addOrderLine(OrderLine orderLine) {
        lines.add(orderLine);
    }

    public List<OrderLine> getOrderLines() {
        return lines;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNum='" + orderNum + '\'' +
                ", lines=" + lines +
                '}';
    }
}
