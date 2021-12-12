import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class permMissingElement {
    /*public int solution2(int[] A) {
        if(A.length == 0) return 0;
        int[] arr = new int[A.length+1];
        int index = 0;
        for (int i = 1; i <= A.length+1; i++) {
            arr[index] = i;
            index++;
        }
        for (int i = 0; i < A.length; i++) {
            if(arr[index] == A[i]) {
                arr[index] = 0;
            }
        }
        for (int i = 0; i < A.length; i++) {
            if(arr[index] == A[i]) {
                arr[index] = 0;
            }
        }
        return
    } */


    public int solution(int[] A) {
        if(A.length == 0) return 0;
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= A.length+1; i++) {
            list.add(i);
        }
        for (int i = 0; i < A.length; i++) {
            list.remove((Integer)A[i]);
        }
        return list.get(0);
    }

    public static void main(String[] args) {
        permMissingElement permMissingElement = new permMissingElement();
        System.out.println(permMissingElement.solution(new int[] {2,3,1,5}));
    }
}
