import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class Controller {
    /*
    // Account Type screen
    @FXML private Button accountTypePatient;
    @FXML private Button accountTypeNurse;
    @FXML private Button accountTypeDoctor;
    @FXML private Button accountTypeCreateAccount;
    */

    // Sign In screen
    @FXML private TextField signInUsername;
    @FXML private TextField signInPassword;
    @FXML private Button signInSignInButton;
    @FXML private Button signInCreateAccountButton;

    // Sign up screen
    @FXML private TextField signUpFirstName;
    @FXML private TextField signUpLastName;
    @FXML private DatePicker signUpBirthday;
    @FXML private TextField signUpUsername;
    @FXML private PasswordField signUpPassword;
    @FXML private RadioButton signUpRadioPatient;
    @FXML private RadioButton signUpRadioNurse;
    @FXML private RadioButton signUpRadioDoctor;

    // Patient Home screen
    // Home tab
    @FXML private ListView patientHomeUpcomingAppointments;
    @FXML private TextField patientHomeDoctorName;
    @FXML private TextField patientHomeNurseName;
    @FXML private TextField patientHomePatientFirstName;
    @FXML private TextField patientHomePatientLastName;
    @FXML private DatePicker patientHomePatientBirthday;
    @FXML private TextField patientHomePatientAddress;
    @FXML private TextField patientHomePatientPhoneNumber;
    @FXML private Button patientHomeEditPatientPersonalInfoButton;
    // Medical Record tab
    @FXML private TextArea patientHomePatientMedicalInfo;
    @FXML private TextArea patientHomePatientPrescriptions;
    @FXML private TextArea patientHomePatientInstructions;

    // Error box
    @FXML private Button errorButton;

    private void errorDialogue() {
        Parent errorBox;
        try {
            errorBox = FXMLLoader.load(getClass().getResource("ErrorDialogue.fxml"));
            Stage error = new Stage();
            error.setTitle("Error");
            error.setScene(new Scene(errorBox, 400, 200));
            error.show();
        } catch (IOException e) {
            e.getMessage();
        }
    }

    @FXML
    public void handleCloseWindow() {
        Stage stage = (Stage) errorButton.getScene().getWindow();
        stage.close();

    }

    // This is an example function to show how to get data from the UI fields.
    public void handleAddUser() {
        try {
            String firstNameEntry = signUpFirstName.getText();
            String lastNameEntry = signUpLastName.getText();
            LocalDate birthdayEntry = signUpBirthday.getValue();
            String usernameEntry = signUpUsername.getText();
            String passwordEntry = signUpPassword.getText();

            String personType = "NULL";
            if (signUpRadioPatient.isSelected()) {
                personType = "Patient";
            } else if (signUpRadioNurse.isSelected()) {
                personType = "Nurse";
            } else if (signUpRadioDoctor.isSelected()) {
                personType = "Doctor";
            }


            if (firstNameEntry.isEmpty() || lastNameEntry.isEmpty() || usernameEntry.isEmpty() || passwordEntry.isEmpty()) {
                throw new Exception();
            }


            System.out.println("First Name: " + firstNameEntry);
            System.out.println("Last Name: " + lastNameEntry);
            System.out.println("Birthday: " + birthdayEntry.toString());
            System.out.println("Username: " + usernameEntry);
            System.out.println("Password: " + passwordEntry);
            System.out.println("User Type: " + personType);
        } catch (Exception e) {
            e.getStackTrace();
            errorDialogue();

            signUpFirstName.clear();
            signUpLastName.clear();
            signUpBirthday.setValue(LocalDate.EPOCH); // No good way to clear this as far as I can tell.
            signUpUsername.clear();
            signUpPassword.clear();
            signUpRadioPatient.setSelected(true);
        }
    }
}
