package arrays;

import java.util.HashMap;
import java.util.Map;

public class OddOccurences {
    public static void main(String[] args) {
        int[] arr = {3, 5, 3, 5, 7, 9, 4, 9, 4};
        //System.out.println(usingNestedLoops(arr));
        //System.out.println(usingHashMap(arr));
        System.out.println(usingXOR(arr));
    }

    static int usingNestedLoops(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count % 2 == 1) {
                return arr[i];
            }
        }
        return -1;
    }

    static int usingHashMap(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int elem : array) {
            if (map.containsKey(elem)) {
                map.put(elem, map.get(elem) + 1);
            } else {
                map.put(elem, 1);
            }
        }

        for (int key : map.keySet()) {
            int count = map.get(key);
            if (count % 2 == 1) {
                return key;
            }
        }

        return -1;
    }

    static int usingXOR(int[] arr) {
        int result = 0;
        for (int x : arr) {
            result ^= x;
        }
        return result;
    }
}
