public class Main {
    public static void printHollowPattern(int noOfRows, int noOfcols) {
        for(int i = 0; i<noOfRows; i++){
            for(int j = 0; j<noOfcols; j++){
                if (i == 0 || i == noOfRows - 1 || j == 0 || j == noOfcols - 1) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello world!\n");
        printHollowPattern(6, 6);
    }
}