import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {		
		checkTypos("pale", "bake");
			
	}
	
	public static boolean checkTypos(String string, String typo) {
		int qtd = 0;
		char[] charOfString = string.toCharArray();  
		char[] charOfTypo = typo.toCharArray();
		
		
		for(int i = 0; i < charOfString.length; i++) {
            for(int j = 0; j < charOfTypo.length; j++) {
                if(charOfString[i] == charOfTypo[j]) {
                	qtd++;
                }
			}
        }
		System.out.println(qtd);
		if(qtd != 0) {
			if((qtd*100)/string.length() >= 75) {
				System.out.println("true");
			}else {
				System.out.println("false");
			}
		}
		return false;
     }
}
