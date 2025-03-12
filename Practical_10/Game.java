import java.util.Random;
public class Game {
    public static void grid(String[][] layout, int size) {
        int n =2*size;
        for (int i=0;i<=n;i++){
            for (int j=0;j<size;j++) {
                if (i%2==0){
                    System.out.print(" ".repeat(digit(size))+"-");
                    if (i==n-1){
                      System.out.print(" ".repeat(digit(size))+"-");
                    }
                } else {
                    System.out.print("|"+layout[i/2][j]);
                    if(j==size-1){
                      System.out.print("".repeat(digit(size))+"|");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void fillGrid(String[][] layout, int size) {
        Random r = new Random();
        for (int i=0;i<size;i++) {
            for (int j=0;j<size;j++) {
                if (r.nextDouble()<0.3) {
                    layout[i][j]=" ".repeat(digit(size));
                } else {
                    layout[i][j] = String.format("%"+digit(size)+"s", r.nextInt(size)+1);
                }
            }
        }
    }

    private static int digit(int size) {
        int k =size,count=0;
        while(k>0) {
            k=k/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int size = 10;
        String[][] layout = new String[size][size];
        fillGrid(layout, size);
        grid(layout, size);
    }
}
