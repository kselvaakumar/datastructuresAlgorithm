public class TapeEquilibrium {
    public int solution(int[] A) {
        if(A.length == 0) return 0;
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        int min = Integer.MAX_VALUE;
        int paritionsum = sum;
        int firstPartition = 0;
        int secondPartition = sum;
        for (int partion = 0; partion < A.length - 1; partion++) {
            firstPartition += A[partion];
            secondPartition = sum - firstPartition;
            paritionsum = Math.abs(firstPartition - secondPartition);
            if (min > paritionsum) {
                min = paritionsum;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
        //System.out.println(tapeEquilibrium.solution(new int[] {3, 1,2,4,3}));
        System.out.println(tapeEquilibrium.solution(new int[] {-1000, 1000}));
    }
}
