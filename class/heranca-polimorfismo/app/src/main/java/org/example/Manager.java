package org.example;

public non-sealed class Manager extends Employee {
  private String login;
  private String password;

  public String getLogin() {
    return login;
  }

  public String getPassword() {
    return password;
  }

  public void setLogin(String anLogin) {
    this.login = anLogin;
  }

  public void setPassword(String anPassword) {
    this.password = anPassword;
  }
}
