
public class Reoder {

    public static void main(String[] args) {
        int[] stock = {4, 12, 2, 9, 5};
        int reorderLevel = 5;
        int reOrderCount = 0;

        for (int i = 0; i <= stock.length - 1; i++) {
            if (stock[i] <= reorderLevel) {
                reOrderCount++;
            }
        }

        System.out.println("Items to reorder: " + reOrderCount);
    }
}
