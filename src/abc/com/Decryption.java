package abc.com;

/**
 * 
 * @author BaoTD
 * Secret Decoder Ring - Shift Number
 *
 */

public class Decryption {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] cString = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
				'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
				'W', 'X', 'Y', 'Z' };
		
		//String to decryption
		String s = "Uryyb, zl anzr vf Puhpx naq V arrq zbarl naq n wrg";
//		System.out.println(s.toUpperCase());
		char[] c = s.toUpperCase().toCharArray();
		
//		for (int i = 0; i < cString.length; i++) {
//			System.out.print(cString[i]);
//		}
		
		StringBuilder sb = new StringBuilder("");
		
		//shift number - change it from 1 - 25
		//have problem when use loop - try to solve this
		int j = 13;
		
		// 13. N O P Q R S T U V W X Y Z A B C D E F G H I J K L M
		for (int i = 0; i < cString.length; i++) {
			sb.append(cString[(i+j)%26]);
		}
		
		String s2 = sb.toString();
		System.out.println(s2);
		char[] c2 = s2.toCharArray();
		
		for(char ch : c){
			if(ch == ',' || ch == ' ')
				System.out.print(ch);
			else{
				for(int k = 0; k < c2.length; k++){
					if(c2[k] == ch)
						System.out.print(cString[k]);
				}
			}
		}
		
//		System.out.println("\n" + s2);
		
		System.out.println("\n");
	}
}
