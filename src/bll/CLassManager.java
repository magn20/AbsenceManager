package bll;

import be.Class;
import dal.ClassDao;

import java.util.List;

public class CLassManager {

    public List<Class> getClasses(){
        ClassDao classDao = new ClassDao();
        return classDao.getClasses();
    }

}
