package sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort {
    private static int[] arr = {1, 3, 25, 6, 8, 7, 19, 22, 15};
    public static void main(String[] args) {
        /*int partInd = partition(0, arr.length -1, 15);
        System.out.println("partInd = " + partInd);*/
        quickSort(0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int left, int right) {
        if (right - left <= 0) {
            return;
        } else {
            int pivot = arr[right];
            int partition = partition(left, right, pivot);
            quickSort(left, partition - 1);
            quickSort(partition + 1, right);
        }
    }

    private static int partition(int left, int right, int pivot) {
        int leftPointer = left - 1;
        int rigthPointer = right;

        while (true) {
            while (arr[++leftPointer] < pivot);
            while (rigthPointer > 0 && arr[--rigthPointer] > pivot);

            if (leftPointer >= rigthPointer) {
                break;
            } else {
                swap(leftPointer, rigthPointer);
            }
        }

        swap(leftPointer, right);

        return leftPointer;
    }

    private static void swap(int ind1, int ind2) {
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }
}
