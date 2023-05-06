package suanfa_fuxi;

import java.util.Scanner;

public class sumu {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("请输入您的分数：");
	int score=scan.nextInt();
	if(score<=100) {
		Object fs= score>=90 ? 'A':(score>=80 ? 'B' :(score>=60 ? 'C' :(score >=0 ? 'D':("输入的分数错误！"))));
		System.out.println(fs);
	}else {
		System.out.println("分数错误,请再次输入！");
	}
} 
}
