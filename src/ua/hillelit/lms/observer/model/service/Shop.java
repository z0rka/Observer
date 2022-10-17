package ua.hillelit.lms.observer.model.service;

import java.util.HashMap;
import java.util.Map;
import ua.hillelit.lms.observer.model.api.Seller;
import ua.hillelit.lms.observer.model.entity.Client;
import ua.hillelit.lms.observer.model.enums.OrderStatus;

public class Shop implements Seller {

  private final Map<Client, OrderList> ordersList = new HashMap<>();

  public Shop() {
  }

  public boolean addOrder(Client client, Order order) {
    if (client == null || order == null) {
      return false;
    }

    if (ordersList.containsKey(client)) {
      return ordersList.get(client).add(order);
    }

    ordersList.put(client, new OrderList(order));

    notify(client, order);

    return true;
  }

  @Override
  public boolean removeOrder(Client client, Order order) {
    order.setOrderStatus(OrderStatus.DECLIENED);
    notify(client, order);

    return ordersList.get(client).remove(order);
  }

  @Override
  public boolean sendOrder(Client client, Order order) {
    order.setOrderStatus(OrderStatus.SENT);
    notify(client, order);

    return ordersList.get(client).remove(order);
  }

  @Override
  public void notify(Client client, Order order) {
    client.update(order);
  }

  public Map<Client, OrderList> getOrdersList() {
    return ordersList;
  }
}
