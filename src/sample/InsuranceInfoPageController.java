package sample;

import javafx.event.ActionEvent;
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

    public void handleProviderButton (ActionEvent event) {
        if (providerButton.getText().equals("Edit")) {
            insuranceProvider.setEditable(true);
            providerButton.setText("Save");
        } else if (providerButton.getText().equals("Save")) {
            insuranceProvider.setEditable(false);
            providerButton.setText("Edit");
        }
    }

    public void handlePlanNumberButton (ActionEvent event) {
        if (planNumberButton.getText().equals("Edit")) {
            healthPlanNumber.setEditable(true);
            planNumberButton.setText("Save");
        } else if (planNumberButton.getText().equals("Save")) {
            healthPlanNumber.setEditable(false);
            planNumberButton.setText("Edit");
        }
    }

    public void handleIDButton (ActionEvent event) {
        if (IDButton.getText().equals("Edit")) {
            memberID.setEditable(true);
            IDButton.setText("Save");
        } else if (IDButton.getText().equals("Save")) {
            memberID.setEditable(false);
            IDButton.setText("Edit");
        }
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

