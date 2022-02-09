package gui.Controller;

import be.Student;
import be.Subject;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class TeacherController implements Initializable {

    @FXML
    private TableColumn<Student, String> tcProcent;
    @FXML
    private TableColumn<Student, String> tcHours;
    @FXML
    private TableColumn<Student, String> tcStudent;
    @FXML
    private TableView<Student> tvStudents;


    @FXML
    private ComboBox cbSubject;
    @FXML
    private ComboBox cbStudent;
    @FXML
    private ComboBox cbClass;

    @FXML
    private void onGraph(ActionEvent actionEvent) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cbClass.getItems().add("all Classes");
     cbClass.getItems().add("cs21_A");
     cbClass.getItems().add("cs22_A");
     cbClass.getItems().add("mm21_b");
     cbClass.getItems().add("mm18_c");

     cbClass.getSelectionModel().select(3);

     cbSubject.getItems().add("all Subjects");
     cbSubject.getItems().add("English");
     cbSubject.getItems().add("Media");
     cbSubject.getItems().add("Programming");
     cbSubject.getItems().add("Fun With Lars");

     cbSubject.getSelectionModel().select(3);


        ObservableList<Student> students = FXCollections.observableArrayList();


        students.add(new Student("hans", "40/55","80%"));
        students.add(new Student("peter", "44/55","80%"));
        students.add(new Student("jens", "54/55","99%"));
        students.add(new Student("mathilde", "24/55","45%"));
        students.add(new Student("karoline", "44/55","45%"));
        students.add(new Student("Anders", "23/55","55%"));


        cbStudent.getItems().add("All Students");
         students.forEach((student -> cbStudent.getItems().add(student.getName())));

         cbStudent.getSelectionModel().select(0);

         tcStudent.setCellValueFactory(new PropertyValueFactory<Student, String>("name"));
         tcHours.setCellValueFactory(new PropertyValueFactory<Student, String>("hours"));
         tcProcent.setCellValueFactory(new PropertyValueFactory<Student, String>("percent"));

         tvStudents.setItems(students);

    }
}
