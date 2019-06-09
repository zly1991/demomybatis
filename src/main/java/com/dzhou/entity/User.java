package com.dzhou.entity;

import lombok.Data;

import javax.persistence.*;


/**
 * Created by ZHOULY2 on 2019-6-1.
 */
@Data
@Table(name="t_bd_user")
public class User {
    @Id
//    @GeneratedValue(strategy=GenerationType.IDENTITY)
//    @Column(name="id")
    //这里注意使用包装类
    private Integer id;
//    @Column(name="username")
    private String username;
//    @Column(name="password")
    private String password;
}
