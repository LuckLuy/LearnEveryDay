package jiuye;

public class indexof {
public static void main(String[] args) {
	/**
	 * 给你一组字符串：如：ju39sa348dsalj3 让你编程出里面的数字：393483
	 */
	String str="ju39sa348dsalj3";
	String[] ss=str.split("[a-z]+");
	for (int i = 0; i < ss.length; i++) {
		System.out.print(ss[i]);
	}
	System.out.println("");
	String s="as2kljas34jkh433";
	String[] s1=s.split("[a-z]+");
	for (int i = 0; i < s1.length; i++) {
		System.out.print(s1[i]);
	}
	System.out.println("");
	String sa="sa23hkjh43432";
	String[] sd=sa.split("[0-9]+");
	for (int i = 0; i < sd.length; i++) {
		System.out.print(sd[i]);
	}
	
}
}
