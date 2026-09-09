import java.util.Scanner;

public class RangeSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] prefix = new long[n];
        for(int i = 0; i < n; i++){
            long value = scanner.nextLong();
            if(i == 0){
                prefix[i] = value;
            }else{
                prefix[i] = prefix[i - 1] + value;
            }
        }
        int q = scanner.nextInt();
        for(int i = 0; i < q; i++){
            int left = scanner.nextInt();
            int right = scanner.nextInt();
            if(left == 0){
                System.out.println(prefix[right]);
            }else{
                System.out.println(prefix[right] - prefix[left - 1]);
            }
        }
    }
}