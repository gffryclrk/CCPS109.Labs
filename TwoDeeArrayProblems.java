
/**
 * Write a description of class TwoDeeArrayProblems here.
 *
 * @author Geoffrey Clark
 * @version 0.1
 */
public class TwoDeeArrayProblems
{
    public double[][] transpose(double[][] a){
        double[][] transposed = new double[a[0].length][a.length];
        for(int i=0; i<a[0].length; i+=1){
            for(int j=0; j<a.length; j+=1){
                transposed[i][j] = a[j][i];
            }
        }
        // System.out.println(java.util.Arrays.deepToString(transposed));
        // lol I don't know where BlueJ outputs the above println... #noob
        return transposed;
    }
    public double[] minValues(double[][] a){
        double[] b = new double[a.length];
        for(int i=0;i<a.length;i+=1){
            if(a[i].length < 1){
                b[i] = 0; 
                continue;
            }
            double lowest = a[i][0];
            for(int j=0;j<a[i].length;j+=1){
                if(a[i][j] < lowest) lowest = a[i][j];
            }
            b[i] = lowest;
        }
        return b;
    }
    public int[][] zigzag(int rows, int cols, int start){
        int[][] ziggy = new int[rows][cols];
        for(int i=0; i<rows; i+=1){
            for(int j=0; j<cols; j+=1){
                if((i & 1) == 0) {
                    ziggy[i][j] = start+j+(cols*i);
                }else{
                    ziggy[i][cols-j-1] = start+j+(cols*i); 
                }
            }
        }
        return ziggy;
    }
    public double maximumDistance(double[][] pts){
        double maxi = 0.0;
        for(int i=0; i<pts.length; i+=1){
            for(int j=0; j<pts.length; j+=1){
                if(i==j) continue;
                if(distance(pts[i], pts[j]) > maxi) maxi = distance(pts[i], pts[j]);
            }
        }
        return maxi;
    }
    private double distance(double[] p1, double[] p2){
        double sum = 0.0;
        for(int i=0; i < p1.length; i++){
            sum += (p1[i] - p2[i]) * (p1[i] - p2[i]);
        }
        return Math.sqrt(sum);
    }
}
