package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class AccountCreationPageController {
    public TextField firstNameField;
    public TextField lastNameField;
    public TextField monthField;
    public TextField dayField;
    public TextField yearField;
    public TextField usernameField;
    public TextField passwordField;
    public TextField confirmPasswordField;
    public Button createAccountButton;
    public Button backButton;
    public SceneController sc = new SceneController();

    public void handleCreateAccountButton(ActionEvent event) throws IOException {
        sc.switchToAccountCreationPage(event);
    }
    public void handleBackButton(ActionEvent event) throws IOException {
        sc.switchToLoginPage(event);
    }
}
