package com.dzhou.entity;


import javax.persistence.Id;
import java.util.List;

public class TBdUser {
  @Id
  private long id;
  private String username;
  private String password;
  private List<TBdRole> tBdRole;
  public List<TBdRole> gettBdRole() {
    return tBdRole;
  }
  public TBdUserInfo tBdUserInfo;

  public TBdUserInfo gettBdUserInfo() {
    return tBdUserInfo;
  }

  public void settBdUserInfo(TBdUserInfo tBdUserInfo) {
    this.tBdUserInfo = tBdUserInfo;
  }

  public void settBdRole(List<TBdRole> tBdRole) {
    this.tBdRole = tBdRole;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

}
