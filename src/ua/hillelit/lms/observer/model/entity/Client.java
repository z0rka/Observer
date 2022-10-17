package ua.hillelit.lms.observer.model.entity;

import ua.hillelit.lms.observer.model.api.Customer;
import ua.hillelit.lms.observer.model.service.Order;

public class Client extends Person implements Customer {

  public Client(String name, String surname, int phoneNumber) {
    super(name, surname, phoneNumber);
  }

  @Override
  public void update(Order order) {
    System.out.println("New info about your order");
    System.out.println(
        "Your order number '" + order.getOrderNumber() + "'( " + order.getOrder() + ") "
            + order.getOrderStatus());
  }

}
