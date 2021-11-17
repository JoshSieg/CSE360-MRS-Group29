package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.IOException;

public class LoginPageController {

    public Button loginButton;
    public Button newAccountButton;
    public TextField usernameField;
    public PasswordField passwordField;
    public Hyperlink forgotPasswordButton;
    public Label errorLabel;
    public SceneController sc = new SceneController();

    public void handleLoginButton(ActionEvent event) throws IOException {
        User currentUser = null;
        errorLabel.setText("");
        //check for matching credentials for each of the user types
        for (Patient patient : UserManager.getAllPatients()) {
            if(patient.getUsername().equals(usernameField.getText()) && patient.getPassword().equals(passwordField.getText())) {
                currentUser = patient;
            }
        }
        for (Doctor doctor : UserManager.getAllDoctors()) {
            if(doctor.getUsername().equals(usernameField.getText()) && doctor.getPassword().equals(passwordField.getText())) {
                currentUser = doctor;
            }
        }
        for (Nurse nurse : UserManager.getAllNurses()) {
            if(nurse.getUsername().equals(usernameField.getText()) && nurse.getPassword().equals(passwordField.getText())) {
                currentUser = nurse;
            }
        }
        //set current user and go to corresponding user page if there is a user with matching username and password
        if (currentUser != null) {
            UserManager.setCurrentUser(currentUser);
            if (UserManager.getCurrentUser().getClass() == Patient.class) {
                sc.switchToPatientPage(event);
            }
            else if (UserManager.getCurrentUser().getClass() == Doctor.class) {
                sc.switchToDoctorPage(event);
            }
            else if (UserManager.getCurrentUser().getClass() == Nurse.class) {
                sc.switchToNursePage(event);
            }
        } else {
            errorLabel.setText("Incorrect username or password.");
        }
    }

    public void handleNewAccountButton(ActionEvent event) throws IOException {
        sc.switchToAccountCreationPage(event);
    }
    
    public void handleForgotPasswordButton(ActionEvent event) throws IOException {
        sc.switchToPasswordChangePage(event);
    }
}
