package dal;

import be.Class;
import be.Subject;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.List;

public class SubjectDao {

    public List<Subject> subjectList(){

        ObservableList<Subject> subjects = FXCollections.observableArrayList();

        subjects.add(new Subject("DOS"));
        subjects.add(new Subject("SCO"));
        subjects.add(new Subject("ITO"));
        subjects.add(new Subject("SDE"));
        return subjects;
    }

    public List<Subject> todaySubjects(){

        ObservableList<Subject> subjects = FXCollections.observableArrayList();

        subjects.add(new Subject("DOS"));
        subjects.add(new Subject("DOS"));
        subjects.add(new Subject("SCO"));
        subjects.add(new Subject("SCO"));
        subjects.add(new Subject("ITO"));
        subjects.add(new Subject("ITO"));
        return subjects;


    }
}
