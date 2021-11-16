package sample;

import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AccountCreationPageController {
    public TextField firstNameField;
    public TextField lastNameField;
    public TextField monthField;
    public TextField dayField;
    public TextField yearField;
    public TextField usernameField;
    public TextField passwordField;
    public TextField confirmPasswordField;
    public Label errorLabel;
    public Button createAccountButton;
    public Button backButton;
    public ComboBox chooseUserType;
    public SceneController sc = new SceneController();
    ObservableList<String> userTypeList = FXCollections.observableArrayList("Patient", "Nurse", "Doctor");

    public AccountCreationPageController() {
    }

    @FXML
    private void initialize() {
        chooseUserType.setValue("User Type");
        chooseUserType.setItems(userTypeList);
    }

    public void handleCreateAccountButton() {
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        if (isNumeric(monthField.getText())) {
            int month = Integer.parseInt(monthField.getText());
        }

        if (isNumeric(dayField.getText())) {
            int day = Integer.parseInt(dayField.getText());
        }

        if (isNumeric(yearField.getText())) {
            int year = Integer.parseInt(yearField.getText());
        }

        String username = usernameField.getText();
        String password = passwordField.getText();
        String confirmPassword = confirmPasswordField.getText();
        String userType = (String)chooseUserType.getSelectionModel().getSelectedItem();
        if (firstName.equals("") || lastName.equals("") || username.equals("") || password.equals("") || confirmPassword.equals("") || userType.equals("")) {
            errorLabel.setText("One or more fields not complete. Please fill in all fields.");
        }

    }

    public void handleBackButton(ActionEvent event) throws IOException {
        this.sc.switchToLoginPage(event);
    }

    public boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        } else {
            try {
                int var2 = Integer.parseInt(strNum);
                return true;
            } catch (NumberFormatException var3) {
                return false;
            }
        }
    }
}
