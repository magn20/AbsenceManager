package gui.Controller;

import be.Student;
import be.Subject;
import bll.CLassManager;
import bll.StudentManager;
import dal.StudentDao;
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
        CLassManager cLassManager = new CLassManager();
        cbClass.getItems().addAll(cLassManager.getClasses());

     cbSubject.getItems().add("all Subjects");
     cbSubject.getItems().add("English");
     cbSubject.getItems().add("Media");
     cbSubject.getItems().add("Programming");

     StudentManager studentManager = new StudentManager();

        ObservableList<Student> students = FXCollections.observableArrayList();

        students.addAll(studentManager.getStudents());

        cbStudent.getItems().add("All Students");

         students.forEach((student -> cbStudent.getItems().add(student.getName())));



         tcStudent.setCellValueFactory(new PropertyValueFactory<Student, String>("name"));
         tcHours.setCellValueFactory(new PropertyValueFactory<Student, String>("hours"));
         tcProcent.setCellValueFactory(new PropertyValueFactory<Student, String>("percent"));

         tvStudents.setItems(students);

    }
}
