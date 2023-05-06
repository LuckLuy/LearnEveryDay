package suanfa_fuxi;

public class Ndjc {
public static void main(String[] args) {

	System.out.println(str(4));
}
public static int str(int num) {
	/**
	 * num*µÄ½×²ãÏë³Ë
	 */
	if( num ==0 || num==1) {
		return num;
	}
	return num*str(num-1);
	
}
}
