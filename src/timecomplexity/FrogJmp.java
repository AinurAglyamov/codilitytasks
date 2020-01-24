package timecomplexity;

public class FrogJmp {
    public static void main(String[] args) {
        System.out.println(solution(10, 75, 30));
    }

    static int solution(int x, int y, int d) {
        double distance = y - x;
        double numberOfStepsDouble = distance/d;
        int numberOfStepsInt = (int)distance/d;

        if (numberOfStepsDouble > numberOfStepsInt) {
            return numberOfStepsInt + 1;
        }
        return numberOfStepsInt;
    }
}
