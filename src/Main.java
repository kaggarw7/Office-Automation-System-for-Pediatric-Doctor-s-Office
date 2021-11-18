import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    private static String currentUser;
    private static String selectedPatient;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("fxml/SignIn.fxml"));

        primaryStage.setTitle("Group 12 Clinic Manager");
        primaryStage.setScene(new Scene(root, 700, 500));
        primaryStage.show();

        //NurseDatabase.InsertNurse("Jane", "Smith", 3, 6, 1988, "201 Nurse Drive.", "5559123999", "janeSmith88", "janeSmith88", "jamesMoriarty66");
        //DoctorDatabase.InsertDoctor("James", "Moriarty", 6, 6, 1966, "222A Baker Street", "5555555555", "jamesMoriarty66", "jamesMoriarty66", "janeSmith88");
        //PatientDatabase.InsertPatient("John", "Doe", 1, 1, 2001, "521 Normal Street", "5551231234", "jamesMoriarty66", "janeSmith66", "ABCFakeInsurance", "123 Pharmacy Road", "johnDoe01", "johnDoe01");
    }

    public static String getCurrentUser() {
        return currentUser;
    }

    public static void setCurrentUser(String username) {
        currentUser = username;
    }

    public static String getSelectedPatient() {
        return selectedPatient;
    }

    public static void setSelectedPatient(String username) {
        selectedPatient = username;
    }
}
