import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import java.util.ArrayList;

public class Controller {

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
    @FXML private TextArea patientHomeUpcomingAppointment;
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
    @FXML private TextArea nurseHomePatientListPatientUpcomingAppointment;
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
    @FXML private TextField nursePatientInfoBloodPressure;
    @FXML private TextArea nursePatientInfoNotes;

    @FXML private ListView nursePatientInfoCurrentPrescriptions;

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
    @FXML private TextArea doctorHomePatientListPatientUpcomingAppointment;
    @FXML private Button doctorHomePatientListSelectPatientButton;

    // Doctor Patient Info screen
    @FXML private TextField doctorPatientInfoPatientUsername;
    @FXML private TextField doctorPatientInfoWeight;
    @FXML private TextField doctorPatientInfoHeight;
    @FXML private TextField doctorPatientInfoBloodPressure;
    @FXML private TextArea doctorPatientInfoNotes;

    @FXML private ListView doctorPatientInfoCurrentPrescriptions;

    @FXML private TextField doctorPatientInfoPrescriptionName;
    @FXML private TextField doctorPatientInfoPrescriptionDosageAmount;
    @FXML private TextField doctorPatientInfoPrescriptionTimesPerMonth;

    @FXML private Button doctorPatientInfoCloseButton;
    @FXML private Button doctorPatientInfoSaveButton;

    // Error boxes
    @FXML private Button errorButton;

    @FXML private Button usernameTakenButton;

    /*********************************
     * General Handlers
     *
     * Generic handlers with no specific home
     ********************************/

    @FXML
    public ObservableList getPatientList() {
        // Test Data
        Patient johnDoe98 = new Patient("John", "Doe", LocalDate.of(1998, 12, 12), "510 Whatever St.", "5551231234", "johnDoe98", "password1234", null, "ABCWhoCares", "123 Pharmacy Rd.");
        Patient mattSmith01 = new Patient("Matt", "Smith", LocalDate.of(2001, 5, 2), "123 Halloween Avenue", "5552342345", "mattSmith01", "password1234", null, "AnotherFakeID", "123 Pharmacy Rd.");
        Patient janeDoe08 = new Patient("Jane", "Doe", LocalDate.of(2008, 2, 5), "510 Whatever St.", "5551231234", "janeDoe08", "password1234", null, "ABCWhoCares", "123 Pharmacy Rd.");

        ArrayList<Patient> patientList = new ArrayList<>();
        patientList.add(johnDoe98);
        patientList.add(mattSmith01);
        patientList.add(janeDoe08);

        ObservableList<Patient> patients = FXCollections.observableArrayList();
        patients.setAll(patientList);

        return patients;
    }

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
            String phoneNumber = signUpPhoneNumber.getText();

            String username = signUpUsername.getText();
            String password = signUpPassword.getText();

            String insuranceID = signUpInsuranceId.getText();
            String pharmacyAddress = signUpPharmacyAddress.getText();

            if (firstName.isEmpty() || lastName.isEmpty() || address.isEmpty() || phoneNumber.isEmpty() || username.isEmpty() || password.isEmpty()) {
                throw new Exception();
            }

