import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
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

    @FXML private TextField signUpPageFirstNameTextBox;
    @FXML private TextField signUpPageLastNameTexBox;
    @FXML private DatePicker signUpPageBirthdayCalander;
    @FXML private TextField signUpPageAddressTextBox;
    @FXML private TextField signUpPagePhoneNumberTextBox;
    @FXML private TextField signUpPagePhoneNumberText;
    @FXML private TextField signUpPageInsuranceIdTextBox;
    @FXML private TextField signUpPageUserNameTextBox;
    @FXML private TextField signUpPagePasswordTextBox;
    @FXML private TextField signUpPagePharmacyAddressTextBox;
    @FXML private RadioButton signUpPagePatientRadioButton;
    @FXML private RadioButton signUpPageDoctorRadioButton;
    @FXML private RadioButton signUpPageNurseRadioButton;
    @FXML private ToggleGroup signUpUserType;
    @FXML private Button signUpPageSignUpButton;

    @FXML private Pane signUpInsurancePane;
    @FXML private Pane signUpPharmacyPane;
    //@FXML private TextField signUpFirstName;
    //@FXML private TextField signUpLastName;
    //@FXML private DatePicker signUpBirthday;
    //@FXML private TextField signUpUsername;
    //@FXML private PasswordField signUpPassword;
    //@FXML private RadioButton signUpRadioPatient;
    //@FXML private RadioButton signUpRadioNurse;
    //@FXML private RadioButton signUpRadioDoctor;
    //@FXML private Button signUpSignUpButton;



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

    // Edit Patient Info
    @FXML private TextField editPersonalInformationFirstName;
    @FXML private TextField editPersonalInformationLastName;
    @FXML private DatePicker editPersonalInformationBirthday;
    @FXML private TextField editPersonalInformationPhoneNumber;
    @FXML private TextField editPersonalInformationAddress;
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
    @FXML private TextField nurseHomePatientListPatientInsuranceName;
    @FXML private TextField nurseHomePatientListPatientInsurancePolicyID;
    @FXML private TextField nurseHomePatientListPatientInsuranceGroupNumber;
    @FXML private ListView nurseHomePatientListPatientUpcomingAppointments;
    @FXML private Button nurseHomePatientListSelectPatientButton;

    // Create Appointment screen
    @FXML private TextField createAppointmentFirstName;
    @FXML private TextField createAppointmentLastName;
    @FXML private TextField createAppointmentPatientIDNumber;
    @FXML private DatePicker createAppointmentDate;
    @FXML private TextField createAppointmentHour;
    @FXML private TextField createAppointmentMinute;
    @FXML private TextField createAppointmentDoctorID;
    @FXML private Button createAppointmentCreateButton;

    // Nurse Patient Info screen
    @FXML private TextField nursePatientInfoFirstName;
    @FXML private TextField nursePatientInfoLastName;
    @FXML private TextField nursePatientInfoAge;
    @FXML private TextField nursePatientInfoWeight;
    @FXML private TextField nursePatientInfoHeight;
    @FXML private TextField nursePatientInfoBloodType;
    @FXML private TextArea nursePatientInfoPrescriptions;
    @FXML private TextArea nursePatientInfoNotes;
    @FXML private Button nursePatientInfoCloseButton;

    // Doctor Home screen
    // Home tab
    @FXML private ListView doctorHomeAppointmentList;
    // Patient List tab
    @FXML private ListView doctorHomePatientList;
    @FXML private TextField doctorHomePatientListPatientAddress;
    @FXML private TextField doctorHomePatientListPatientPhoneNumber;
    @FXML private DatePicker doctorHomePatientListPatientBirthday;
    @FXML private TextField doctorHomePatientListPatientInsuranceName;
    @FXML private TextField doctorHomePatientListPatientInsurancePolicyID;
    @FXML private TextField doctorHomePatientListPatientInsuranceGroupNumber;
    @FXML private ListView doctorHomePatientListPatientUpcomingAppointments;
    @FXML private Button doctorHomePatientListSelectPatientButton;

    // Doctor Patient Info screen
    @FXML private TextField doctorPatientInfoFirstName;
    @FXML private TextField doctorPatientInfoLastName;
    @FXML private TextField doctorPatientInfoAge;
    @FXML private TextField doctorPatientInfoWeight;
    @FXML private TextField doctorPatientInfoHeight;
    @FXML private TextField doctorPatientInfoBloodType;
    @FXML private TextArea doctorPatientInfoPrescriptions;
    @FXML private TextArea doctorPatientInfoNotes;
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
        if (signUpUserType.getSelectedToggle() != signUpPagePatientRadioButton) {
            signUpInsurancePane.setVisible(false);
            signUpPharmacyPane.setVisible(false);
        }

        if (signUpUserType.getSelectedToggle() == signUpPagePatientRadioButton) {
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

    /*
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
            signUpUsername.clear();
            signUpPassword.clear();
            signUpRadioPatient.setSelected(true);
        }
    }
    */

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
    public void handleEditPersonalInformation() {
        //TODO: This has to save the data entered over the current patient's information, replacing it

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
