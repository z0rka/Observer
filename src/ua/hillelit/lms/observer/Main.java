package ua.hillelit.lms.observer;

import ua.hillelit.lms.observer.model.entity.Client;
import ua.hillelit.lms.observer.model.service.Order;
import ua.hillelit.lms.observer.model.service.Shop;

public class Main {

  public static void main(String[] args) {
    Shop shop = new Shop();
    Client client = new Client("Josh", " J", 31321341);
    Order order = new Order("TV", 1);

    shop.addOrder(client, order);

    shop.sendOrder(client, order);

  }
}
