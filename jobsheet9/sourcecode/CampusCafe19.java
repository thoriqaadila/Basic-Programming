import java.util.Scanner;

public class CampusCafe19 {

    // Linear search: returns the index of the menu item, or -1 if not found
    static int searchMenu(String[] menu, String name) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] menu = {"Fried Rice", "Fried Noodles", "Toast", "French Fries",
                         "Pulled Tea", "Cappuccino", "Chocolate Ice"};
        int[] prices = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        // Show the menu
        System.out.println("===== CAMPUS CAFE MENU =====");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp" + prices[i]);
        }
        System.out.println();

        // Menu search feature
        System.out.print("Search a menu item: ");
        String keyword = input.nextLine();
        int found = searchMenu(menu, keyword);
        if (found != -1) {
            System.out.println(menu[found] + " is available. Price: Rp" + prices[found]);
        } else {
            System.out.println("Sorry, \"" + keyword + "\" is not available.");
        }
        System.out.println();

        // Ordering feature
        System.out.print("How many items do you want to order? ");
        int count = input.nextInt();
        input.nextLine(); // clear the leftover newline

        String[] orders = new String[count]; // separate array for ordered names
        int total = 0;

        for (int i = 0; i < count; i++) {
            int index;
            do {
                System.out.print("Item #" + (i + 1) + " menu name: ");
                String name = input.nextLine();
                index = searchMenu(menu, name);
                if (index == -1) {
                    System.out.println("Menu not found, please try again.");
                }
            } while (index == -1);

            orders[i] = menu[index];
            total += prices[index];
        }

        // Display the order list and total
        System.out.println();
        System.out.println("========== ORDER LIST ==========");
        for (int i = 0; i < orders.length; i++) {
            int idx = searchMenu(menu, orders[i]);
            System.out.println((i + 1) + ". " + orders[i] + " - Rp" + prices[idx]);
        }
        System.out.println("--------------------------------");
        System.out.println("TOTAL: Rp" + total);
        input.close();
    }
}
