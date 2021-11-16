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
    ObservableList<String> userTypeList = FXCollections.observableArrayList(new String[]{"Patient", "Nurse", "Doctor"});

    public AccountCreationPageController() {
    }

    @FXML
    private void initialize() {
        this.chooseUserType.setValue("User Type");
        this.chooseUserType.setItems(this.userTypeList);
    }

    public void handleCreateAccountButton() {
        String firstName = this.firstNameField.getText();
        String lastName = this.lastNameField.getText();
        if (this.isNumeric(this.monthField.getText())) {
            int month = Integer.parseInt(this.monthField.getText());
        }

        if (this.isNumeric(this.dayField.getText())) {
            int day = Integer.parseInt(this.dayField.getText());
        }

        if (this.isNumeric(this.yearField.getText())) {
            int year = Integer.parseInt(this.yearField.getText());
        }

        String username = this.usernameField.getText();
        String password = this.passwordField.getText();
        String confirmPassword = this.confirmPasswordField.getText();
        String userType = (String)this.chooseUserType.getSelectionModel().getSelectedItem();
        if (firstName.equals("") || lastName.equals("") || username.equals("") || password.equals("") || confirmPassword.equals("") || userType.equals("")) {
            this.errorLabel.setText("One or more fields not complete. Please fill in all fields.");
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
