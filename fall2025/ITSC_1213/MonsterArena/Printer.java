package fall2025.ITSC_1213.MonsterArena;

// TODO: Implement the generic class Printer
import java.util.ArrayList;

public class Printer<T>
{
    protected ArrayList<T> listRef = new ArrayList<T>();

    public Printer(ArrayList<T> listRef)
    {
        this.listRef = listRef;
    }
 
    public void print()
    {
        for (T l : listRef)
        {
            l.toString();
        }
    }
}