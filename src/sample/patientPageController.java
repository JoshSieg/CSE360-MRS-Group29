package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class patientPageController {

    public Button editViewProfileButton;
    public Button scheduleButton;
    public Button pharmacyInfoButton;
    public Button labResultsButton;
    public Button logoutButton;

    public SceneController sc = new SceneController();

    public void handleLogoutButton(ActionEvent event) throws IOException {
        sc.switchToLoginPage(event);
    }

    public void handleViewProfile() {
        System.out.println("clicked view profile");
    }

    public void handleScheduleAppointment() {
        System.out.println("clicked schedule appointment");
    }

    public void handlePharmacyInfo() {
        System.out.println("clicked pharmacy");
    }

    public void handleLabResults() {
        System.out.println("clicked handle lab results");
    }
}
