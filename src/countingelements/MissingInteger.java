package countingelements;

public class MissingInteger {
    public static void main(String[] args) {
        //int[] A = {1, 3, 6, 4, 1, 2};
        //int[] A = {1, 2, 3};
        //int[] A = {-1, -3};
        int[] A = {-1000000, 1000000};
        System.out.println(solution(A));
    }

    private static int solution(int[] A) {
        /*
        * Идея найти максимальный
        * */
        int max = 0;
        for (int elem : A) {
            if (elem > max) {
                max = elem;
            }
        }

        if (max <= 0) {
            return 1;
        }

        boolean[] temp = new boolean[max + 1];

        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                temp[A[i]] = true;
            }
        }

        for (int i = 1; i < temp.length; i++) {
            boolean setted = temp[i];
            if (!setted) {
                return i;
            }
        }

        return max + 1;
    }
}
