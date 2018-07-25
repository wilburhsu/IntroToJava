package Chapter10;

/**
 * Created by Wilbur Hsu on 2018-1-2.
 * TestCourse
 */
public class Code10_5 {
    public static void main(String[] args) {
        Code10_6 course1 = new Code10_6("Data Structures");
        Code10_6 course2 = new Code10_6("Database Systems");

        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kennedy");

        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");

        System.out.println("Number of students in course1:" + course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for(int i = 0;i < course1.getNumberOfStudents(); i++)
            System.out.print(students[i] + ",");

        System.out.println();
        System.out.print("Number of students in course2: "
                + course2.getNumberOfStudents());
    }
}
