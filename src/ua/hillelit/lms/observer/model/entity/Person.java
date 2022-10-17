package ua.hillelit.lms.observer.model.entity;

import java.util.Objects;

public abstract class Person {

  private final String name;
  private final String surname;
  private final int phoneNumber;

  public Person(String name, String surname, int phoneNumber) {
    this.name = name;
    this.surname = surname;
    this.phoneNumber = phoneNumber;
  }

  public String getName() {
    return name;
  }

  public String getSurname() {
    return surname;
  }

  public int getPhoneNumber() {
    return phoneNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Person person = (Person) o;
    return phoneNumber == person.phoneNumber && Objects.equals(name, person.name)
        && Objects.equals(surname, person.surname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, surname, phoneNumber);
  }
}
