package ua.hillelit.lms.observer.model.api;

import ua.hillelit.lms.observer.model.entity.Client;
import ua.hillelit.lms.observer.model.service.Order;

public interface Seller {

  boolean addOrder(Client client, Order order);

  boolean removeOrder(Client client, Order order);

  boolean sendOrder(Client client, Order order);

  void notify(Client client, Order order);
}
