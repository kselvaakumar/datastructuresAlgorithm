public class ArrayRotation {

    public int[] solution(int[] A, int K) {
        if(A.length == K || A.length == 0) {
            return A;
        }
        while(K > 0) {
            int lastValue = A[A.length - 1];
            for (int i = A.length-1; i >= 1; i--) {
                A[i] = A[i - 1];
            }
            A[0] = lastValue;
            K--;
        }
        return A;
    }

    public static void main(String[] args) {
        ArrayRotation arrayRotation = new ArrayRotation();
        int[] A = arrayRotation.solution(new int[] {3, 8, 9, 7, 6}, 3 );
        for(int a: A) {
            System.out.println(a);
        }
    }
}
