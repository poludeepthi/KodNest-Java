
class SwapArray {

    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50};
        int left = 0;
        int right = a.length - 1;
        while (left < right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = a[left];
            left++;
            right--;
        }
        for (int i = 0; i <= a.length - 1; i++) {
            System.out.println(a[i]);
        }
    }
}
