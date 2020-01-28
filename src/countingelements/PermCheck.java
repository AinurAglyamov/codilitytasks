package countingelements;

public class PermCheck {
    public static void main(String[] args) {
        int[] A = {4, 1, 3, 2};
        System.out.println(solution(A));
    }

    /**
     * Проверка является ли массив перестановкой (Permutation)
     * @param A массив
     * @return 1, если массив является перестановкой, 0 - если нет
     */
    static int solution(int[] A) {
        boolean[] bitMap = new boolean[A.length + 1];

        for (int x : A) {
            if (x > A.length || bitMap[x]) {
                return 0;
            }
            bitMap[x] = true;
        }

        return 1;
    }
}
