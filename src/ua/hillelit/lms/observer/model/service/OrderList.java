package ua.hillelit.lms.observer.model.service;

import java.util.ArrayList;
import java.util.List;

public class OrderList {

  private final List<Order> orderList = new ArrayList<>();

  public OrderList() {
  }

  public OrderList(Order order) {
    this.add(order);
  }

  public boolean add(Order order) {
    return orderList.add(order);
  }

  public boolean remove(Order order) {
    return orderList.remove(order);
  }

  public List<Order> getOrderList() {
    return orderList;
  }
}
