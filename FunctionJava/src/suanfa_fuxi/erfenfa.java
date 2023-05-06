package suanfa_fuxi;

public class erfenfa {
public static void main(String[] args) {
	
	/**
	 * 二分查找
	 *title:commonBinarySearch
	 *@param arr ：数组对象
	 *@param key ：要查找的位置。
	 *@return 关键字位置
	 */
	int[] arr = {1,3,5,7,9,11};
	int key = 7;
	int high=arr.length - 1;
	//这是递归算法的设值方式
	// 获取下标的位置
	int position = recursionBinarySearch(arr,key,0,high);
	//int position = Search(arr,key,0,high);
	//这是循环设置值得方式。
	//int position = commonBinarySearch(arr, key);

    if(position == -1){
		System.out.println("查找的是"+key+",序列中没有该数！");
	}else{
		System.out.println("查找的是"+key+",找到位置为："+position);
	}
}

// 使用递归实现的二分查找
/**
 * 使用递归的二分查找
 *title:recursionBinarySearch
 *@param arr 有序数组
 *@param key 待查找关键字
 *@return 找到的位置
 */
public static int recursionBinarySearch(int[] arr,int key,int low,int high){
	
	if(key < arr[low] || key > arr[high] || low > high){
		return -1;				
	}
	
	int middle = (low + high) / 2;			//初始中间位置
	if(arr[middle] > key){
		//比关键字大则关键字在左区域
		return recursionBinarySearch(arr, key, low, middle - 1);
	}else if(arr[middle] < key){
		//比关键字小则关键字在右区域
		return recursionBinarySearch(arr, key, middle + 1, high);
	}else {
		return middle;
	}	
}

public static int Search(int[] arr,int key,int low,int high) {
	//不正常的情况
	if(key <arr[low] || key >arr[high] || low>high) {
		return -1;
	}
	//定义中间位置
	int middle=(high-low)/2;
	//如果中间值大于key，那么值得位置在左侧
	if(middle>key) {
		return Search(arr,key,low,middle-1);
		//说明值得位置在右侧
	}else if(middle < key) {
		return Search(arr,key,middle + 1,high);
	}else {
		return middle;
	}
	
}

/**
 * 不使用递归的二分查找
 *title:commonBinarySearch
 *@param arr
 *@param key
 *@return 关键字位置
 */
public static int commonBinarySearch(int[] arr,int key){
	int low = 0;
	int high = arr.length - 1;
	int middle = 0;			//定义middle
	
	if(key < arr[low] || key > arr[high] || low > high){
		return -1;				
	}
	
	/*for(low <= high){
		middle = (low + high) / 2;
		if(arr[middle] > key){
			//比关键字大则关键字在左区域
			high = middle - 1;
		}else if(arr[middle] < key){
			//比关键字小则关键字在右区域
			low = middle + 1;
		}else{
			return middle;
		}
	}*/
	
	return -1;		//最后仍然没有找到，则返回-1
}
}
