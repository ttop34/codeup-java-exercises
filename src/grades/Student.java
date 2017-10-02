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
        Student Elvin = new Student("elvin");

        Elvin.addGrade(91);
        Elvin.addGrade(100);
        Elvin.addGrade(95);
        Elvin.addGrade(90);
        System.out.println(Elvin.grades);

        System.out.println(Elvin.getGradeAverage(Elvin.grades));







    }

}
