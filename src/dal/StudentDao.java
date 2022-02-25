package dal;

import be.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.List;

public class StudentDao {

    public StudentDao(){


    }

    public List<Student> getStudents(){
        ObservableList<Student> students = FXCollections.observableArrayList();

        students.add(new Student("hans", "40/55","80%"));
        students.add(new Student("peter", "44/55","80%"));
        students.add(new Student("jens", "54/55","99%"));
        students.add(new Student("mathilde", "24/55","45%"));
        students.add(new Student("karoline", "44/55","45%"));
        students.add(new Student("Anders", "23/55","55%"));

        return students;

    }


}
