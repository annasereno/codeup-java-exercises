package grades;

public class StudentTest {

    public static void main(String[] args) {

        Student punchy = new Student("Punchy");
        System.out.println(punchy.getName());

        punchy.addGrade(90);
        punchy.addGrade(80);
        punchy.addGrade(40);
        punchy.addGrade(70);

        System.out.println(punchy.getGradeAverage());
        System.out.println(punchy);//returns the arraylist


    }

}
