import java.util.Scanner;

public class Task3Student20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of stores: ");
        int numStores = sc.nextInt();

        if (numStores < 1) {
            System.out.println("The number of stores must be at least 1.");
        } else {
            int grandTotalItems = 0;
            int maxItems = -1;      // -1: the first store is always recorded
            int bestStore = 0;
            String summary = "";    // collects one line per store

            for (int s = 1; s <= numStores; s++) {
                System.out.println("Store " + s);

                int numCustomers;
                do {
                    System.out.print("  Number of customers: ");
                    numCustomers = sc.nextInt();
                    if (numCustomers < 0) {
                        System.out.println("  Must not be negative. Retry!");
                    }
                } while (numCustomers < 0);

                int storeItems = 0;
                for (int c = 1; c <= numCustomers; c++) {
                    int items;
                    do {
                        System.out.print("  Items bought by customer " + c + ": ");
                        items = sc.nextInt();
                        if (items < 0) {
                            System.out.println("  Must not be negative. Retry!");
                        }
                    } while (items < 0);
                    storeItems += items;
                }

                summary += "Store " + s + " - customers: " + numCustomers
                        + ", total items: " + storeItems + "\n";
                grandTotalItems += storeItems;

                if (storeItems > maxItems) {   // ">" keeps the smallest store number on a tie
                    maxItems = storeItems;
                    bestStore = s;
                }
            }

            System.out.println();
            System.out.print(summary);
            System.out.println("Total items across all stores: " + grandTotalItems);
            System.out.println("Store with the most items: " + bestStore);
        }
        sc.close();
    }
}
