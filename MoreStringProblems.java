
/**
 * Write a description of class MoreStringProblems here.
 *
 * @author Geoffrey Clark
 * @version 0.1
 */
public class MoreStringProblems
{
    public String uniqueCharacters(String text){
        StringBuilder uniqueChars = new StringBuilder("");
        for (int i=0; i<text.length(); i+=1) {
            boolean unique = true;
            for (int j=0; j<uniqueChars.length(); j+=1) {
                if(text.charAt(i) == uniqueChars.charAt(j)){
                    unique = false;
                    break;
                }
            }
            if(unique) uniqueChars.append(text.charAt(i));
        }
        return uniqueChars.toString();
    }
    public int countOccurrences(String text, String pattern){
        if(pattern.length() > text.length()) return 0;
        int occurrences = 0;
        for (int i=0; i<=text.length()-pattern.length(); i+=1) {
            
            if(text.charAt(i) == pattern.charAt(0)){
                int matches = 1;
                for (int j=1; j<pattern.length(); j+=1) {
                    if(text.charAt(i+j) == pattern.charAt(j)) matches += 1;
                    else break;
                }
                if(matches == pattern.length()) occurrences += 1;
            }else{
                continue;
            }
        }
        return occurrences;
    }
    public String cyclicLeftShift(String s, int k){
        StringBuilder shiftAppend = new StringBuilder("");
        int l = k % s.length();
        for(int i=l; i<s.length(); i+=1){
            shiftAppend.append(s.charAt(i));
        }
        for(int i=0;i<l;i+=1){
            shiftAppend.append(s.charAt(i));
        }
        return shiftAppend.toString();
    }
    public int parseInt(String s){
        int finalInt = 0;
        for(int j=0; j<s.length(); j+=1){
            if(s.charAt(s.length()-1-j) == '-'){
                finalInt *= -1;
                break;
            }
            // My Original Implementation
            // for(int i=0; i<s.charAt(s.length()-1-j)-48; i+=1){
            //     finalInt += 1*(Math.pow(10,j));
            // }
            // Improved? Less looping. 
            finalInt += (s.charAt(s.length()-1-j)-48)*(Math.pow(10,j));
        }
        return finalInt;
    }
}
