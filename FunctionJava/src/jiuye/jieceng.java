package jiuye;

/**
 * ½×²ãËã·¨
 */
public class jieceng {
public static void main(String[] args) {
	
	int x=0;
	int y=0;
	for(int i=1;i<=20;i++) {
		y=1;
		for(int j=1;j<=i;j++) {
			y*=j;
		}
		x+=y;
	}
	System.out.println(x);
	System.out.println(add(20));
}
public static int add(int num) {
	int sum=0;
	int a=0;
	for(int i=1;i<=num;i++) {
		a=1;
		for(int j=1;j<=i;j++) {
			a*=j;
		}
		sum+=a;
	}
	return sum;
}


}
