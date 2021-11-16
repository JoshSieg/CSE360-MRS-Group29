package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class NursePageController {

    public Button patientSearchButton;
    public Button editViewProfileButton;
    public Button pharmacyInfoButton;
    public Button logoutButton;

    public UserManager currentNurse = new UserManager();

    public SceneController sc = new SceneController();

    public void handleLogoutButton(ActionEvent event) throws IOException {
        System.out.println("logged out succesfully");
        sc.switchToLoginPage(event);
    }

    public void handlePatientSearch(ActionEvent event) throws IOException {
        System.out.println("clicked patient search");
        sc.switchToPatientPage(event);
    }
    public void handleViewProfile(ActionEvent event) throws IOException {
        System.out.println("clicked view profile");
        sc.switchToProfilePage(event);
    }
    public void handlePharmacyInfo(ActionEvent event) throws IOException {
        System.out.println("clicked pharmacy info");
        sc.switchToPharmacyInfoPage(event);
    }
}
