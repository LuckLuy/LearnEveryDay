package suanfa_fuxi;

import java.util.Arrays;

public class maopao {
	public static void main(String[] args) {
		//8)���������:
		int [] arr= {1,2,4,6,8,3,5,7};
		for(int i=0;i<arr.length-1;i++) { //��
			for(int j=0;j<arr.length-1-i;j++) { //��
				if(arr[j]>arr[j+1]) { //����һ����
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
				//��ǰ�����ں����򽻻�����֤ǰ��С�ں���----����
				//��ǰ��С�ں����򽻻�����֤ǰ�����ں���----����
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println();
		//��������1,2,3,4,5,6,7,8,
		
		
		System.out.println("----------------------");
		int[] arr1= new int[10];
		for(int i=0;i<arr.length;i++) {
			arr1[i]=(int) (Math.random()*100);
		}
		System.out.println("����ǰ:"+Arrays.toString(arr1));
		for(int i=0;i<arr1.length-1;i++) {
			for(int j=0;j<arr1.length-1-i;j++) {
				if(arr1[j]>arr1[j+1]) {
					int t=arr1[j];
					arr1[j]=arr1[j+1];
					arr1[j+1]=t;
				}
			}
		}
		System.out.println("�����:"+Arrays.toString(arr1));
		
		//��������
		//����ǰ:[60, 81, 25, 79, 55, 67, 39, 16, 0, 0]
		//�����:[0, 0, 16, 25, 39, 55, 60, 67, 79, 81]

		
		
		
		
		
		
		
		
		
		
	}
}
