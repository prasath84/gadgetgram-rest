package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Signup1 {
    @Id
    @GeneratedValue

        private int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
private String name;
private String email;
private String phonenumber;
private String password;
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}
public String getPhonenumber() {
    return phonenumber;
}
public void setPhonenumber(String phonenumber) {
    this.phonenumber = phonenumber;
}
public String getPassword() {
    return password;
}
public void setPassword(String password) {
    this.password = password;
}
public String getConfirmpassword() {
    return confirmpassword;
}
public void setConfirmpassword(String confirmpassword) {
    this.confirmpassword = confirmpassword;
}
private String confirmpassword;
}
