package com.dzhou.entity;
import javax.persistence.Id;


public class TBdRoleAuth {
  @Id
  private long id;
  private long roleId;
  private long authId;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getRoleId() {
    return roleId;
  }

  public void setRoleId(long roleId) {
    this.roleId = roleId;
  }


  public long getAuthId() {
    return authId;
  }

  public void setAuthId(long authId) {
    this.authId = authId;
  }

}
