package com.example;

import javafx.beans.property.SimpleStringProperty;

public class User {
    private final String username;
    private final String password;
    private final SimpleStringProperty accountcreated;
    private final SimpleStringProperty accountstatus;

    public User(String username, String password, String dcreated, String astatus) {

        this.username = new String(username);
        this.password = new String(password);
        this.accountcreated = new SimpleStringProperty(dcreated);
        this.accountstatus = new SimpleStringProperty(astatus);
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getAccountcreated() {
        return accountcreated.get();
    }

    public String getAccountstatus() {
        return accountstatus.get();
    }
}
