import java.util.*;

public class Main {
	public static void main(String[] args) {
		String str = "         ,r'\"7\n" + 	// \", \n 이 제어문자
				   "r`-_   ,'  ,/\n" + 		// \n 이 제어문자
				   " \\. \". L_r'\n" + 		// \\, \", \n 이 제어문자
				   "   `~\\/\n" + 			// \\, \n 이 제어문자
				   "      |\n" + 			// \n 이 제어문자
				   "      |";
 
		System.out.print(str);
	}
}