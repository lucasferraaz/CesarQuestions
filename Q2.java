import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		String stringBase = "";
		String stringCompare = "";
		checkJumbledLetters(stringBase, stringCompare);
	}
	
	
	public static boolean checkJumbledLetters(String stringBase, String stringCompare) {
		char[] charOfBase = stringBase.toCharArray();  
		char[] charOfCompare = stringCompare.toCharArray();
		int qtd = 0;
		
		char firstBase = stringBase.charAt(0);		
		char firstCompare = stringCompare.charAt(0);
		
		
		for(int i = 0; i < charOfBase.length; i++) {
            for(i = 0; i < charOfCompare.length; i++) {
            	if(charOfBase[i] == charOfCompare[i]) {
					qtd++;
				}else {
				}  
            }
        }
		
		if(firstBase == firstCompare) {
			if(stringBase.length() > 3) {
				if(qtd > stringBase.length() * 2/3) {
					return true;
				}else {
					return false;
				}
			}else {
				return true;
			}
		}else {
			return false;
		}
	}
}

