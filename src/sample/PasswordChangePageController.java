package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class PasswordChangePageController {

    public PasswordField oldPasswordField;
    public PasswordField newPasswordField;
    public PasswordField confirmNewPasswordField;
    public Button changePasswordButton;
    public Button backButton;
    public SceneController sc = new SceneController();

    public void handleChangePasswordButton() {
        if (newPasswordField == confirmNewPasswordField) {
            System.out.println("New Password: " + newPasswordField.getText());
        }else {
            System.out.println("New Password and Confirm New Password Fields Do Not Match!");
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
