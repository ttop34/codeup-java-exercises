import grades.Student;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student Alex = new Student("Alex");
        Alex.addGrade(87);
        Alex.addGrade(92);
        Alex.addGrade(90);

        Student Tomas = new Student("Tomas");
        Tomas.addGrade(88);
        Tomas.addGrade(93);
        Tomas.addGrade(85);

        Student Mari = new Student("Mari");

        Mari.addGrade(100);
        Mari.addGrade(74);
        Mari.addGrade(59);

        Student Joyce = new Student("Joyce");
        Joyce.addGrade(99);
        Joyce.addGrade(87);
        Joyce.addGrade(95);

        students.put("crankyMonkey", Alex);
        students.put("HappyHippo", Tomas);
        students.put("OrangeKuala", Mari);
        students.put("JavaPanda", Joyce);


        System.out.println(students.get(""));

    }
}
