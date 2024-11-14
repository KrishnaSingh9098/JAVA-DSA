import java.util.ArrayList;

public class arrayListL {
    public static void main(String[] args) {
            // Create an ArrayList to store Strings
            ArrayList<String> list = new ArrayList<String>();
    
            // Add elements to the ArrayList
            list.add("Apple");
            list.add("Banana");
            list.add("Cherry");
    
            // Access and print an element at a specific index
            System.out.println("Element at index 1: " + list.get(1));  // Output: Banana
    
            // Modify an element at index 0
            list.set(0, "Orange");
    
            // Print the updated ArrayList
            System.out.println("Updated list: " + list);  // Output: [Orange, Banana, Cherry]
    
            // Remove an element by index
            list.remove(2);  // Removes "Cherry"
            System.out.println("After removal: " + list);  // Output: [Orange, Banana]
    
            // Check if an element exists
            boolean exists = list.contains("Banana");
            System.out.println("Contains 'Banana'? " + exists);  // Output: true
    
            // Get the size of the ArrayList
            System.out.println("Size of the list: " + list.size());  // Output: 2
    
            // Clear all elements
            list.clear();
            System.out.println("After clearing, size: " + list.size());  // Output: 0
    
    }
}
