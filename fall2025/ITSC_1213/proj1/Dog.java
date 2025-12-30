package fall2025.ITSC_1213.proj1;

public class Dog {

    private String name;
    private String breed;

    public Dog(String name, String breed)
    {
        this.name = name;
        this.breed = breed;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name; 
    }

    public void setBreed(String breed)
    {
        this.breed = breed;
    }
    public String getBreed()
    {
        return this.breed;
    }

    public void play(Dog d2)
    {
        System.out.println(getName() + " is playing with " + d2.getName());
    }
}