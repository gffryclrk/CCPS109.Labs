
/**
 * Write a description of class RecursionProblems here.
 *
 * @author Geoffrey Clark
 * @version 0.1
 */
// import java.util.Arrays;
public class RecursionProblems
{
    public boolean allEqual(int[] arr, int start, int end){
        if(arr.length <= 1) return true;
        if(start == end) return true;
        if(arr[start] == arr[end] && allEqual(arr, start+1, end)) return true;
        else return false;
    }
    public void arraycopy(double[] src, int start, double[] tgt, int start2, int len){
        if(len > 0){
            tgt[start2] = src[start];
            // System.out.println(Arrays.toString(tgt));
            arraycopy(src, start+1, tgt, start2+1, len-1);
        }
    }
}
