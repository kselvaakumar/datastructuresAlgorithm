import java.util.HashMap;
import java.util.Map;

public class OppositeNumbers {
    public static void main(String[] args) {
        OppositeNumbers test = new OppositeNumbers();
        System.out.println(test.solution(new int[] {3,2,-2,5,-3})); // returns 3
        System.out.println(test.solution(new int[] {1,1,2,-1,2,-1}));
        System.out.println(test.solution(new int[] {1,2,3,-4}));
        System.out.println(test.solution(new int[] {1000000000, -1000000000}));
        System.out.println(test.solution(new int[] {-2, 2}));
    }

    private int solution(int[] arr) {
        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = Math.abs(arr[i]);
            if (!hashMap.containsKey(arr[i])) {
                if (hashMap.containsKey(temp)) {
                    hashMap.put(temp, hashMap.get(temp)+ 1);
                    if(max < temp) {
                        max = temp;
                    }
                }
                else {
                    hashMap.put(temp,1);
                }
            }
        }
        /*if(hashMap.size() == 1) {
            Map.Entry<Integer,Integer> entry = hashMap.entrySet().iterator().next();
            Integer key = entry.getKey();
            max = key;
        }*/
        return max;
    }
}
