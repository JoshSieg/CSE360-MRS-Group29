package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;

import java.io.IOException;

public class PrescriptionsPageController {
    public Button addNewButton;
    public Button backButton;
    public SceneController sc = new SceneController();

    public void handleBackButton(ActionEvent event) throws IOException {
        if (UserManager.getCurrentUser().getClass() == Patient.class) {
            sc.switchToPatientPage(event);
        }
        else if (UserManager.getCurrentUser().getClass() == Doctor.class) {
            sc.switchToDoctorPage(event);
        }
        else if (UserManager.getCurrentUser().getClass() == Nurse.class) {
            sc.switchToNursePage(event);
        }
    }

    public void handleAddNewButton(ActionEvent event) {

    }
}
