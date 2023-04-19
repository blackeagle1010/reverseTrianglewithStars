public class reverseTriangleStars {

    public static void main(String[] args) {
        int lineNum=10;
        for (int i = 1; i <=lineNum; i++) {
            for (int j = 0; j <= lineNum-1 ; j++){
                    System.out.print(" ");}
            for (int k = 19; k >= 2*i-1; k--) {
                System.out.print("*");}
                System.out.println();
        }
    }
}


