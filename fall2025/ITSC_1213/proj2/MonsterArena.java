package fall2025.ITSC_1213.proj2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * The MonsterArena class simulates an arena where different types of monsters
 * are randomly created, sorted by power level, and printed before and after sorting.
 * It demonstrates the use of the Comparable interface and Java generics.
 * 
 * @author  ITSC 1213
 * @version April 9, 2025
 */
public class MonsterArena {
 
    private ArrayList<Monster> monsterList = new ArrayList<>();

    /**
     * Initializes the arena by:
     * - Creating 5 random Monster instances (Goblin, Dragon, or Troll)
     * - Printing the list before sorting (using Printer<T>)
     * - Sorting the monsters based on power level
     * - Printing the list again after sorting
     */
    public void initializeMonsters() {
        // Randomly generate 5 monsters
        Random rand = new Random();

        for (int i = 0; i < 5; i++) {
            int choice = rand.nextInt(3); // Goblin, Dragon, Troll
            Monster m;
            if (choice == 0) {
                m = new Goblin();
            } else if (choice == 1) {
                m = new Dragon();
            } else {
                m = new Troll();
            }
            monsterList.add(m);
        }
       

        // TODO: Print before sorting
        System.out.println("Before sorting: ");
        for (Monster monster : monsterList)
        {
            System.out.println(monster);
        }

        // TODO: Sort monsters by powerLevel
        Collections.sort(monsterList);



        // TODO: Print after sorting
        System.out.println("After sorting: ");
        for (Monster monster : monsterList)
        {
            System.out.println(monster);
        }
        

    }
    
    /**
     * The main method to run the MonsterArena simulation.
     * @param args command-line arguments (not used)
    */
    public static void main(String[] args) {
        MonsterArena arena = new MonsterArena();
        arena.initializeMonsters();
    }
}
