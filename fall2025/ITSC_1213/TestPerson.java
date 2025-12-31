package fall2025.ITSC_1213;

public class TestPerson
{
    public static void main(String[] args)
    {
        // creating Person object
        Person p1 = new Person("Alex", "Fierro", 12345);
 
        // testing getter methods
        System.out.println("First name: " + p1.getFirstName());
        System.out.println("Last name: " + p1.getLastName());
        System.out.println("ID: " + p1.getId());

        // calling display method
        p1.display();
    }
}
