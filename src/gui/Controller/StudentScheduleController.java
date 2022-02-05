package gui.Controller;
import be.Subject;
import be.SubjectTime;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
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


        //show the todays date
        lblDate.setText(date.toString());

    }

    public void setSubjectTable(){
        tcSubject.setCellValueFactory(new PropertyValueFactory<Subject, String>("name"));

        allSubjects.add(new Subject("English"));
        allSubjects.add(new Subject("English"));
        allSubjects.add(new Subject("German"));
        allSubjects.add(new Subject("German"));
        allSubjects.add(new Subject("French"));
        allSubjects.add(new Subject("French"));

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
}
