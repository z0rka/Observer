package ua.hillelit.lms.observer.model.service;

import ua.hillelit.lms.observer.model.enums.OrderStatus;

public class Order {

  private final String order;

  private final int orderNumber;

  private OrderStatus orderStatus = OrderStatus.WAITING;

  public Order(String order, int orderNumber) {
    this.order = order;
    this.orderNumber = orderNumber;
  }

  public String getOrder() {
    return order;
  }

  public int getOrderNumber() {
    return orderNumber;
  }

  public OrderStatus getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(OrderStatus orderStatus) {
    this.orderStatus = orderStatus;
  }
}
