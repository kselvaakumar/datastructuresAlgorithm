import java.util.ArrayList;
import java.util.List;

public class SumDigits {
    public static void main(String[] args) {
        SumDigits test = new SumDigits();
        System.out.println(test.solution(28));
        System.out.println(test.solution(-1000));
    }

    private int solution(int N) {
        if(N <= 0 ) return 0;
        List<Integer> digits = digits(N);
        int sum = 0;
        for(Integer digit : digits) {
            sum += digit;
        }
        //sum = 10
        int newSum = 0;
        while(true) {
            N = N + 1;
            List<Integer> newDigits = digits(N);
            for(Integer digit : newDigits) {
                newSum += digit;
            }
            if(newSum == sum) {
                break;
            }
            else{
                newSum =0;
            }
        }
        return N;
    }

    List<Integer> digits(int i) {
        List<Integer> digits = new ArrayList<Integer>();
        while(i > 0) {
            digits.add(i % 10);
            i /= 10;
        }
        return digits;
    }
}
