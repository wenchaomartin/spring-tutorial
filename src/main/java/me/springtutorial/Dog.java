package me.springtutorial;


import java.util.Objects;

/**
 * Create by songwenchao on 2019-07-09
 */
public class Dog {
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public int hashCode() {

    return 7;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Dog dog = (Dog) o;
    return Objects.equals(name, dog.name);
  }
}
