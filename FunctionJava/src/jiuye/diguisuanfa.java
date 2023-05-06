package jiuye;

import java.util.Scanner;

public class diguisuanfa{
public static void main(String[] args) {
	int a=add(5);
	System.out.println(a);
}
public static int add(int num) {
	
	if(num==1||num==0) {
		return num;
	}else {
		return num*add(num-1);
	}
	
}

}
