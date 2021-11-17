package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ProfilePageController {
    public String height;
    public String weight;
    public String bodyTemp;
    public String bloodPressure;

    public Button saveChangesButton;
    public Button backButton;
    public TextField heightField;
    public TextField weightField;
    public TextField bodyTempField;
    public TextField bloodPressureField;
    public SceneController sc = new SceneController();

    public void handleSaveChangesButton() {
        if(heightField != null) {
            height = heightField.getText();
        } //else do nothing
        if(weightField != null) {
            weight = weightField.getText();
        } //else do nothing
        if(bodyTempField != null) {
            bodyTemp = bodyTempField.getText();
        } //else do nothing
        if(bloodPressureField != null) {
            bloodPressure = bloodPressureField.getText();
        } //else do nothing
        System.out.println("Saved New Patient Info");
    }

    public void handleBackButton (ActionEvent event) throws IOException {
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
}
