package arrays;

public class CyclicRotation {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //a = rotateByOneElement(a, 3);
        rightRotateUsingGCD(a, 3);
        printArray(a);
    }

    static int[] rotateByOneElement(int[] a, int k) {
        int size = a.length;

        if (size == k) {
            return a;
        }

        boolean fl = true;

        for (int i = 1; i < size; i++) {
            if (a[i] != a[i-1]) {
                fl = false;
                break;
            }
        }

        if (fl) {
            return a;
        }

        for (int i = 0; i < k; i++) {
            int lastIndex = size - 1;
            int temp = a[lastIndex];
            for (int j = lastIndex; j > 0; j--) {
                a[j] = a[j - 1];
            }
            a[0] = temp;
        }

        return a;
    }

    static void rightRotateUsingGCD(int[] a, int d) {
        int size = a.length;
        int gcd = getGCD(size, d);
        for (int i = 0; i < gcd; i++) {

            int j = size - 1 - i;
            int initInd = j;
            int temp = a[j];

            while (true) {
                int k = j - d;
                if (k < 0)
                    k = size + k;
                if (k == initInd) {
                    break;
                }
                a[j] = a[k];
                j = k;
            }
            a[j] = temp;
        }
    }

    private static int getGCD(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        return a + b;
    }

    private static void printArray(int[] a) {
        for (int elem : a) {
            System.out.print(elem + " ");
        }
    }
}
