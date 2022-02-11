package gui.Controller;

import be.Class;
import be.Student;
import be.Subject;
import bll.CLassManager;
import bll.StudentManager;
import bll.SubjectManager;
import dal.StudentDao;
import dal.SubjectDao;
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
import java.util.List;
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


        // Adds all classes teacher has to combobox
        cbClass.getItems().add("all Classes");
        CLassManager cLassManager = new CLassManager();
        List<Class> classes = FXCollections.observableArrayList();
        classes = cLassManager.getClasses();
        classes.forEach( (classs -> cbClass.getItems().add(classs.getName())));


        // add all subjects that teacher has
     cbSubject.getItems().add("all Subjects");
        SubjectManager subjectManager = new SubjectManager();
        List<Subject> subjectList = FXCollections.observableArrayList();
        subjectList = subjectManager.subjectList();
        subjectList.forEach( (subject -> cbSubject.getItems().add(subject.getName())));


     // add all Students for that CLass
     StudentManager studentManager = new StudentManager();

        ObservableList<Student> students = FXCollections.observableArrayList();

        students.addAll(studentManager.getStudents());

        cbStudent.getItems().add("All Students");

         students.forEach((student -> cbStudent.getItems().add(student.getName())));


         // displays all the students in the tableview
         tcStudent.setCellValueFactory(new PropertyValueFactory<Student, String>("name"));
         tcHours.setCellValueFactory(new PropertyValueFactory<Student, String>("hours"));
         tcProcent.setCellValueFactory(new PropertyValueFactory<Student, String>("percent"));

         tvStudents.setItems(students);

    }
}
