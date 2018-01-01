
/**
 * Write a description of class ArrayProblems here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
// import java.util.ArrayList;
// import java.util.List;

public class ArrayProblems
{
    public int[] everyOther(int[] a){
        int[] result;
        if(a.length % 2 == 0){
            result = new int[a.length/2];
        }else{
            result = new int[(a.length + 1)/2];
        }
        for(int i=0; i<a.length; i+=2){
            result[i/2] = a[i];
        }
        return result;
    }
    public int countInversions(int[] a){
        int count = 0;
        for(int i=0; i<a.length; i+=1){
            for(int j=0; j<a.length; j+=1){
                if(i < j & a[i] > a[j]){
                    count += 1;
                }
            }
        }
        return count;
    }
    public void squeezeLeft(int[] a){
        int lastZero = -1;
        for(int i=0; i<a.length; i+=1){
            if(a[i] == 0){
                if(lastZero >= 0){
                    if(a[lastZero] == 0) continue;
                }
                lastZero = i;
                //continue;
            }else if(a[i] != 0 & lastZero >= 0){
                a[lastZero] = a[i];
                a[i] = 0;
                if(a[lastZero + 1] == 0){
                    lastZero += 1;
                }else{
                    lastZero = i;
                }
                //continue; 
            }else{
                //continue;
            }
            
        }
        //return a;
    }
    public int[] runDecode(int[] a){
        // I ran into some trickiness with creating an array of dynamic size (analagous to push methods in other languages)
        // There doesn't seem to be any eloquent way of supporting this methodology (I experimented briefly with List and ArrayList,
        // however, I had problems converting these structures back into primitive int[] arrays).

        // int [] result;
        // List<Integer> result = new ArrayList<>();
        int count = 0;
        for(int i=0; i<a.length; i+=2){
            count += a[i];
        }
        
        int[] result = new int[count];
        count = 0;
        for(int i=0; i<a.length; i+=2){
            for(int j=0; j<a[i];j+=1){
                // result.add(a[i+1]);
                result[count] = a[i+1];
                count += 1;
            }
        }
        // int[] resultArray = new int[result.size()];
        // resultArray = result.toArray(resultArray);
        // return resultArray;
        return result;
    }
}