package binarygap;

public class BinaryGap {
    public static void main(String[] args) {
        //System.out.println(biGap(0b110011010000101));
        //System.out.println(binaryGap(0b110011010000101));
        System.out.println(binaryGap(0b110011010000101));
    }

    static int biGap(int x) {
        if (x<=0) {
            throw new IllegalArgumentException("Число неположительное");
        }

        int binaryGap = 0;
        int t = 0;
        char[] chars = Integer.toBinaryString(x).toCharArray();

        for (char c : chars) {
            if (c == '0') {
                t++;
            } else {
                if (t > binaryGap) {
                    binaryGap = t;
                }
                t = 0;
            }
        }

        return binaryGap;
    }

    static int binaryGap(int n) {
        //сперва обязательно необходимо избавиться от последних нулей
        //n = n >>> Integer.numberOfTrailingZeros(n);
        n |= (n-1);
        int count = 0;

        while ((n & (n + 1)) != 0) {
            n |= n>>>1;
            count++;
        }

        return count;
    }
}
