package jiuye;

/**
 * �����1��+2��+3!+....20!�ĺͣ�
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
	//�������ǵ�һ�ַ�����
	
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
