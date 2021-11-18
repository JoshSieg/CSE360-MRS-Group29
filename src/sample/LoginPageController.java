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
        Patient currentPatient = null;
        Doctor currentDoctor = null;
        Nurse currentNurse = null;
        String currentUserType = "";
        errorLabel.setText("");
        //check for matching credentials for each of the user types
        for (Patient patient : UserManager.getAllPatients()) {
            if(patient.getUsername().equals(usernameField.getText()) && patient.getPassword().equals(passwordField.getText())) {
                currentPatient = patient;
                currentUserType = "Patient";
            }
        }
        for (Doctor doctor : UserManager.getAllDoctors()) {
            if(doctor.getUsername().equals(usernameField.getText()) && doctor.getPassword().equals(passwordField.getText())) {
                currentDoctor = doctor;
                currentUserType = "Doctor";
            }
        }
        for (Nurse nurse : UserManager.getAllNurses()) {
            if(nurse.getUsername().equals(usernameField.getText()) && nurse.getPassword().equals(passwordField.getText())) {
                currentNurse = nurse;
                currentUserType = "Nurse";
            }
        }
        //set current user and go to corresponding user page if there is a user with matching username and password
        if ((currentDoctor != null || currentPatient != null || currentNurse != null) && currentUserType != "") {
            UserManager.setCurrentUserType(currentUserType);
            if (UserManager.getCurrentUserType().equals("Patient")) {
                UserManager.setCurrentPatient(currentPatient);
                sc.switchToPatientPage(event);
            }
            else if (UserManager.getCurrentUserType().equals("Doctor")) {
                UserManager.setCurrentDoctor(currentDoctor);
                sc.switchToDoctorPage(event);
            }
            else if (UserManager.getCurrentUserType().equals("Nurse")) {
                UserManager.setCurrentNurse(currentNurse);
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
