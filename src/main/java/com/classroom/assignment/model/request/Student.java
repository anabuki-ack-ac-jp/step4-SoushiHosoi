package com.classroom.assignment.model.request;

public class Student {
  private String id;
  private String name;
  private String senkou;

  public Student(String id, String name, String senkou) {
    this.setId(id);
    this.setName(name);
    this.setSenkou(senkou);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getSenkou() {
    return senkou;
  }

  public void setSenkou(String senkou) {
    this.senkou = senkou;
  }

}
