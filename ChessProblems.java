
/**
 * Write a description of class ChessProblems here.
 *
 * @author Geoffrey Clark
 * @version 0.1
 */
public class ChessProblems
{
    private static boolean inside(int i, int j, int n) {
        return 0 <= i && i < n && 0 <= j && j < n;
    }
    public int countSafeSquaresRooks_01(int n, boolean[][] rooks){
        int count = 0;
        boolean[] row = new boolean[rooks.length];
        boolean[] col = new boolean[rooks[0].length];
        for(int i=0; i<rooks.length; i+=1){
            for(int j=0; j<rooks[0].length; j+=1){
                if(rooks[i][j] == true){
                    if(!row[i]) {
                        row[i] = true;
                        count += 1;
                        if(!col[j]){
                            col[j] = true;
                            count += 1;
                        }
                    }else{
                        if(!col[j]){
                            col[j] = true;
                            count += 1;
                        }
                    }
                }
            }
        }
        return (n * n) - (count * (n + n - 1));
    }
    public int countSafeSquaresRooks(int n, boolean[][] rooks){
        int[] count = new int[2]; // rows, cols
        // boolean[][] rowColDanger = new boolean[rooks.length][rooks[0].length];
        boolean[] row = new boolean[rooks.length];
        boolean[] col = new boolean[rooks[0].length];
        for(int i=0; i<rooks.length; i+=1){
            for(int j=0; j<rooks[0].length; j+=1){
                if(rooks[i][j]){
                    if(!row[i]){
                        row[i] = true;
                        count[0] += 1;
                        if(!col[j]){
                            col[j] = true;
                            count[1] += 1;
                        }
                    }else{
                        if(!col[j]){
                            col[j] = true;
                            count[1] += 1;
                        }
                    }
                }
            }
        }
        // return (n * count[0]) + (n * (count[1] - count[0]));
        // System.out.println(n);
        // System.out.println((n * n) - ((n * count[0]) + (count[0] * (n - count[1]))));
        // return (n * n) - ((n * count[0]) + (count[0] * (n - count[1])));
        return (n * n) - ((count[1] * (n - count[0])) + (n * count[0]));
    }
    public int countSafeSquaresQueens(int n, boolean[][] queens){
        boolean[][] danger = new boolean[queens.length][queens[0].length];
        int count = 0;
        for(int i=0; i<(n*n); i+=1){
            // System.out.println("0 Index:" + (Math.floor(i/n)));
            // System.out.println("1 Index:" + (i % n));
            if(queens[(i/n)][(i % n)]){
                
                for(int j=0; j<(n*n); j+=1){
                    // int dx = Math.floor(j/n);
                    // int dy = (j % n);
                    if(!danger[(j/n)][(j%n)] && Math.abs((j/n)-(i/n)) == Math.abs((j%n)-(i%n)) || !danger[(j/n)][(j%n)] && (j/n)==(i/n) || !danger[(j/n)][(j%n)] && (j%n)==(i%n)){
                        danger[(j/n)][(j%n)] = true;
                        count += 1;
                    }
                }

            }


        }
        return (n*n) - count;
    }
    public int countKnightMoves(int n, boolean[][] knights){
        return 0;
    }
    public int countPawnMoves(int n, char[][] board){
        return 0;
    }
}
