public class PrintPatternToConsole {
    public static void main(String[] args) {
        practise4(5);
    }

    static void practise7(int n) {
        for (int row = 0; row < n * 2; row++) {
            int noOfSpaces = row > n ? (2*n)-row : row;
            for (int space = 0; space < n-row; space++) {

            }
        }
    }


    static void practise6(int n) {
        for (int row = 1; row <= n; row++) {
            for(int space = 1; space < n-row+1; space++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }

            for (int col = 2; col <= row ; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }


    static void practise5(int n) {
        for (int row = 1; row <= n; row++) {
            int noOfspaces = n - row + 1;
            for (int space = 1; space <= noOfspaces; space++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void practise4(int n) {
        for (int row = 1; row <= (n*2)-1 ; row++) {
            int columnSize = row > n ? (n*2)-row : row;
           /* if(row > n) {
                for (int col = 1; col <= (n*2)-row ; col++) {
                    System.out.print("* ");
                }
            }
            else {*/
                for (int col = 1; col <= columnSize; col++) {
                    System.out.print("* ");
                }
            //}
            System.out.println();
        }
    }

    static void practise3(int n) {
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void practise(int n) {
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void practise1(int n) {
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= n+1-row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
