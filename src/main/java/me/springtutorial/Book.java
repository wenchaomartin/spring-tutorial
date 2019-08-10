package me.springtutorial;

public class Book {

  private Long id;

  private String name;

  private double price;


  public Book(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public Book() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }
}