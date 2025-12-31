package fall2025.ITSC_1213.proj3;

import java.util.ArrayList;

public class Professor extends Person
{
    private String department;
    private double salary;
    private ArrayList<Student> advisees;

    public Professor(String fName, String lName, int id, String department, double salary)
    {
        super(fName, lName, id);
        this.department = department;
        this.salary = salary;
        advisees = new ArrayList<Student>();
    }

    public String getDepartment()
    {
        return department;
    }

    public double getSalary()
    {
        return salary;
    }

    public ArrayList<Student> getAdvisees()
    {
        return advisees;
    }

    public void setDepartment(String department)
    {
        this.department = department;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public void addAdvisee(Student a)
    {
        advisees.add(a);
    }

    public boolean removeAdvisee(int id)
    {
        for (Student advisee : advisees)
        {
            if (advisee.getId() == id)
            {
                advisees.remove(advisee);
                return true;
            }
        }
        return false;
    }

    @Override
    public void display()
    {
        System.out.println("Name: " + getFirstName() + " " + getLastName());  // Using getter
        System.out.println("ID: " + getId());
        System.out.println("Department: " + this.department);
        System.out.println("Salary: " + this.salary);
        System.out.println("Advisees:");
        for (Student advisee : advisees)
        {
            System.out.println("\t" + advisee.getFirstName() + " " + advisee.getLastName());
        }
    }
}
