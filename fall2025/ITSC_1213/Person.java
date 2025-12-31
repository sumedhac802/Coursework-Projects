package fall2025.ITSC_1213;

public class Person
{
    // attributes
    private String firstName;
    private String lastName;
    private int id;

    // parameterized constructor
    public Person(String firstName, String lastName, int id)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    // getter/accessor methods
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public int getId()
    {
        return id;
    }

    // displays info
    public void display()
    {
        System.out.println("Name: " + this.firstName + " " + this.lastName);
        System.out.println ("ID: " + this.id);
    }
}
