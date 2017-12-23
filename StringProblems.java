
/**
 * CCPS109 Lab04: Using conditions and loop with Strings
 *
 * @author Geoffrey Clark
 * @version 0.1
 */
public class StringProblems
{
    public String removeDuplicates_original(String s){
        // I misread the question but this code does what I intended (I think)
        StringBuilder sUnique = new StringBuilder("");
        //sUnique = "";
        for(int i=0;i<s.length();i+=1){
            boolean cUnique = true;
            for(int j=0;j<sUnique.length(); j+=1){
                if(s.charAt(i) == sUnique.charAt(j)){ cUnique = false; }
            }
            if(cUnique){ sUnique.append(s.charAt(i)); }//sUnique = sUnique + s.charAt(i); }
        }
        return sUnique.toString();
    }
    public String removeDuplicates(String s){
    	StringBuilder sUnique = new StringBuilder("");
    	if(s.length() > 0){
	    	sUnique.append(s.charAt(0));
	    	for(int i=1; i<s.length(); i+=1){
	    		if(sUnique.charAt(sUnique.length()-1) != s.charAt(i)) sUnique.append(s.charAt(i));
	    	}
	    }
    	return sUnique.toString();
    }
    public int countWords(String s){
    	int count = 0;
    	for(int i=0; i<s.length(); i+=1){
    		if(i==0){
    			if(Character.isWhitespace(s.charAt(i))) continue;
    			else {
    				count += 1;
    				continue;
    			}
    		}else{
    			if(Character.isWhitespace(s.charAt(i)) == false & Character.isWhitespace(s.charAt(i-1))){
    				count += 1;
    			}
    		}
    	}
    	return count;
    }
    public String convertToTitleCase(String s){
    	StringBuilder titleCase = new StringBuilder(s);
    	for(int i=0; i<titleCase.length(); i+=1){
    		if(i==0){
    			if(Character.isWhitespace(titleCase.charAt(i))) continue;
    			else {
    				titleCase.setCharAt(i, Character.toTitleCase(titleCase.charAt(i)));
    			}
    		}else{
    			if(Character.isWhitespace(titleCase.charAt(i)) == false & Character.isWhitespace(titleCase.charAt(i-1))){
    				titleCase.setCharAt(i, Character.toTitleCase(titleCase.charAt(i)));
    			}
    		}
    	}
    	return titleCase.toString();
    }
    public String stretch(String s, int n){
    	StringBuilder stretchString = new StringBuilder("");
    	if(s.length() == 0){

    	}else if(s.length() == 1){
    			stretchString.insert(0, s.charAt(0));
    	}else{
    		
	    	if(n==0 || n > 100){
	    		// stretchString = s.charAt(0) + s.charAt(s.length());
	    		// stretchString = s.substring(0,1) + s.substring(s.length(), 1);
	    		//stretchString.appe

	    		
	    	}else{
	    		for(int i=1; i<s.length()-1; i+=1 ){
	    			for(int j=0; j<n; j+=1){
	    				// stretchString += s.charAt(i);
	    				stretchString.append(s.charAt(i));
	    			}
	    		}
	    		// stretchString.insert(0, s.charAt(0));
	    		// stretchString.append(s.charAt(s.length()));
	    		// stretchString.insert(0, s.substring(0,1)).append(s.substring(s.length(), 1));
	    		// stretchString.insert(0, s.charAt(0)).append(s.charAt(s.length()-1));
	    	}
	    	// stretchString.insert(0, s.substring(0,1)).append(s.charAt(s.length()-1));
	    	// stretchString.insert(0, s.charAt(0)).append(s.charAt(s.length()-1));
	    	stretchString.insert(0, s.charAt(0)).append(s.charAt(s.length()-1));
	    }
    	return stretchString.toString();

    }

}
