package jiuye;

public class feibonajie {
public static void main(String[] args) {
	/**
	 * 쳲��������У���ָ��������һ�����У�1,1,2,3,5,8,13,,,,
	 * �õݹ����ǰ10���ϵ��
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
