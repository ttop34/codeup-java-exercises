import grades.Student;

import java.util.HashMap;

import util.Input;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Input input = new Input();

        Student Alex = new Student("Alex");
        Alex.addGrade(87);
        Alex.addGrade(92);
        Alex.addGrade(90);

        Student Tomas = new Student("Tomas");
        Tomas.addGrade(88);
        Tomas.addGrade(93);
        Tomas.addGrade(85);

        System.out.println();

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
        students.put("OrangeKoala", Mari);
        students.put("JavaPanda", Joyce);
//
//

        System.out.println("Welcome!" + "\n" + "\n" + "Here are the github usernames of our students:" + "\n");

        for (String key : students.keySet()) {
            System.out.print("|" + key + "| ");
        }

        System.out.println("\n");

        while (true) {

            System.out.println("Would you like to see the class average?");
            if (input.yesNo()){
                System.out.println(getClassAverage(students));
            }

            String userInput = input.getString("What student would you like to see more information on?");
            if (students.containsKey(userInput)) {
                System.out.println("\n" + "Name: " + students.get(userInput).getName()
                + " - " + "Github Username: " + userInput + "\n" + "Current Grades: "
                + students.get(userInput).getGrades() + "\n" + "Current Average: " + students.get(userInput).getGradeAverage());
            } else {
                System.out.println("Sorry, no student found with the gihub username of " + "\"" + userInput + "\"");

            }

            System.out.println("\n" + "Would you like to see another student?");
            if (!input.yesNo()) {
                System.out.println("Goodbye, and have a wonderful day!");
                break;
            }
        }
    }

    public static double getClassAverage(HashMap<String, Student> students){
       double classAverage;
       double total = 0;
        for (Student student: students.values()){

            total = student.getGradeAverage() + total;
        }
        classAverage = total/students.size();
        return classAverage;
    }


}
