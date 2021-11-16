import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;
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
    @FXML private TextField signUpAddress;
    @FXML private TextField signUpPhoneNumber;
    @FXML private TextField signUpUsername;
    @FXML private TextField signUpPassword;
    @FXML private TextField signUpInsuranceId;
    @FXML private TextField signUpPharmacyAddress;

    @FXML private RadioButton signUpPatientRadio;
    @FXML private RadioButton signUpDoctorRadio;
    @FXML private RadioButton signUpNurseRadio;
    @FXML private ToggleGroup signUpUserType;

    @FXML private Button signUpSignUpButton;

    @FXML private Pane signUpInsurancePane;
    @FXML private Pane signUpPharmacyPane;

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
    @FXML private TextField patientHomePatientInsuranceID;
    @FXML private TextField patientHomePatientPharmacyAddress;
    @FXML private Button patientHomeEditPatientPersonalInfoButton;
    // Medical Record tab
    @FXML private TextArea patientHomePatientMedicalInfo;
    @FXML private TextArea patientHomePatientPrescriptions;
    @FXML private TextArea patientHomePatientInstructions;

    // Edit Patient Info
    @FXML private TextField editPersonalInformationFirstName;
    @FXML private TextField editPersonalInformationLastName;
    @FXML private TextField editPersonalInformationPhoneNumber;
    @FXML private TextField editPersonalInformationAddress;
    @FXML private TextField editPersonalInformationInsuranceID;
    @FXML private TextField editPersonalInformationPharmacyAddress;
    @FXML private Button editPersonalInformationConfirmButton;

    // Nurse Home screen
    // Home tab
    @FXML private ListView nurseHomeAppointmentList;
    @FXML private Button nurseHomeNewAppointmentButton;
    // Patient List tab
    @FXML private ListView nurseHomePatientList;
    @FXML private TextField nurseHomePatientListPatientAddress;
    @FXML private TextField nurseHomePatientListPatientPhoneNumber;
    @FXML private DatePicker nurseHomePatientListPatientBirthday;
    @FXML private TextField nurseHomePatientListPatientInsuranceID;
    @FXML private TextField nurseHomePatientListPatientPharmacyAddress;
    @FXML private ListView nurseHomePatientListPatientUpcomingAppointments;
    @FXML private Button nurseHomePatientListSelectPatientButton;

    // Create Appointment screen
    @FXML private TextField createAppointmentPatientUsername;
    @FXML private DatePicker createAppointmentDate;
    @FXML private TextField createAppointmentHour;
    @FXML private TextField createAppointmentMinute;
    @FXML private TextField createAppointmentDoctorUsername;
    @FXML private Button createAppointmentCreateButton;

    // Nurse Patient Info screen
    @FXML private TextField nursePatientInfoPatientUsername;
    @FXML private TextField nursePatientInfoWeight;
    @FXML private TextField nursePatientInfoHeight;
    @FXML private TextField nursePatientInfoBloodType;
    @FXML private TextArea nursePatientInfoNotes;

    @FXML private TextField nursePatientInfoPrescriptionName;
    @FXML private TextField nursePatientInfoPrescriptionDosageAmount;
    @FXML private TextField nursePatientInfoPrescriptionTimesPerMonth;

    @FXML private Button nursePatientInfoCloseButton;

    // Doctor Home screen
    // Home tab
    @FXML private ListView doctorHomeAppointmentList;
    // Patient List tab
    @FXML private ListView doctorHomePatientList;
    @FXML private TextField doctorHomePatientListPatientAddress;
    @FXML private TextField doctorHomePatientListPatientPhoneNumber;
    @FXML private DatePicker doctorHomePatientListPatientBirthday;
    @FXML private TextField doctorHomePatientListPatientInsuranceID;
    @FXML private TextField doctorHomePatientListPatientPharmacyAddress;
    @FXML private ListView doctorHomePatientListPatientUpcomingAppointments;
    @FXML private Button doctorHomePatientListSelectPatientButton;

    // Doctor Patient Info screen
    @FXML private TextField doctorPatientInfoPatientUsername;
    @FXML private TextField doctorPatientInfoWeight;
    @FXML private TextField doctorPatientInfoHeight;
    @FXML private TextField doctorPatientInfoBloodType;
    @FXML private TextArea doctorPatientInfoNotes;

    @FXML private TextField doctorPatientInfoPrescriptionName;
    @FXML private TextField doctorPatientInfoPrescriptionDosageAmount;
    @FXML private TextField doctorPatientInfoPrescriptionTimesPerMonth;

    @FXML private Button doctorPatientInfoCloseButton;
    @FXML private Button doctorPatientInfoSaveButton;

    // Error box
    @FXML private Button errorButton;

    /*********************************
     * General Handlers
     *
     * Generic handlers with no specific home
     ********************************/

    @FXML
    public void handleCloseStage(ActionEvent e) {
        Node source = (Node) e.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }

    @FXML
    public void handleToggleChange() {
        if (signUpUserType.getSelectedToggle() != signUpPatientRadio) {
            signUpInsurancePane.setVisible(false);
            signUpPharmacyPane.setVisible(false);
        }

        if (signUpUserType.getSelectedToggle() == signUpPatientRadio) {
            signUpInsurancePane.setVisible(true);
            signUpPharmacyPane.setVisible(true);
        }
    }

    /*********************************
     * Error Handlers
     *
     * Handler functions for anything related to throwing errors or adjacent.
     ********************************/

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

    /*********************************
     * Account Management
     *
     * Handler functions for everything related to accounts, whether signing into an account, creating an account, or adjacent.
     ********************************/

    // This is an example function to show how to get data from the UI fields.
    public void handleAddUser() {
        try {
            String firstName = signUpFirstName.getText();
            String lastName = signUpLastName.getText();

            int birthDay = signUpBirthday.getValue().getDayOfMonth();
            int birthMonth = signUpBirthday.getValue().getMonthValue();
            int birthYear = signUpBirthday.getValue().getYear();

            String address = signUpAddress.getText();
            long phoneNumber = Long.parseLong(signUpPhoneNumber.getText().replaceAll("-", ""));

            String username = signUpUsername.getText();
            String password = signUpPassword.getText();

            String insuranceID = signUpInsuranceId.getText();
            String pharmacyAddress = signUpPharmacyAddress.getText();

            if (firstName.isEmpty() || lastName.isEmpty() || address.isEmpty() || phoneNumber == 0 || username.isEmpty() || password.isEmpty()) {
                throw new Exception();
            }

            if (signUpPatientRadio.isSelected()) {
                // There is currently no insertPatient function
            } else if (signUpNurseRadio.isSelected()) {
                NurseDatabase.InsertNurse(firstName, lastName, birthDay, birthMonth, birthYear, address, phoneNumber, username, password);
            } else if (signUpDoctorRadio.isSelected()) {
                DoctorDatabase.InsertDoctor(firstName, lastName, birthDay, birthMonth, birthYear, address, phoneNumber, username, password, null);
            }

            try {
                Parent root = FXMLLoader.load(getClass().getResource("SignIn.fxml"));
                Stage primaryStage = (Stage) signUpSignUpButton.getScene().getWindow();
                primaryStage.setScene(new Scene(root, 700, 500));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.getStackTrace();
            errorDialogue();

            signUpFirstName.clear();
            signUpLastName.clear();
            signUpBirthday.setValue(LocalDate.EPOCH); // No good way to clear this as far as I can tell.
            signUpAddress.clear();
            signUpPhoneNumber.clear();
            signUpUsername.clear();
            signUpPassword.clear();
            signUpInsuranceId.clear();
            signUpPharmacyAddress.clear();
            signUpPatientRadio.setSelected(true);
        }
    }

    @FXML
    public void handleSignInButton() {
        //TODO: This needs to check the username and password for a matching pair in the database, then open a home page corresponding to that user.

        try {
            Parent root = FXMLLoader.load(getClass().getResource("DoctorHome.fxml"));
            Stage primaryStage = (Stage) signInSignInButton.getScene().getWindow();
            primaryStage.setScene(new Scene(root, 700, 500));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void handleCreateAccountButton() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("SignUp.fxml"));
            Stage primaryStage = (Stage) signInCreateAccountButton.getScene().getWindow();
            primaryStage.setScene(new Scene(root, 700, 500));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*********************************
     * Nurse Home
     *
     * Handler functions for everything accessed from NurseHome.fxml and child.
     ********************************/

    @FXML
    public void handleOpenNewAppointment() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("CreateAppointment.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void handleNursePatientListSelectPatientButton() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("NursePatientInfo.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void handleCreateAppointment() {
        //TODO: Actually create an appointment and put it in the database

        Stage stage = (Stage) createAppointmentCreateButton.getScene().getWindow();
        stage.close();
    }

    /*********************************
     * Patient Home
     *
     * Handler functions for everything accessed from PatientHome.fxml and child.
     ********************************/

    @FXML
    public void handleEditPersonalInformationButton() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("EditPatientInfo.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void handleEditPersonalInformation() throws ClassNotFoundException, SQLException {
        //TODO: This has to save the data entered over the current patient's information, replacing it
        String newFirstName = editPersonalInformationFirstName.getText();
        PatientDatabase.setPatientFirstName(Main.getCurrentUser(), newFirstName);

        String newLastName = editPersonalInformationLastName.getText();
        PatientDatabase.setPatientLastName(Main.getCurrentUser(), newLastName);

        long newPhoneNumber = Long.parseLong(editPersonalInformationPhoneNumber.getText().replaceAll("-", ""));
        PatientDatabase.setPatientPhoneNumber(Main.getCurrentUser(), newPhoneNumber);

        String newAddress = editPersonalInformationAddress.getText();
        PatientDatabase.setPatientAddress(Main.getCurrentUser(), newAddress);

        String newInsuranceID = editPersonalInformationInsuranceID.getText();
        // Need insuranceID variable in database

        String newPharmacyAddress = editPersonalInformationPharmacyAddress.getText();
        // Need pharmacyAddress variable in database

        Stage stage = (Stage) editPersonalInformationConfirmButton.getScene().getWindow();
        stage.close();
    }

    /*********************************
     * Doctor Home
     *
     * Handler functions for everything accessed from DoctorHome.fxml and child.
     ********************************/

    @FXML
    public void handleDoctorPatientListSelectPatientButton() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("DoctorPatientInfo.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void handleDoctorPatientInfoSave() {
        //TODO: This has to record the medical info entered as a consultation of some sort.

        Stage stage = (Stage) doctorPatientInfoSaveButton.getScene().getWindow();
        stage.close();
    }
}
