package bll;

import be.Subject;
import dal.SubjectDao;

import java.util.List;

public class SubjectManager {
    SubjectDao subjectDao = new SubjectDao();

    public List<Subject> subjectList(){

        return subjectDao.subjectList();
    }
    public List<Subject> todaysSubject(){
        return subjectDao.todaySubjects();

    }
}
