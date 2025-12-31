package fall2025.ITSC_1213;

import java.util.ArrayList;

public class Student extends Person
{
    private String major;
    private double gpa;
    private int credits;
    private double balance;
    private boolean transfer;
    private ArrayList<String> enrolledCourses;
     
    public Student(String fName, String lName, int id, String major,
     double gpa, int credits)
    {
        super(fName, lName, id);
        this.major = major;
        this.gpa = gpa;
        this.credits = credits;
        balance = 0;
        enrolledCourses = new ArrayList<>();
    }

    public String getMajor()
    {
        return major;
    }

    public double getGPA()
    {
        return gpa;
    }

    public int getCredits()
    {
        return credits;
    }

    public boolean isTransfer()
    {
        return transfer;
    }

    public double getBalance()
    {
        return balance;
    }

    public ArrayList<String> getEnrolledCourses()
    {
        return enrolledCourses;
    }

    public void setMajor(String major)
    {
        this.major = major;
    }

    public void setGPA(double gpa)
    {
        this.gpa = gpa;
    }

    public void setCredits(int credits)
    {
        this.credits = credits;
    }

    public void setTransfer(boolean transfer)
    {
        this.transfer = transfer;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public void addCourse(String course)
    {
        enrolledCourses.add(course);
    }

    public boolean dropCourse(String course)
    {
        return enrolledCourses.remove(course);
    }

}
