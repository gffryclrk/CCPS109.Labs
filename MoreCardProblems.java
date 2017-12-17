
/**
 * Write a description of class MoreCardProblems here.
 *
 * @author Geoffrey Clark
 * @version 0.1
 */
public class MoreCardProblems
{
    public int bridgePointCount(String hand){
        int count = 0;
        for(int i=0; i<hand.length(); i=i+2){
            if(hand.charAt(i) == 'A'){ count = count + 4; }
            else if(hand.charAt(i) == 'K'){ count = count + 3; }
            else if(hand.charAt(i) == 'Q'){ count = count + 2; }
            else if(hand.charAt(i) == 'J'){ count = count + 1; }
        }
        return count;
    }
    public int countDeadwood(String hand){
        int count = 0;
        for(int i=0; i<hand.length(); i=i+2){
            if(hand.charAt(i) == 'A'){ count = count + 1; }
            else if(hand.charAt(i) == 'K' | hand.charAt(i) == 'Q' 
            | hand.charAt(i) == 'J' | hand.charAt(i) == 'T'){ count = count + 10; }
            else{
                count = count + Character.getNumericValue(hand.charAt(i));
            }            
        }
        return count;
    }
    public String bridgeHandShape(String hand){
        int[] suitCounts;
        suitCounts = new int[4];
        for(int i=1; i<=hand.length(); i+=2){
            if(hand.charAt(i) == 's'){ suitCounts[0] += 1; } //spades
            else if(hand.charAt(i) == 'h'){ suitCounts[1] += 1; } //hearts
            else if(hand.charAt(i) == 'd'){ suitCounts[2] += 1; } //diamonds
            else if(hand.charAt(i) == 'c'){ suitCounts[3] +=1; }  //clubs
        }
        return Integer.toString(suitCounts[0]) + ", " + Integer.toString(suitCounts[1]) + ", " + Integer.toString(suitCounts[2]) + ", " 
            + Integer.toString(suitCounts[3]); 
    }
    public boolean hasFullHouse(String hand){
        boolean three = false; //false;
        boolean two = false;//false;
        for(int i=0; i<hand.length(); i+=2){
            int count = 0;
            for(int j=0; j<hand.length(); j+=2){
                if(hand.charAt(i) == hand.charAt(j)){
                    count += 1;
                }
            }
            if(count==3){three = true;}
            else if(count==2){two = true;}
        }
        if(two & three) return true;
        else return false;
    }    
}
