package dal;

import be.Class;
import be.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.List;

public class ClassDao {

    public List<Class> getClasses(){
        ObservableList<Class> classes = FXCollections.observableArrayList();

          classes.add(new Class("CS21"));
          classes.add(new Class("CS20"));
          classes.add(new Class("MM21"));
          classes.add(new Class("MM20"));

        return classes;
    }
}
