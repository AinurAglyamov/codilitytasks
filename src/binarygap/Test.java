package binarygap;

public class Test {
    public static void main(String[] args) {
        int x = 0b100011000010010000001;
        char[] chars = Integer.toBinaryString(x).toCharArray();
        int t = 0;
        int max = 0;
        for (char ch : chars) {
            if (ch == '0') {
                t++;
            } else if (ch == '1') {
                if (t > max) {
                    max = t;
                }
                t = 0;
            }
        }
        System.out.println(max);
    }
}
