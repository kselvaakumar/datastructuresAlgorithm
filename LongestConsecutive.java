public class LongestConsecutive {
    public static void main(String[] args) {
        LongestConsecutive bg = new LongestConsecutive();
        System.out.println(bg.solution(new int[] {-5, -6, -7, -8, 3, 4, -9, -10, -11}));
    }

    private int solution(int[] A) {
        int i =0;
        int longSequence = 0;
        while (i < A.length) {
            int sequence = 1;

            while (i < A.length-1 && (A[i+1] == A[i] + 1)){
                sequence = sequence + 1;
                i = i+1;
            }
            if( sequence == 1) {
                i = i + 1;
            }
            longSequence = Math.max(longSequence, sequence);
        }
        int j = A.length-1;
        while (j > 0) {
            int sequence = 1;

            while (j > 1 &&  (A[j] == A[j] - 1)){
                sequence = sequence + 1;
                j = j-1;
            }
            if( sequence == 1) {
                j = j - 1;
            }
            longSequence = Math.max(longSequence, sequence);
        }
        return longSequence;
    }
}
