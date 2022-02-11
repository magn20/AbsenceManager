package gui.Controller;
import be.Subject;
import be.SubjectTime;
import bll.SubjectManager;
import gui.util.SceneSwapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

public class StudentScheduleController implements Initializable {
    @FXML
    private TableView<Subject> tvSubject;
    @FXML
    private TableColumn<Subject, String> tcSubject;
    @FXML
    private TableColumn<SubjectTime, String> tcTime;
    @FXML
    private TableView<SubjectTime> tvTime;



    @FXML
    private Label lblDate;

    ObservableList<SubjectTime> allTimes = FXCollections.observableArrayList();
    ObservableList<Subject> allSubjects = FXCollections.observableArrayList();

    Date date = new Date();

    public StudentScheduleController(){

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setTimeTable();
        setSubjectTable();
        

    }

    public void setSubjectTable(){
        tcSubject.setCellValueFactory(new PropertyValueFactory<Subject, String>("name"));

        SubjectManager subjectManager = new SubjectManager();
        allSubjects.addAll(subjectManager.todaysSubject());

        tvSubject.setItems(allSubjects);
    }

    public void setTimeTable(){

        // what wanted to be shown in the Table collum
        tcTime.setCellValueFactory(new PropertyValueFactory<SubjectTime, String>("time"));

        // adds all the SubjectTime to our list
        allTimes.add(new SubjectTime("09:00 - 09:45"));
        allTimes.add(new SubjectTime("09:45 - 10:30"));
        allTimes.add(new SubjectTime("10:45 - 11:30"));
        allTimes.add(new SubjectTime("12:00 - 12:45"));
        allTimes.add(new SubjectTime("12:45 - 13:30"));
        allTimes.add(new SubjectTime("13:30 - 14:15"));
        allTimes.add(new SubjectTime("14:15 - 15:00"));

        // puts all our subjectime objects into the tableview.
        tvTime.setItems(allTimes);

    }
    public void onBackBtn(ActionEvent actionEvent) throws IOException {

        SceneSwapper sceneSwapper = new SceneSwapper();
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        sceneSwapper.sceneSwitch(stage, "StudentMainScreen.fxml");
    }
}
