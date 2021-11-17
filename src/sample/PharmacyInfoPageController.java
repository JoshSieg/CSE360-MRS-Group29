package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class PharmacyInfoPageController {
    public TextField pharmacyName;
    public TextField pharmacyAddress;
    public TextField pharmacyPhone;
    public Button nameButton;
    public Button addressButton;
    public Button phoneButton;
    public Button backButton;
    public SceneController sc = new SceneController();

    public void handleNameButton (ActionEvent event) {
        if (nameButton.getText().equals("Edit")) {
            pharmacyName.setEditable(true);
            nameButton.setText("Save");
        } else if (nameButton.getText().equals("Save")) {
            pharmacyName.setEditable(false);
            nameButton.setText("Edit");
        }
    }

    public void handleAddressButton (ActionEvent event) {
        if (addressButton.getText().equals("Edit")) {
            pharmacyAddress.setEditable(true);
            addressButton.setText("Save");
        } else if (addressButton.getText().equals("Save")) {
            pharmacyAddress.setEditable(false);
            addressButton.setText("Edit");
        }
    }

    public void handlePhoneButton (ActionEvent event) {
        if (phoneButton.getText().equals("Edit")) {
            pharmacyPhone.setEditable(true);
            phoneButton.setText("Save");
        } else if (phoneButton.getText().equals("Save")) {
            pharmacyPhone.setEditable(false);
            phoneButton.setText("Edit");
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
