
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
            double lowest = a[i][0];
            for(int j=0;j<a[i].length;j+=1){
                if(a[i][j] < lowest) lowest = a[i][j];
            }
            b[i] = lowest;
        }
        return b;
    }
}
