package string;

public class findingMinMax {

	public static void main(String[] args) {
    
		String str = "haii this is gokula kannan";
	    int[] freq = new int[str.length()];
	    
	    		
	    char minChar = str.charAt(0);
	    char maxChar = str.charAt(0);
        
	    int i,j,min,max;
	    char string[] = str.toCharArray();
	    
	    for(i=0;i<str.length();i++) {
	    	freq[i]=1;
	    	for(j=i+1;j<str.length();j++) {
	    		if(string[i]==string[j]&&string[i] != ' ' && string[i]!='0') {
	    			freq[i]++;
	    			string[j] = '0';
	    		}
	    	}
	    	
	    }
	    
	    min = max= freq[0];
	    for(i = 0 ; i<freq.length; i++) {
	    	if(min>freq[i]&&freq[i]!='0') {
	    		min = freq[i] ; minChar = string[i];
	    	}
	    	if(max<freq[i]&&freq[i]!='0') {
	    		max = freq[i] ; maxChar = string[i];
	    	}
	    	
	   
	    }
	    
	    System.out.println("minimum occuring character " + minChar);
	    System.out.println("maximum occuring character " + maxChar);
		
	}

}