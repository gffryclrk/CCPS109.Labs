
/**
 * Write a description of class RecursionProblems here.
 *
 * @author Geoffrey Clark
 * @version 0.1
 */
import java.util.Arrays;
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
    boolean linearSearch(int[] arr, int x, int start, int end){
        if(arr[start] == x) return true;
        else if(start == end) return false;
        else return linearSearch(arr, x, start+1, end);
    }
    public void parityPartition(int[] arr, int start, int end){
        if(arr.length > 1 && start <= end){
            int[] arrOut = new int[arr.length]; // This is a new array to hold my mixed up copies...
            if((arr[start] & 1)==0){                
                // First copy element to the end
                // However there's a trick: If start > 0 I need to do to copies: Before & after the position. 
                // I'm finding myself genuinely surprised that there isn't an easier way to do this (perhaps there is)
                System.arraycopy(arr, start, arrOut, arr.length-1,1);
                // Next, copy rest of array:
                // First: before start
                System.arraycopy(arr, 0, arrOut, 0, start);
                // Second: After start
                System.arraycopy(arr, start+1, arrOut, start, arr.length-1-start);
                // Now copy everything back to the original array and pass it to itself. 
                System.arraycopy(arrOut, 0, arr, 0, arr.length);
                parityPartition(arr, start, end-1);
            }else{
                parityPartition(arr, start+1, end);
            }
        }
    }
}
