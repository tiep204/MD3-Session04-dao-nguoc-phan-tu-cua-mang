import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 8, 5, 3, 5};
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
    }
}