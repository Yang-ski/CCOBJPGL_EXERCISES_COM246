package com.example;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class HomeController implements Initializable {

    @FXML
    Label usernameLabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // TODO Auto-generated method stub
        String username = LoginController.user.getUsername();
        usernameLabel.setText(username);
    } 
}
