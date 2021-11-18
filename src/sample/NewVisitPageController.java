package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;

public class NewVisitPageController {
    public TextField dateOfVisitField;
    public TextField heightField;
    public TextField weightField;
    public TextField bodyTempField;
    public TextField bloodPressureField;
    public TextField reasonOfVisitField;
    public Button backButton;
    public Button addNewVisitButton;
    public SceneController sc = new SceneController();

    public void handleBackButton (ActionEvent event) throws IOException {
        sc.switchToNursePage(event);
    }
    public void handleAddNewVisitButton (ActionEvent event) throws IOException {
        float height = Float.parseFloat(heightField.getText());
        float weight = Float.parseFloat(weightField.getText());
        float bodyTemp = Float.parseFloat(bodyTempField.getText());
        float bloodPressure = Float.parseFloat(bloodPressureField.getText());
        String reason = reasonOfVisitField.getText();

        UserManager.getCurrentPatient().newVisit(height, weight, bodyTemp, bloodPressure, reason);
        sc.switchToNewVisitPage(event);
    }


}
