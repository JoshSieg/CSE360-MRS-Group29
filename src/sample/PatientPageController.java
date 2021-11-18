package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


import java.io.IOException;

public class PatientPageController {

    public Button editViewProfileButton;
    public Button pharmacyInfoButton;
    public Button logoutButton;
    public Button insuranceInfoButton;
    public Label patientName;

//
    @FXML
    public void initialize() {
        patientName.setText(UserManager.getCurrentPatient().getName() + "'s info: ");
    }
    public SceneController sc = new SceneController();

    public void handleLogoutButton(ActionEvent event) throws IOException {
        sc.switchToLoginPage(event);
    }
    public void handleInsuranceInfoButton(ActionEvent event) throws IOException {
        sc.switchToInsuranceInfoPage(event);
    }
    public void handleViewProfile(ActionEvent event) throws IOException {
        sc.switchToProfilePage(event);
    }
    public void handlePharmacyInfo(ActionEvent event) throws IOException {
        sc.switchToPharmacyInfoPage(event);
    }
}
