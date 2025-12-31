# Project Title and Description
This project demonstrates how to use Java's Comparable<T> interface to compare and sort custom objects—in this case, Monsters—by their power level. It also includes a generic Printer<T> class to print object details in a reusable way.

# Setup
- Open the project in your IDE.
- Compile all files.
- Run MonsterArena.java.
- View the printed output in the console.

## Knowledge Checks

## What does implementing Comparable<Monster> allow your Monster class to do?
- It allows the Monster class to use the compareTo() method

## How does the compareTo() method determine which monster is stronger?
- If the powerLevel of the monster that the method is being performed on is lower than that of the monster in the parameter, the method returns -1; the monster in the parameter is stronger
- If the powerLevel of the monster that the method is being performed on is higher than that of the monster in the parameter, the method returns 1; the monster in the parameter is weaker
- If the powerLevel of the monster that the method is being performed on is equal to that of the monster in the parameter, the method returns 0; both monsters are equally strong

## What would happen if you reversed the comparison logic in compareTo()?
- Nothing would happen if the comparison logic is reversed

## Why do we override the toString() method in Java classes?
- To improve readability and make it easier to debug

## What is the purpose of using a generic class like Printer<T> instead of writing a MonsterPrinter?
- It allows us to create flexible, reusable tools that work with different types of objects, without writing duplicate code.

## What are the advantages of using Collections.sort() instead of writing your own sorting algorithm?
- Higher efficiency
- Better readability
- More flexible code

## What did the debugging output inside compareTo() help you understand?
- It helped me understand what's being compared

## How could this approach to sorting and printing be applied in a different type of program (e.g., leaderboard, inventory list, student records)?
- Higher efficiency
- Better readability
- More flexible code

