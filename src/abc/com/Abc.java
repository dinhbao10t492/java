package abc.com;

import java.text.NumberFormat;
import java.util.UUID;

public class Abc {

	/**
	 * @param args
	 * 
	 *            This Hello
	 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		System.out.println(-(1.0 / 5) * Math.log(1.0 / 5) / Math.log(2)
				- (4.0 / 5) * Math.log(4.0 / 5) / Math.log(2));
		System.out.println(0.991 - (4.0 / 9) * 0.811 - (5.0 / 9) * 0.722);

		System.out.println("Random String: ");
		String myRandomID = UUID.randomUUID().toString();
		System.out.println(myRandomID);
		System.out.println((int) (Math.random() * 50));

		String s = "Hello";
		System.out.println(s + " : " + s.hashCode());

		StringBuilder sb = new StringBuilder(s);
		System.out.println(sb + " : Builder " + sb.hashCode());

		sb.append(" Viet Nam.");
		System.out.println(sb + " : Builder " + sb.hashCode());

		s += " Viet Nam.";
		System.out.println(s + " : " + s.hashCode());

		/*
		 * try { URI uri = new URI("http:\\somecompany.com");
		 * System.out.println(uri.hashCode()); } catch (URISyntaxException e) {
		 * System.out.println(e.getMessage()); }
		 */
		
		System.out.println("-----------------");
		String abc = null;
		
		if(abc == null)
			System.out.println("abbabab");
		else
			System.out.println("bcbcbbcbc");
		
		double d = 2598.57000;
	    NumberFormat n = NumberFormat.getInstance();
	    n.setMaximumFractionDigits(3);
	    System.out.println(n.format(d));
	}
}