            if (signUpPatientRadio.isSelected()) {
                // There is currently no insertPatient function
            } else if (signUpNurseRadio.isSelected()) {
                //NurseDatabase.InsertNurse(firstName, lastName, birthDay, birthMonth, birthYear, address, phoneNumber, username, password);
            } else if (signUpDoctorRadio.isSelected()) {
                //DoctorDatabase.InsertDoctor(firstName, lastName, birthDay, birthMonth, birthYear, address, phoneNumber, username, password, null);
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
            Parent root = FXMLLoader.load(getClass().getResource("fxml/NursePatientInfo.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void populateNursePatientInfo() throws ClassNotFoundException, SQLException {
        Patient selectedPatient = new Patient(Main.getSelectedPatient());

        nursePatientInfoPatientUsername.setText(selectedPatient.getUsername());

        if (selectedPatient.getConsultationRecord() != null) {
            nursePatientInfoWeight.setText(Double.toString(selectedPatient.getLastConsultation().getWeight()));
            nursePatientInfoHeight.setText(Double.toString(selectedPatient.getLastConsultation().getHeight()));
            nursePatientInfoBloodPressure.setText(selectedPatient.getLastConsultation().getBloodPressure());
            nursePatientInfoNotes.setText(selectedPatient.getLastConsultation().getNotes());
        }

        if (selectedPatient.getPrescriptions() != null) {
            ObservableList<Prescription> currentPrescriptions = FXCollections.observableArrayList();
            currentPrescriptions.setAll(selectedPatient.getPrescriptions());
            nursePatientInfoCurrentPrescriptions.setItems(currentPrescriptions);
        }
    }

    @FXML
    public void handlePopulateNursePatientList() {
        nurseHomePatientList.setItems(getPatientList());

        nurseHomePatientList.getSelectionModel().select(0);
        handleUpdateNursePatientValues();
    }

    @FXML
    public void handleUpdateNursePatientValues() {
        //TODO: fetch the most recent consultation belonging to the specific patient, and fill in the corresponding TextFields with the relevant data

        Patient selectedPatient = (Patient) nurseHomePatientList.getSelectionModel().getSelectedItem();
        Main.setSelectedPatient(selectedPatient.getUsername());

        nurseHomePatientListPatientAddress.setText(selectedPatient.getAddress());
        nurseHomePatientListPatientPhoneNumber.setText(selectedPatient.getPhoneNumber());
        nurseHomePatientListPatientBirthday.setValue(selectedPatient.getBirthday());
        nurseHomePatientListPatientInsuranceID.setText(selectedPatient.getInsuranceID());
        nurseHomePatientListPatientPharmacyAddress.setText(selectedPatient.getPharmacyAddress());

        if (selectedPatient.getNextAppointment() != null) {
            nurseHomePatientListPatientUpcomingAppointment.setText(selectedPatient.getNextAppointment().toString());
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
    public void handlePopulatePersonalInformation() throws ClassNotFoundException, SQLException {
        Patient user = new Patient(Main.getCurrentUser());

        patientHomePatientFirstName.setText(user.getFirstName());
        patientHomePatientLastName.setText(user.getLastName());
        patientHomePatientBirthday.setValue(user.getBirthday());
        patientHomePatientAddress.setText(user.getAddress());
        patientHomePatientPhoneNumber.setText(user.getPhoneNumber());
        patientHomePatientInsuranceID.setText(user.getInsuranceID());
        patientHomePatientPharmacyAddress.setText(user.getPharmacyAddress());

        patientHomeUpcomingAppointment.setText(user.getNextAppointment().toString());

        if (user.getAssignedDoctor().toString() != null) {
            patientHomeDoctorName.setText(user.getAssignedDoctor().toString());
        }
        if (user.getAssignedNurse().toString() != null) {
            patientHomeNurseName.setText(user.getAssignedNurse().toString());
        }
    }

    @FXML
    public void handlePopulateMedicalInformation() throws ClassNotFoundException, SQLException {
        Patient user = new Patient(Main.getCurrentUser());

        patientHomePatientMedicalInfo.appendText("Weight (lb): " + user.getLastConsultation().getWeight());
        patientHomePatientMedicalInfo.appendText("Height (cm): " + user.getLastConsultation().getHeight());
        patientHomePatientMedicalInfo.appendText("Blood Pressure: " + user.getLastConsultation().getBloodPressure());
        patientHomePatientMedicalInfo.appendText("\nNotes: " + user.getLastConsultation().getNotes());

        for (Prescription prescription : user.getPrescriptions()) {
            patientHomePatientPrescriptions.appendText(prescription.toString());
        }

        for (Prescription prescription : user.getPrescriptions()) {
            patientHomePatientInstructions.appendText("Take a " + prescription.getDosageAmount() + " tablet " + prescription.getTimesPerMonth() + " times per month.");
        }
    }

    @FXML
    public void handleClearMedicalInfo() {
        patientHomePatientMedicalInfo.clear();
        patientHomePatientPrescriptions.clear();
        patientHomePatientInstructions.clear();
    }

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
        String patientUsername = doctorPatientInfoPatientUsername.getText();

        LocalDate today = LocalDate.now();

        double patientWeight = Double.parseDouble(doctorPatientInfoWeight.getText());
        double patientHeight = Double.parseDouble(doctorPatientInfoHeight.getText());

        String patientBloodPressure = doctorPatientInfoBloodPressure.getText();

        String prescriptionName = doctorPatientInfoPrescriptionName.getText();
        String prescriptionDosageAmount = doctorPatientInfoPrescriptionDosageAmount.getText();
        int prescriptionTimesPerMonth = Integer.parseInt(doctorPatientInfoPrescriptionTimesPerMonth.getText());
        Prescription prescription = new Prescription(prescriptionName, prescriptionDosageAmount, prescriptionTimesPerMonth);

        String doctorNotes = doctorPatientInfoNotes.getText();

        if (!prescriptionName.isEmpty() || !prescriptionDosageAmount.isEmpty()) {
            Consultation consultation = new Consultation(patientUsername, today, patientWeight, patientHeight, patientBloodPressure, prescription, doctorNotes);
        } else {
            Consultation consultation = new Consultation(patientUsername, today, patientWeight, patientHeight, patientBloodPressure, null, doctorNotes);
        }

        Stage stage = (Stage) doctorPatientInfoSaveButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    public void populateDoctorPatientInfo() throws ClassNotFoundException, SQLException {
        Patient selectedPatient = new Patient(Main.getSelectedPatient());

        doctorPatientInfoPatientUsername.setText(selectedPatient.getUsername());

        if (selectedPatient.getConsultationRecord() != null) {
            doctorPatientInfoWeight.setText(Double.toString(selectedPatient.getLastConsultation().getWeight()));
            doctorPatientInfoHeight.setText(Double.toString(selectedPatient.getLastConsultation().getHeight()));
            doctorPatientInfoBloodPressure.setText(selectedPatient.getLastConsultation().getBloodPressure());
            doctorPatientInfoNotes.setText(selectedPatient.getLastConsultation().getNotes());
        }

        if (selectedPatient.getPrescriptions() != null) {
            ObservableList<Prescription> currentPrescriptions = FXCollections.observableArrayList();
            currentPrescriptions.setAll(selectedPatient.getPrescriptions());
            doctorPatientInfoCurrentPrescriptions.setItems(currentPrescriptions);
        }
    }

    @FXML
    public void handlePopulateDoctorPatientList() {
        doctorHomePatientList.setItems(getPatientList());

        doctorHomePatientList.getSelectionModel().select(0);
        handleUpdateDoctorPatientValues();
    }

    @FXML
    public void handleUpdateDoctorPatientValues() {
        //TODO: fetch the most recent consultation belonging to the specific patient, and fill in the corresponding TextFields with the relevant data

        Patient selectedPatient = (Patient) doctorHomePatientList.getSelectionModel().getSelectedItem();
        Main.setSelectedPatient(selectedPatient.getUsername());

        doctorHomePatientListPatientAddress.setText(selectedPatient.getAddress());
        doctorHomePatientListPatientPhoneNumber.setText(selectedPatient.getPhoneNumber());
        doctorHomePatientListPatientBirthday.setValue(selectedPatient.getBirthday());
        doctorHomePatientListPatientInsuranceID.setText(selectedPatient.getInsuranceID());
        doctorHomePatientListPatientPharmacyAddress.setText(selectedPatient.getPharmacyAddress());

        if (selectedPatient.getNextAppointment() != null) {
            doctorHomePatientListPatientUpcomingAppointment.setText(selectedPatient.getNextAppointment().toString());
        }

    }
}
