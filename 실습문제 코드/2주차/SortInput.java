import java.util.Scanner;

public class SortInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(); // 몇개의 수를 받을지

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }

        int temp;
        for (int i = N-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int val : arr) {
            System.out.printf("%d ", val);
        }
    }
}
