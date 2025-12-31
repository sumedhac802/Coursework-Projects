package fall2025.ITSC_1213;

import java.util.ArrayList;

public class TestProfessor
{
   public static void main(String[] args)
   {
     // Testing Professor class
    Student s1 = new Student("Perseus", "Jackson", 81800, "Marine Biology", 3.6, 80);
    Student s2 = new Student("Annabeth", "Chase", 56789, "Architecture", 4.0, 100);
    Student s3 = new Student("Leo", "Valdez", 98765, "Mechanical Engineering", 3.7, 70);
    Student s4 = new Student("Nico", "Di Angelo", 12321, "Literature", 3.8, 50);
 
    Professor prof1 = new Professor("Paul", "Blofis", 534, "Literature", 90000);

    prof1.display();

    System.out.println("Department: " + prof1.getDepartment());
    System.out.println("Salary: " + prof1.getSalary());

    prof1.setDepartment("Math");
    prof1.setSalary(95000);

    System.out.println("Department: " + prof1.getDepartment());
    System.out.println("Salary: " + prof1.getSalary());

    prof1.addAdvisee(s1);
    prof1.addAdvisee(s2);
    prof1.addAdvisee(s3);
    prof1.addAdvisee(s4);

    if (prof1.removeAdvisee(12321))
    {
        System.out.println("Advisee removed");
    }
    else
    {
        System.out.println("Advisee not in list");
    }

    if (prof1.removeAdvisee(12321))
    {
        System.out.println("The advisee has been removed");
    }
    else
    {
        System.out.println("This student is not an advisee pf Professor " + prof1.getFirstName() + " " + prof1.getLastName());
    }

    ArrayList<Student> myAdvisees = prof1.getAdvisees();
    System.out.println("Professor " + prof1.getFirstName() + " " + prof1.getLastName() + " advisees:");
    for (Student s : myAdvisees)
    {
        System.out.println(s.getFirstName() + " " + s.getLastName());
    }
   }
}
