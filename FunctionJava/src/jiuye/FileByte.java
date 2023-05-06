package jiuye;

/**
 * 求出：1！+2！+3!+....20!的和？
 * @author lyy
 *
 */

public class FileByte {
public static void main(String[] args) {
	
/*	int num=0;
	int sum=0;
	for(int i=1;i<=20;i++) {
		num=1;
		for(int j=1;j<=i;j++) {
			num*=j;
		}
		sum+=num;
	}
	System.out.println(sum);*/
	//以上这是第一种方法。
	
	int num=0;
	int sum=0;
	for(int i=1;i<=3;i++) {
		num=1;
		for(int j=1;j<=i;j++) {
			num*=j;
		}
		sum+=num;
	}
	System.out.println(sum);
	
}


}
