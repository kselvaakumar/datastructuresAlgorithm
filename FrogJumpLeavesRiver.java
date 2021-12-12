import java.util.HashSet;

public class FrogJumpLeavesRiver {


    public static void main(String[] args) {
        FrogJumpLeavesRiver frogJumpLeavesRiver = new FrogJumpLeavesRiver();
        System.out.println(frogJumpLeavesRiver.solution(5, new int[] {1,5,3,1,4,2,3,3,4}));
    }

    public int solution(int X, int[] A){
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int i = 1; i <= X; i++) {
            hashSet.add(i);
        }

        for (int i = 0; i < A.length; i++) {
            if(hashSet.remove(A[i])){
                if(hashSet.isEmpty()){
                    return i;
                }
            }
        }
        return -1;
    }
}
