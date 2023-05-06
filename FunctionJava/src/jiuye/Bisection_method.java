package jiuye;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * ���ַ�
 */
public class Bisection_method {
public static void main(String[] args) {
	//�������һ����������
	int [] a= suiji();
	//������a����
	//�����������顣�����Ż��Ŀ��������㷨��
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	System.out.println("���ҵ�Ŀ��ֵ��");
	int t=new Scanner(System.in).nextInt();
	
	//����������a�У�����Ŀ��ֵt��λ�á�
	//����Ҳ��������ظ��� ������ֵ��
	int index=binarySearch(a,t);
	if(index>=0) {
		System.out.println("�±�λ�ã�"+index);
	}else {
		System.out.println("Ŀ��ֵ������");
	}
}

private static int binarySearch(int[] a, int t) {
	/*
	 * t=70;
	 * a
	 *              mid
	 * [23,55,64,69,70,71,75,89,92]
	 * lo						hi-1
	 * ���������±����
	 * lo=0;
	 * hi=a.length-1;
	 * mid;
	 * ��lo<=hi
	 * mid=(lo+hi)/2;
	 * midλ��ֵ��t��hi�Ƶ�mid-1λ��	
	 * �������midλ��ֵ��tС��lo�Ƶ�mid+1λ�á�
	 * ���򣬷���mid�±�ֵ��
	 * ����-1��������ֵ����ʾ�Ҳ�����					
	 */
	int lo=0;
	int hi=a.length-1;
	int mid;
	for(lo<=hi) {
		mid=(lo+hi)/2;
		if(a[mid]>t) {
			hi=mid-1;
		}else if(a[mid]<t) {
			lo=mid+1;
		}else {
			return mid;
		}
	}
	return  -1;
	
}

private static int[] suiji() {
	//����һ��5+[0,6]��Χ�����������
	//�浽����n��
	int n=5+new Random().nextInt(6);
	
	//�½�int[] ���飬����n.
	//�浽����a��
	int[] a=new int [n];
	
	//�������飬����100�����������
	for(int i=0;i<a.length;i++) {
		a[i]=new Random().nextInt(100);
	}
	
	//��������a��
	return a;
}
}