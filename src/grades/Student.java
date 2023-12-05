package grades;

import java.util.ArrayList;

//this is what the program is about, the domain
public class Student {

    private String name;
    private ArrayList<Integer> grades;
    //ArrayList<Integer> grades = new ArrayList<>();

    ///CONSTRUCTOR
    public Student(String studentName) {
        name = studentName;
        grades = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                '}';
    }

    // GETTER. returns the student's name
    public String getName(){
        return name;
    };

    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    };

    //adds up all the grades
//    LONG WAY
    public double sumOfGrades(){
        double sum = 0;
        for (int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
        }
        return sum;
    };

    // returns the average of the students grades
    public double getGradeAverage(){
        double average = sumOfGrades() / grades.size();
        return average;
    };

}
