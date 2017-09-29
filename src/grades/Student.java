package grades;

import java.util.ArrayList;
//import java.util.Arrays;
public class Student {
    private String name;
    private ArrayList grades;


    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<Integer>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(ArrayList <Integer> grades){
        Integer sum = 0;
        if(!grades.isEmpty()) {
            for (Integer grade : grades) {
                sum += grade;
            }
            return sum.doubleValue() / grades.size();
        }
        return sum;
    }


    public static void main(String[] args) {
        Student student = new Student("elvin");

        student.addGrade(91);
        student.addGrade(100);
        student.addGrade(95);
        System.out.println(student.grades);

        System.out.println(student.getGradeAverage(student.grades));







    }

}
