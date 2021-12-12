import java.math.RoundingMode;
import java.text.DecimalFormat;

public class FrogJump {
    private int solution(int X, int Y, int D) {
        if(Y < X || D <= 0 || X < 0 || Y < 0) return 0;
        double totalNoOfDistance = Y - X;
        double NoOfJumps = totalNoOfDistance / (double)D;
        return (int) Math.ceil(NoOfJumps);
    }
    public static void main(String[] args) {
            FrogJump frogJump = new FrogJump();
            System.out.println(frogJump.solution(10, 85, 30));
    }
}
