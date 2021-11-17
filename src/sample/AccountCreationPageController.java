package sample;

import java.io.IOException;
import java.util.Random;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

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
        boolean validInput = true;

        int month = 0;
        int day = 0;
        int year = 0;

        errorLabel.setText("");
        errorLabel.setTextFill(Color.RED);
        //check if the month field has an integer in it and set the month variable if so
        if (isNumeric(monthField.getText())) {
            month = Integer.parseInt(monthField.getText());
            //check to make sure the month is in a valid range
            if (month < 1 || month > 12) {
                errorLabel.setText("Invalid month value, please enter a value from 1 through 12.");
                validInput = false;
            }
        }

        //check if the day field has an integer in it and set the day variable if so
        if (isNumeric(dayField.getText())) {
            day = Integer.parseInt(dayField.getText());
            //check to make sure the day is in a valid range, based on which month is entered
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                if (day < 1 || day > 31) {
                    errorLabel.setText("Invalid day value, please enter a value from 1 through 31.");
                    validInput = false;
                }
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                if (day < 1 || day > 30) {
                    errorLabel.setText("Invalid day value, please enter a value from 1 through 30.");
                    validInput = false;
                }
            } else if (month == 2) {
                if (day < 1 || day > 29) {
                    errorLabel.setText("Invalid day value, please enter a value from 1 through 29.");
                    validInput = false;
                }
            }
        }

        //check if the year field has an integer in it and set the year variable if so
        if (isNumeric(yearField.getText())) {
            year = Integer.parseInt(yearField.getText());
            //check to make sure the year is in a valid range
            if (year < 1900) {
                errorLabel.setText("Invalid birth year.");
                validInput = false;
            }
        }

        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String username = usernameField.getText();
        String password = passwordField.getText();
        String confirmPassword = confirmPasswordField.getText();
        String userType = (String)chooseUserType.getSelectionModel().getSelectedItem();
        System.out.println(userType);

        if (firstName.equals("") || lastName.equals("") || username.equals("") || password.equals("") || confirmPassword.equals("") || userType.equals("User Type")) {
            errorLabel.setText("One or more fields not complete. Please fill in all fields.");
            validInput = false;
        } else if(isUsernameTaken(username)) {
            errorLabel.setText("Username already taken.");
            validInput = false;
        } else if (!password.equals(confirmPassword)) {
            errorLabel.setText("Passwords do not match.");
            validInput = false;
        }

        if (validInput) {
            if (userType.equals("Patient")) {
                UserManager.getAllPatients().add(new Patient((firstName + " " + lastName), username, password, year, month, day));
            } else if (userType.equals("Doctor")) {
                Nurse randNurse;
                int range = UserManager.getAllNurses().size();
                Random rand = new Random();
                randNurse = UserManager.getAllNurses().get(rand.nextInt(range));
                UserManager.getAllDoctors().add(new Doctor((firstName + " " + lastName), username, password, randNurse));
            } else if (userType.equals("Nurse")) {
                UserManager.getAllNurses().add(new Nurse((firstName + " " + lastName), username, password));
            } else {
                errorLabel.setText("Could not create account.");
                return;
            }
            errorLabel.setText("Account successfully created.");
            errorLabel.setTextFill(Color.GREEN);
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

    public boolean isUsernameTaken(String username) {
        for (Patient patient : UserManager.getAllPatients()) {
            if (patient.getUsername().equals(username)) {
                return true;
            }
        }
        for (Doctor doctor : UserManager.getAllDoctors()) {
            if (doctor.getUsername().equals(username)) {
                return true;
            }
        }
        for (Nurse nurse : UserManager.getAllNurses()) {
            if (nurse.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }
}
