
/**
 * Write a description of class ArrayShapeProblems here.
 *
 * @author Geoffrey Clark
 * @version 0.1
 */
public class ArrayShapeProblems
{
    public int countUpsteps(int[] a){
        int count = 0;
        for(int i=0; i<a.length-1;i+=1){
            if(a[i] < a[i+1]) count += 1;
        }
        return count;
    }

    public boolean sameStepShape(int[] a, int[] b){
        boolean shapeStatus = true;
        for(int i=0; i<a.length-1; i+=1){
            if((a[i] < a[i+1] && b[i] >= b[i+1]) | (a[i] > a[i+1] && b[i] <= b[i+1]) | (a[i] == a[i+1] && b[i] != b[i+1])) shapeStatus = false;
        }
        return shapeStatus;
    }
    public boolean isSawtooth(int[] a){
        if(a.length < 2) return true;
        boolean sawtooth = true;
        for (int i=1; i<a.length-1; i+=1) {
            if((a[i] - a[i-1])*(a[i]-a[i+1]) <= 0) sawtooth = false;
        }
        return sawtooth;
    }
    public boolean isMountain(int[] a){
        boolean mountain = true;
        boolean down = false;
        for (int i=0; i<a.length-1; i+=1) {
            if(down == false){
                if(a[i] < a[i+1]) continue;
                else {
                    down = true;
                    continue;
                }
            }else{
                if(a[i] > a[i+1]) continue;
                else{
                    mountain = false;
                    break;
                }
            }
        }
        return mountain;
    }
}
