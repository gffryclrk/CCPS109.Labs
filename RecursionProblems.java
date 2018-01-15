
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
        else if(start >= end) return true;
        else if(arr.length == 2 && arr[start] == arr[end]) return true;
        else if(arr[start] == arr[end] && allEqual(arr, start+1, end)) return true;
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
    int countRuns(int[] arr, int start, int end){
        if(arr.length == 0 | end < start | start < 0) return 0;
        int count = 0;
        // if(start < end && start < arr.length - 3){
        if(end < arr.length && start < end - 1){
            if(arr[start] != arr[start+1]){
                // return countRuns(arr, start+1, end) + 1;
                count += countRuns(arr, start+1, end);
            }else{
                count += countRuns(arr, start+2, end);
            }
        // }else if(start < end && start < arr.length - 2){
        }else if(end < arr.length && start == end - 1){
            if(arr[start] != arr[start+1]){
                count += 1;
            }else{
                // Nothing...
                count -=1;
            }
            //count -=1;
        }else if(end == start && end > 0){
            if(arr[start] == arr[start-1]) count -=1;
            count -=1;
        }
        return count + 1;
    }
    void reverse(int[] arr, int start, int end){
        // if(((end - start) & 1) == 0 && end > start){
        if(end > start){
            // Odd
            // System.arraycopy(arr, start, arr, end, 1);
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            reverse(arr, start+1, end-1);
        } else {
            // Even
        }
    }
    // lol I didn't realize I had already done this method so went to do it again.
    // My previous implementation seems better... 
    // Upon reviewing my previous code I now realize that this actually tests for matching adjacent integers, 
    // Not what was asked for in question. 
    /*
    boolean linearSearch(int [] arr, int x, int start, int end){
        if(start < end && arr[start] == arr[start+1]) return true;
        else if(start < end && arr[start] != arr[start+1]){
            return linearSearch(arr, x, start+1, end);
        }
        else return false;
    }
    */
}
