package com.example.wednesdaytest;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {
    public TextField Username;
    public PasswordField Password;
    public Label welcomeText;

    private final String correctUsername = "Nirajan";
    private final String correctPassword = "456";
    private int failedAttempts = 0;
    private final int maxFailedAttempts = 5;
    private int Counter = 5;


    public void sign(ActionEvent actionEvent) {
        String username = Username.getText();
        String password = Password.getText();

        if (username.isEmpty() || password.isEmpty()) {
            welcomeText.setText("Please provide Username or Password");
        } else if (!username.matches("[a-zA-Z]+")) {
            welcomeText.setText("Username must be in Alphabets");
        } else if (failedAttempts >= maxFailedAttempts) {
            welcomeText.setText("Sorry, Your Account is Locked!!!");
        } else if (username.equals(correctUsername) && password.equals(correctPassword)) {
            welcomeText.setText("Success!!!");
            failedAttempts = 0;
        } else {
            failedAttempts++;
            Counter--;
            if (failedAttempts >= maxFailedAttempts) {
                welcomeText.setText("Sorry, Your Account is Locked!!!");
            }
            else {
                welcomeText.setText("Sorry, Invalid Username or Password.You have"+Counter+" attempt");
            }
        }
    }
}
