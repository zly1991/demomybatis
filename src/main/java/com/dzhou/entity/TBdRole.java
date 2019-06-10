package com.dzhou.entity;


import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="t_bd_role")
public class TBdRole {
 @Id
  private Long id;
 @Column(name="role_code")
  private String roleCode;
 @Column(name ="role_name")
  private String roleName;
  private String remark;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getRoleCode() {
    return roleCode;
  }

  public void setRoleCode(String roleCode) {
    this.roleCode = roleCode;
  }


  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

    @Override
    public String toString() {
        return "TBdRole{" +
                "id=" + id +
                ", roleCode='" + roleCode + '\'' +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}
