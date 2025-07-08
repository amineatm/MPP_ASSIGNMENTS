package Assignment02.prob2B;

public class OrderLine {
    private Order order;

    public OrderLine(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    @Override
    public String toString() {
        return "OrderLine{" +
                "order=" + order.getOrderNum() +
                '}';
    }
}
