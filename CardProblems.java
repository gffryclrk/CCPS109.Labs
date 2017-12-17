
/**
 * Write a description of class CardProblems here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CardProblems
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class CardProblems
     */
    public CardProblems()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    public int getRank(char c){
        int rank;
        if(c == '2'){ rank = 2; }
        else if ( c == '3' ) { rank = 3; }
        else if ( c == '4' ) { rank = 4; }
        else if ( c == '5' ) { rank = 5; }
        else if ( c == '6') { rank = 6; }
        else if ( c == '7') { rank = 7; }
        else if ( c == '8') { rank = 8; }
        else if ( c == '9' ) { rank = 9; }
        else if ( c == 'T' ) { rank = 10; }
        else if ( c == 'J' ) { rank = 11; }
        else if ( c == 'Q' ) { rank = 12; }
        else if ( c == 'K' ) { rank = 13; }
        else if ( c == 'A' ) { rank = 14; }
        else { rank = 0; }
        return rank; 
        
    }
    public boolean hasFlush(String hand){
        if ((hand.charAt(1) == hand.charAt(3)) && (hand.charAt(1) == hand.charAt(5)) 
            && (hand.charAt(1) == hand.charAt(7)) && (hand.charAt(1) == hand.charAt(9))){
                return true;
            }else{
                return false;
            }
    }
    public boolean hasFourOfAKind(String hand){
        //int i = 0;
        int count = 0;
        int max = 0;
        for (int i=0; i<hand.length(); i=i+2){
            for(int j=0; j<hand.length(); j=j+2){
                if(hand.charAt(i) == hand.charAt(j)){ count = count + 1; }
            }
            if(count > max) { max = count; }
            count = 0;       
        }
        if(max >= 4){ return true; }
        else {return false; }
        
    }
    public boolean hasFourCardBadugi(String hand){
        int count = 0;
        //int max = 0;
        for (int i=0; i<hand.length(); i=i+1){
            for(int j=i%2; j<hand.length(); j=j+2){
                if(i==j){ continue; }
                if(hand.charAt(i) == hand.charAt(j)){ count = count + 1; }
            }
            //if(count > max) { max = count; }
            //count = 0;       
        }
        if(count < 1){ return true; }
        else {return false; }
    }
}
