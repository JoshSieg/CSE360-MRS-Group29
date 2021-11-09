package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ProfilePageController {
    public String height;
    public String weight;
    public String bodyTemp;
    public String bloodPreasure;

    public Button saveChangesButton;
    public Button backButton;
    public TextField heightField;
    public TextField weightField;
    public TextField bodyTempField;
    public TextField bloodPreasureField;
    public SceneController sc = new SceneController();

    public void handleSaveChangesButton() {
        if(heightField != NULL) {
            height = heightField.getText();
        } //else do nothing
        if(weightField != NULL) {
            weight = weightField.getText();
        } //else do nothing
        if(bodyTempField != NULL) {
            bodyTemp = bodyTempField.getText();
        } //else do nothing
        if(bloodPreasureField != NULL) {
            bloodPreasure = bloodPreasureField.getText();
        } //else do nothing
        System.out.println("Saved New Patient Info");
    }

    public void handleBackButton (ActionEvent event) throws IOException {
        if(patient) {
            sc.switchToPatientPage(event);
        } else if(nurse) {
            sc.switchToNursePage(event);
        } else
            sc.switchToDoctorPage(event);
    }
}

}
