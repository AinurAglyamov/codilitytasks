package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {3, 2, 1, 4, 6, 5};
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }

    static private void bubbleSort(int[] a) {
        for (int i = a.length; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                if (a[j-1] > a[j]) {
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
