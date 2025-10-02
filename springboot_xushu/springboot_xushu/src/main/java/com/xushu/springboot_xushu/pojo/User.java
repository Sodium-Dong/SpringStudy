package com.xushu.springboot_xushu.pojo;

import jakarta.persistence.*;

@Table(name = "tb_user")
@Entity
public class User {
    @Id
    // 自增生成
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id") // // 把实体类的 userId 字段映射到表里的 user_id 列，默认会按字段名来找同名列
    private Integer userId;
    @Column(name = "user_name")
    private String userName;
    private String password;
    private String email;

    public Integer getId() {
        return userId;
    }

    public void setId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String username) {
        this.userName = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
