package fall2025.ITSC_1213.proj2;

/**
 * Represents a monster with element and power level
 *
 * @author  ITSC 1213
 * @version April 9, 2025
 */
 
public abstract class Monster implements Comparable<Monster>{
    protected String element;
    protected int powerLevel;

    public Monster(String element, int powerLevel) {
        this.element = element;
        this.powerLevel = powerLevel;
    }
    
    public String getElement() {
        return element;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    // TODO: Override the compareTo method
    @Override
    public int compareTo(Monster other)
    {
        if (this.powerLevel < other.getPowerLevel())
        {
            return -1;
        }
        else if (this.powerLevel > other.getPowerLevel())
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    // TODO: Override the toString method
    @Override
    public String toString()
    {
        return "Element: " + this.element + ", Power level: " + this.powerLevel;
    }

}//class
