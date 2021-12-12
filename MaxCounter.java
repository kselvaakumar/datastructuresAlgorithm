public class MaxCounter {
    public static void main(String[] args) {
        MaxCounter maxCounter = new MaxCounter();
        //int[] value = maxCounter.solution(5, new int[] {3, 4, 4, 6, 1, 4, 4}); //3,2,2,4,2
        int[] value = maxCounter.solution(5, new int[] {6, 4, 4, 6, 1, 4, 4});
        //int[] value = maxCounter.solution(1, new int[] {1,1,2});
        //int[] value = maxCounter.solution(1, new int[] {1});
        for(int i=0; i < value.length; i++) {
            if(value.length-1 == i) {
                System.out.print(value[i]);
            }
            else {
                System.out.print(value[i] + " , ");
            }
        }
    }

    public int[] solution(int N, int[] A){
        if(N == 0 || A.length == 0) return A;
        int[] counter = new int[N];
        for (int i = 0; i < N; i++) {
            counter[i] = 0;
        }
        int max = 0;
        for (int i = 0; i < A.length; i++) {
            if(A[i] <= N) {
                counter[A[i]-1]= counter[A[i]-1] + 1;
                max = counter[A[i]-1];
            }
            else if(A[i] == N+1) {
                for (int j = 0; j < N; j++) {
                    counter[j] =  max;
                }
            }
        }
        return counter;
    }
}
