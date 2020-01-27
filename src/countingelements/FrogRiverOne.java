package countingelements;

//на каком элементе все элементы от 1 до X уже есть
public class FrogRiverOne {
    public static void main(String[] args) {
        //int[] A = {1, 3, 1, 4, 2, 3, 5, 4};
        //int[] A = {2, 2, 2, 2, 2, 2, 2, 2};
        int[] A = {1, 3, 1, 3, 2, 1, 3};
        System.out.println(solution(3, A));
    }

    /*
    * For example, for the input (2, [2, 2, 2, 2, 2]) the solution returned a wrong answer (got 0 expected -1).
    * For example, for the input (3, [1, 3, 1, 3, 2, 1, 3]) the solution returned a wrong answer (got 6 expected 4)
    *
    * Решение подсмотрел на stackoverflow
    * */
    static int solution(int X, int[] A) {
        boolean[] bitmap = new boolean[X+1];
        for(int i = 0; i < A.length; i++){
            if(!bitmap[A[i]]){
                bitmap[A[i]] = true;
                X--;
            }
            if(X == 0) return i;
        }
        return -1;
    }
}
