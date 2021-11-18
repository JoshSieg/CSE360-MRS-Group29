package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;

import java.io.IOException;

public class PrescriptionsPageController {
    public Button addNewButton;
    public Button backButton;
    public SceneController sc = new SceneController();

    public void handleBackButton(ActionEvent event) throws IOException {
        if (UserManager.getCurrentUserType().equals("Patient")) {
            sc.switchToPatientPage(event);
        }
        else if (UserManager.getCurrentUserType().equals("Doctor")) {
            sc.switchToDoctorPage(event);
        }
        else if (UserManager.getCurrentUserType().equals("Nurse")) {
            sc.switchToNursePage(event);
        }
    }

    public void handleAddNewButton(ActionEvent event) {
        //add new
    }
}
