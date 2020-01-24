package timecomplexity;

public class PermMissingElem {
    public static void main(String[] args) {
        int[] A = {2, 3, 1, 5};
        System.out.println(solution(A));
    }

    static int solution(int[] A) {
        int[] tempArray = new int[A.length+1];

        for (int elem : A) {
            tempArray[elem-1] = 1;
        }

        int result = 0;

        for (int i = 0; i < tempArray.length; i++) {
            if (tempArray[i] == 0) {
                return i + 1;
            }
        }

        return result;
    }
}
