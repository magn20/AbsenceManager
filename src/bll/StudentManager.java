package bll;

import be.Student;
import dal.StudentDao;

import java.util.List;

public class StudentManager {


    public List<Student> getStudents(){
        StudentDao studentDao = new StudentDao();
        return studentDao.getStudents();
    }
}
