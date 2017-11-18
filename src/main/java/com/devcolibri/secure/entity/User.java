package com.devcolibri.secure.entity;

import java.io.Serializable;



public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String username;
    private String password;
    private String amount;


    public User(String login, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.amount = amount;

    }

    public User() {

    }

    public String getLastName() {
        return username;
    }

    public void setLastName(String lastName) {
        this.username = username;
    }

    public String getFirstName() {
        return password;
    }

    public void setFirstName(String firstName) {
        this.password = password;
    }

    public Integer getUserId() {
        return id;
    }

    public void setUserId(Integer userId) {
        this.id = id;
    }


    public String getLogin() {
        return amount;
    }

    public void setLogin(String login) {
        this.amount = amount;
    }

}


