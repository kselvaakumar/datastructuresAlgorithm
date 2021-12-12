    import java.util.ArrayList;
    import java.util.List;

public class Burger {

    private int[] solution(int tomato, int cheese) {
        List<Integer> list = new ArrayList<>();
        if(tomato == 0 && cheese == 0) {
            return new int[] {0,0};
        }

        int half = cheese / 2;
        for(int i = 0; i <= half; i++){
            int t1 =  i;
            int t2 = cheese - i;
            if((t1 * 4) + (t2 * 2)== tomato){
                list.add(t1);
                list.add(t2);
            }
            else if((t1 * 2) + (t2 * 4) == tomato){
                list.add(t2);
                list.add(t1);
            }
        }

//        if(tomato % 2 == 0 && cheese * 2 <= tomato && tomato <= cheese * 4){
//            list.add(tomato/2 - cheese);
//            list.add(cheese * 2 - tomato / 2);
//        }
        int[] arrayofBurgers = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        return arrayofBurgers;
    }
    public static void main(String[] args) {
            Burger bg = new Burger();
            bg.solution(7,16);
    }
}
