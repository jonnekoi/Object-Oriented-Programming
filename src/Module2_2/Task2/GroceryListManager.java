package Module2_2.Task2;

import java.util.HashMap;
import java.util.Map;

public class GroceryListManager {
    private HashMap<String, Double> groceryList = new HashMap<>();

    public void addItem(String item, double cost) {
        groceryList.put(item, cost);
    }

    public void removeItem(String item) {
        groceryList.remove(item);
    }

    public void displayList() {
        System.out.println("Grocery List:");
        int i = 1;
        for (Map.Entry<String, Double> entry : groceryList.entrySet()) {
            System.out.println(i++ + ". " + entry.getKey() + " - $" + entry.getValue());
        }
    }

    public boolean checkItem(String item) {
        return groceryList.containsKey(item);
    }

    public double calculateTotalCost() {
        double totalCost = 0;
        for (double cost : groceryList.values()) {
            totalCost += cost;
        }
        return totalCost;
    }

    public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager();

        manager.addItem("Apples", 2.59);
        manager.addItem("Milk", 1.19);
        manager.addItem("Bread", 5.49);

        manager.displayList();

        System.out.println("\nIs \"Milk\" in the grocery list? " + manager.checkItem("Milk"));
        System.out.println("\nTotal cost of items: $" + manager.calculateTotalCost());
        System.out.println("\nRemoving \"Milk\" from the list...");

        manager.removeItem("Milk");

        System.out.println("\nUpdated Grocery List:");
        manager.displayList();
        System.out.println("\nUpdated total cost of items: $" + manager.calculateTotalCost());
    }
}



