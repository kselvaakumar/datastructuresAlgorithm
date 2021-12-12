public class BinaryGap {

    public static void main(String[] args) {
        BinaryGap bg = new BinaryGap();
        System.out.println(bg.solution2(65));
    }

   /* private int solution(int i) {
        if(i <=0 ) return 0;
        String binaryString = Integer.toBinaryString(i);
        System.out.println(binaryString);
        String[] str = binaryString.split("1");

        int maxgap = 0;
        for(String s : str) {
            System.out.println(s);
            if(maxgap < s.length()) {
                maxgap = s.length();
            }
        }
        return maxgap;
    } */

    private int solution2(int i) {
        if(i <=0 ) return 0;
        String binaryString = Integer.toBinaryString(i);
        System.out.println(binaryString);
        int currentGap = 0;
        int maxgap = 0;
        for (int j = 0; j < binaryString.length(); j++) {
            if(binaryString.charAt(j) == '0') {
                currentGap++;
            } else {
                if(maxgap < currentGap) {
                    maxgap = currentGap;
                }
                currentGap=0;
            }
        }
        return maxgap;
    }
}
