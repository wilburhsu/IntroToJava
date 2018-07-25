package Chapter10;


/**
 * Created by Wilbur Hsu on 2018-1-2.
 * Course
 */
public class Code10_6 {
    private String couseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Code10_6(String couseName){
        this.couseName = couseName;
    }

    public void addStudent(String student){
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents(){
        return students;
    }

    public int getNumberOfStudents(){
        return numberOfStudents;
    }

    public String getCouseName(){
        return couseName;
    }

    public void dropStudent(String student){

    }
}
