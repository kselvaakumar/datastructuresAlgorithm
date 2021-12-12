import java.util.HashSet;

public class OddOccurences {
    public int solution(int[] A) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for(int a : A) {
            if(hashSet.contains(a)) {
                hashSet.remove(a);
            }
            else {
                hashSet.add(a);
            }
        }
        return hashSet.iterator().next();
    }
    public static void main(String[] args) {
        OddOccurences oddOccurences = new OddOccurences();
        System.out.println(oddOccurences.solution(new int[] {9, 3, 9, 3, 9, 7, 9}));
    }
}
