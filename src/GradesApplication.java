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

        Mari.recordAttendance("2017-10-02", "P");
        Mari.recordAttendance("2017-10-03", "P");
        Mari.recordAttendance("2017-10-04", "A");
        Mari.recordAttendance("2017-10-05", "A");
        Mari.recordAttendance("2017-10-06", "P");

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

        getAttendancePercentage(students, "OrangeKoala");

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

            System.out.println("would you like a CSV report of all students?");
            if (input.yesNo()){
                getCSV(students);
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

    public static void getCSV(HashMap<String, Student> students){
        for (String student: students.keySet()){
            System.out.print(students.get(student).getName() + ",");
            System.out.print(student + ",");
            System.out.print(students.get(student).getGradeAverage());
            System.out.println();
        }
    }

    public static void getAttendancePercentage(HashMap<String, Student> students, String option){
        double totalDays = 0;
        double absences =0;

        for (String stud: students.keySet()){
            students.get(stud).getAttendance().values();
            for(String attended: students.get(stud).getAttendance().values()){
                if (attended.equals("A")){
                    absences++;
                }
          }
            }
        totalDays = students.get(option).getAttendance().size();
        double percentage = (totalDays - absences)/totalDays * 100;
        System.out.println(percentage + "%" + " attendance percentage");
        }
}


