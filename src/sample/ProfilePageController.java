package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.*;

public class ProfilePageController {
    public String height;
    public String weight;
    public String bodyTemp;
    public String bloodPressure;

    public Button backButton;
    public VBox visitBox;
    public Button visitButton;
    public Label heightLabel;
    public Label weightLabel;
    public Label bodyTempLabel;
    public Label bloodPressureLabel;
    public Label reasonForVisitLabel;
    public SceneController sc = new SceneController();



    @FXML
    public void initialize() {
        ToggleButton tempButton;
        ToggleGroup tg = new ToggleGroup();
        for (int i = 0; i < UserManager.getCurrentPatient().getVisits().size(); i++) {
            tempButton = new ToggleButton(UserManager.getCurrentPatient().getVisits().get(i).getDate().toString());
            tempButton.setOnAction(this::handleClickVisit);
            tempButton.setMinWidth(198);
            tempButton.setToggleGroup(tg);
            visitBox.getChildren().add(tempButton);
        }
    }

    public void handleClickVisit(ActionEvent event) {
        String selectedDate = ((ToggleButton)event.getSource()).getText();
        int j = 0;
        for(int i = 0; i < UserManager.getCurrentPatient().getVisits().size(); i++) {
            if(UserManager.getCurrentPatient().getVisits().get(i).getDate().toString() == selectedDate) {
                j = i;
            }
        }
        heightLabel.setText(Float.toString(UserManager.getCurrentPatient().getVisits().get(j).getHeight()));
        weightLabel.setText(Float.toString(UserManager.getCurrentPatient().getVisits().get(j).getWeight()));
        bodyTempLabel.setText(Float.toString(UserManager.getCurrentPatient().getVisits().get(j).getBodyTemp()));
        bloodPressureLabel.setText(Float.toString(UserManager.getCurrentPatient().getVisits().get(j).getBloodPressure()));
        reasonForVisitLabel.setText(UserManager.getCurrentPatient().getVisits().get(j).getReasonForVisit());
    }


    public void handleBackButton (ActionEvent event) throws IOException {
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
}
