package jiuye;

public class feibonajie {
public static void main(String[] args) {
	/**
	 * 斐波那契数列，它指的是这样一个数列：1,1,2,3,5,8,13,,,,
	 * 用递归求出前10项的系数
	 */
	for(int i=1;i<11;i++) {
		System.out.println(fo(i));
	}
}
	public static int fo(int num) {
		if(num==1||num==2) {
			return 1;
		}else {
			return  fo(num-1)+fo(num-2);
		}
	}
}
