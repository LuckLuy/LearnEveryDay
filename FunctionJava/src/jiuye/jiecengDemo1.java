package jiuye;

public class jiecengDemo1 {
public static void main(String[] args) {
	
	System.out.println(add(5));
}
public static  int add(int num) {
	int sum=0;
	int x=0;
	for(int i=1;i<=num;i++) {
		x=1;
		for(int j=1;j<=i;j++) {
			x*=j;
		}
		sum+=x;
	}
	return sum;
}
}
