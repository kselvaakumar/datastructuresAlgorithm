import java.util.HashSet;

public class PermCheck {
    public static void main(String[] args) {
        PermCheck permCheck = new PermCheck();
        System.out.println(permCheck.solution(new int[] {4,1,3,2}));
        System.out.println(permCheck.solution(new int[] {4,1,3}));
        System.out.println(permCheck.solution(new int[] {4,1,3,2,5}));
        System.out.println(permCheck.solution(new int[] {0}));
        System.out.println(permCheck.solution(new int[] {1}));
    }

    public int solution(int[] A){
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 1; i <= A.length ; i++) {
            hashSet.add(i);
        }

        for (int i = 0; i < A.length; i++) {
            hashSet.remove((Integer) A[i]);
        }

        if(hashSet.isEmpty()) {
            return 1;
        }

        return 0;
    }
}
