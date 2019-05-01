public class Q1 {
	public static void main(String[] args) {		
		removeBlankSpaces("User is not allowed");
	}
	
	
	public static char[] removeBlankSpaces(String phrase) {
		
		char[] strArray = phrase.toCharArray();  
        
        for(int i = 0; i < strArray.length; i++){  
            if((strArray[i] == ' ')) {  
            	strArray[i] = '&';
            }
        }
        System.out.println(strArray);
		return strArray;  
	}
}
