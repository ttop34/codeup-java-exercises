package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public HashMap<String, String> getAttendance() {
        return attendance;
    }

    private HashMap<String, String> attendance;


    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
        this.attendance = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getGrades(){
       return this.grades;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        double total = 0;
        for(int i = 0; i < grades.size(); i++) {
            total = grades.get(i) + total;

        }
        double average = total/grades.size();
        return average;
    }

    public String recordAttendance(String date, String value){
        return attendance.put(date, value);
    }


    public static void main(String[] args) {
        Student Elvin = new Student("elvin");

        Elvin.addGrade(91);
        Elvin.addGrade(100);
        Elvin.addGrade(95);
        Elvin.addGrade(90);
        System.out.println(Elvin.grades);

        System.out.println(Elvin.getGradeAverage());
    }


}
