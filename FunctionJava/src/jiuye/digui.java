package jiuye;

public class digui {
public static void main(String[] args) {
	/**
	 * ��1+2+3+4+5....+100�ۼӺͣ�����ͨforѭ��ʵ�ֺ͵ݹ�ʵ�����ַ���
	 */
	int sum=0;
	int old_date = (int) System.currentTimeMillis();
	for(int i=1;i<=10000;i++) {
		sum+=i;
	}
	int new_date = (int) System.currentTimeMillis();
	int rs=new_date-old_date;
	System.out.println(sum +"����ʱ�䣺"+rs);
	System.out.println("----------------------");
	int old_date1 = (int) System.currentTimeMillis();
	System.out.println(old_date1);
	long res =add(10000);
	int new_date1 = (int) System.currentTimeMillis();
	System.out.println(new_date1);
	int rs2=new_date1-old_date1;
	System.out.println( res +"����ʱ�䣺"+rs2 );
}

public static int add( int num) {
	if(num==1) {
		return 1;
	}else {
		return num+add(num-1);
	}
}

}