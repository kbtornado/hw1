/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hw1;

import java.util.ArrayList;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
    
    public static boolean sumOfElementsIsEqual(ArrayList<Integer> array, int a, Integer b, int c) {
        System.out.println("inside search");
        if (array == null || a >= array.size() || (int)b >= array.size()) 
          return false;
    
        int element1 = array.get(a);
        int element2 = array.get(b);
        
        if((element1 + element2) == c)
          return true;
    
        return false;
    }
}
