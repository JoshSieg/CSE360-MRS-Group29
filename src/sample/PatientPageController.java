package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class PatientPageController {

    public Button editViewProfileButton;
    public Button pharmacyInfoButton;
    public Button logoutButton;

    public SceneController sc = new SceneController();

    public void handleLogoutButton(ActionEvent event) throws IOException {
        sc.switchToLoginPage(event);
    }
    public void handleViewProfile(ActionEvent event) throws IOException {
        System.out.println("clicked view profile");
        sc.switchToProfilePage(event);
    }
    public void handlePharmacyInfo(ActionEvent event) throws IOException {
        System.out.println("clicked pharmacy");
        sc.switchToPharmacyInfoPage(event);
    }
}
