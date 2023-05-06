package suanfa_fuxi;

import java.util.Arrays;

public class maopao {
	public static void main(String[] args) {
		//8)数组的排序:
		int [] arr= {1,2,4,6,8,3,5,7};
		for(int i=0;i<arr.length-1;i++) { //轮
			for(int j=0;j<arr.length-1-i;j++) { //次
				if(arr[j]>arr[j+1]) { //和下一个比
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
				//若前数大于后数则交换，保证前数小于后数----升序
				//若前数小于后数则交换，保证前数大于后数----降序
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println();
		//输出结果：1,2,3,4,5,6,7,8,
		
		
		System.out.println("----------------------");
		int[] arr1= new int[10];
		for(int i=0;i<arr.length;i++) {
			arr1[i]=(int) (Math.random()*100);
		}
		System.out.println("排序前:"+Arrays.toString(arr1));
		for(int i=0;i<arr1.length-1;i++) {
			for(int j=0;j<arr1.length-1-i;j++) {
				if(arr1[j]>arr1[j+1]) {
					int t=arr1[j];
					arr1[j]=arr1[j+1];
					arr1[j+1]=t;
				}
			}
		}
		System.out.println("排序后:"+Arrays.toString(arr1));
		
		//输出结果：
		//排序前:[60, 81, 25, 79, 55, 67, 39, 16, 0, 0]
		//排序后:[0, 0, 16, 25, 39, 55, 60, 67, 79, 81]

		
		
		
		
		
		
		
		
		
		
	}
}
