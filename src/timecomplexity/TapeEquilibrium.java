package timecomplexity;

public class TapeEquilibrium {
    public static void main(String[] args) {
        int[] A = {3, 2, 2, 4, 3};
        System.out.println(solution(A));
    }

    static int solution(int[] A) {
        int sum = 0;
        for(int elem : A) {
            sum += elem;
        }

        int leftSum = 0;
        int rightSum = sum;
        int minDiff = Integer.MAX_VALUE;

        for (int p = 1; p < A.length; p++) {
            leftSum += A[p-1];
            rightSum -= A[p-1];
            int absDiff = Math.abs(rightSum - leftSum);
            if (absDiff < minDiff) {
                minDiff = absDiff;
            }
        }

        return minDiff;
    }
}
