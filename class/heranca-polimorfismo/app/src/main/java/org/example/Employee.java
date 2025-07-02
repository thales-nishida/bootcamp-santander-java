package org.example;

public abstract sealed class Employee permits Manager {
  private String name;
  private String document;
  private String address;
  private int age;
  private double salary;

  public String getName() {
    return name;
  }

  public String getDocument() {
    return document;
  }

  public String getAddress() {
    return address;
  }

  public int getAge() {
    return age;
  }

  public double getSalary() {
    return salary;
  }

  public void setName(String aName) {
    this.name = aName;
  }

  public void setDocument(String aDocument) {
    this.document = aDocument;
  }

  public void setAddress(String anAdress) {
    this.address = anAdress;
  }

  public void setAge(int aAge) {
    this.age = aAge;
  }

  public void setSalary(double aSalary) {
    this.salary = aSalary;
  }
}
