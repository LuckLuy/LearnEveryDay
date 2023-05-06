package jiuye;


public class book {
	public static void main(String[] args) {
		
		String textString =new String("java");
		StringBuffer textBuffer=new StringBuffer("java");
		stringReplace(textString);
		bufferReplace(textBuffer);
		System.out.println(textString+textBuffer);
	}

	private static void bufferReplace(StringBuffer text) {
		
		text=text.append("c");
		
	}

	private static void stringReplace(String text) {
		
		text=text+"c";
	}
	
}
