package jiuye;

public class BigBurger {
public static void main(String[] args) {
	
	System.out.println(add(3));
}

private static int add(int num) {
	if(num <= 0) {
		throw new RuntimeException("参数不合法");
	}
	if(num==1||num==0) {
		return num;
	}else {
		return num*add(num-1);
	}
}
}
