
public class DebugTraceArray {

    public static void main(String[] args) {
        int[] original = {14, 18, 22, 26};
        int updateIndex = 1;
        int updateValue = 25;
        int requestIndex = 4;

        int[] snapshot = new int[original.length];

        for (int i = 0; i <= original.length - 1; i++) {
            snapshot[i] = original[i];
        }

        int[] liveView = original;

        if (updateIndex >= 0 && updateIndex < liveView.length) {
            liveView[updateIndex] = updateValue;
        }

        System.out.print("Original: ");
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + " ");
        }
        System.out.println();

        System.out.print("Snapshot: ");
        for (int i = 0; i < original.length; i++) {
            System.out.print(snapshot[i] + " ");
        }
        System.out.println();

        System.out.println("Same object: " + (original == liveView));

        if (requestIndex >= 0 && requestIndex < original.length) {
            System.out.println("Requested value: " + original[requestIndex]);
        } else {
            System.out.println("Requested value: Invalid index");
        }
    }
}
