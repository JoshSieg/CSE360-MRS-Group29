package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class InsuranceInfoPageController {
    public TextField insuranceProvider;
    public TextField healthPlanNumber;
    public TextField memberID;
    public Button providerButton;
    public Button planNumberButton;
    public Button IDButton;
    public Button backButton;
    public SceneController sc = new SceneController();

    @FXML
    public void initialize() {
        insuranceProvider.setText(UserManager.getCurrentPatient().getInsuranceProvider());
        healthPlanNumber.setText(UserManager.getCurrentPatient().getHealthPlanNumber());
        memberID.setText(UserManager.getCurrentPatient().getMemberID());
    }

    public void handleProviderButton (ActionEvent event) {
        if (providerButton.getText().equals("Edit")) {
            insuranceProvider.setEditable(true);
            providerButton.setText("Save");
        } else if (providerButton.getText().equals("Save")) {
            insuranceProvider.setEditable(false);
            providerButton.setText("Edit");
            UserManager.getCurrentPatient().setInsuranceProvider(insuranceProvider.getText());
        }
    }

    public void handlePlanNumberButton (ActionEvent event) {
        if (planNumberButton.getText().equals("Edit")) {
            healthPlanNumber.setEditable(true);
            planNumberButton.setText("Save");
        } else if (planNumberButton.getText().equals("Save")) {
            healthPlanNumber.setEditable(false);
            planNumberButton.setText("Edit");
            UserManager.getCurrentPatient().setHealthPlanNumber(healthPlanNumber.getText());
        }
    }

    public void handleIDButton (ActionEvent event) {
        if (IDButton.getText().equals("Edit")) {
            memberID.setEditable(true);
            IDButton.setText("Save");
        } else if (IDButton.getText().equals("Save")) {
            memberID.setEditable(false);
            IDButton.setText("Edit");
            UserManager.getCurrentPatient().setMemberID(memberID.getText());
        }
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

