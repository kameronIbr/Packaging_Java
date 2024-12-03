// Colfax.java
// Kameron Ibraheem
// Lab02: Colfax
// 
//

import java.util.Scanner;

public class Colfax {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);

        System.out.print("Item Quantity: ");  // Gets # of items
        int items = scrn.nextInt();

        System.out.print("Quantity per Box: ");  // Gets max boxes can hold
        int max = scrn.nextInt();

        int boxesneeded = items / max;  // Calculates number of boxes needed

        if (items % max == 0) {  // Check if items fit into boxes
            String fits = "No";
			
            System.out.println("Colfax Industries Shipping Boxes Calculator");
            System.out.println("Item Quantity: " + items);
            System.out.println("Quantity per Box: " + max);
            System.out.println("Required number of boxes: " + boxesneeded);
            System.out.println("Partially filled box: " + fits);
        } else {
            boxesneeded = boxesneeded + 1;
            String fits = "Yes";
			
            System.out.println("Colfax Industries Shipping Boxes Calculator");
            System.out.println("Item Quantity: " + items);
            System.out.println("Quantity per Box: " + max);
            System.out.println("Required number of boxes: " + boxesneeded);
            System.out.println("Partially filled box: " + fits);
        }

    }
}
