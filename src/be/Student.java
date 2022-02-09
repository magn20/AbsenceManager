package be;

public class Student {

    private final String name;
    private final String hours;
    private final String percent;

    public Student(String name, String hours, String percent){

        this.name = name;
        this.hours = hours;
        this.percent = percent;
    }

    public String getName() {
        return name;
    }

    public String getHours() {
        return hours;
    }

    public String getPercent() {
        return percent;
    }
}
