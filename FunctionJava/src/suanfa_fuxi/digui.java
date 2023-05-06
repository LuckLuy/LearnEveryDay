package suanfa_fuxi;

public class digui {
public static void main(String[] args) {
	int [] arr= {1,3,4,6,7,8,9};
	int low=0;
	int key=5;
	int high= arr.length-1;
	//int position= str(arr,key,low,high);
	int position = search(arr,key);
	if(position ==-1) {
		System.out.println("查找的数："+key+"，不存在！");
	}else {
		System.out.println("查找的数："+key+"，它的位置在："+position);
	}
}
public static int str(int[] arr,int key,int low,int high) {
	if(arr[low] >key || arr[high]<key || low>high) {
		return -1;
	}
	int middle =(low+high)/2;
	if( arr[middle]>key) {
		return str(arr,key,low,middle-1);
	}else if(arr[middle] <key) {
		return str(arr,key ,middle+1,high);
	}else {
		return middle;
	}
	
}

public static int search(int[] arr,int key) {
	int low =0;
	int high=arr.length-1;
	int middle =0;
	if( arr[low]>key || arr[high]<key || low>high) {
		return -1;
	}
	for(low<= high) {
		middle= (low+high)/2;
		if(arr[middle]>key) {
			high =middle -1;
		}else if(arr[middle] <key) {
			low=high+1;
		}else {
			return middle;
		}
	}
	return -1;
}






}
