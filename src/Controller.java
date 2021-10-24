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
    // Sign up screen
    @FXML private TextField firstName;
    @FXML private TextField lastName;
    @FXML private DatePicker birthday;
    @FXML private TextField username;
    @FXML private PasswordField password;
    @FXML private RadioButton radioPatient;
    @FXML private RadioButton radioNurse;
    @FXML private RadioButton radioDoctor;

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
            String firstNameEntry = firstName.getText();
            String lastNameEntry = lastName.getText();
            LocalDate birthdayEntry = birthday.getValue();
            String usernameEntry = username.getText();
            String passwordEntry = password.getText();

            String personType = "NULL";
            if (radioPatient.isSelected()) {
                personType = "Patient";
            } else if (radioNurse.isSelected()) {
                personType = "Nurse";
            } else if (radioDoctor.isSelected()) {
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

            firstName.clear();
            lastName.clear();
            birthday.setValue(LocalDate.EPOCH); // No good way to clear this as far as I can tell.
            username.clear();
            password.clear();
            radioPatient.setSelected(true);
        }
    }
}
