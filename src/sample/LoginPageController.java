package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginPageController {

    public Button loginButton;
    public Button newAccountButton;
    public TextField usernameField;
    public PasswordField passwordField;
    public Hyperlink forgotPasswordButton;
    public SceneController sc = new SceneController();

    public void handleLoginButton() {
        System.out.println("Username: " + usernameField.getText());
        System.out.println("Password: " + passwordField.getText());
    }

    public void handleNewAccountButton(ActionEvent event) throws IOException {
        sc.switchToAccountCreationPage(event);
    }

}
