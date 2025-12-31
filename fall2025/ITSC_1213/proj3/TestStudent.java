package fall2025.ITSC_1213.proj3;

import java.util.ArrayList;

public class TestStudent
{
    public static void main(String[] args)
    {
        Student s1 = new Student("Magnus", "Chase", 54321, "Nursing", 3.5, 120);
        s1.setTransfer(true);
        s1.setBalance(100);
        s1.addCourse("Spanish");
        s1.addCourse("Calculus");
        s1.addCourse("Creative Writing");
 
        s1.display();

        System.out.println("credits: " + s1.getCredits());
        System.out.println("GPA: " + s1.getGPA());
        System.out.println("Major: " + s1.getMajor());

        if (s1.dropCourse("Spanish"))
        {
            System.out.println("The class has been dropped");
        }
        else
        {
            System.out.println("The class does not exist");
        }

        ArrayList<String> enrolledCourses = s1.getEnrolledCourses();
        System.out.println("You are enrolled in the following courses:");
        for (String course : enrolledCourses)
        {
            System.out.println(course);
        }
    }
}

