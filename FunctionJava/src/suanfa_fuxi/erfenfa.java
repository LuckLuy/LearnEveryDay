package suanfa_fuxi;

public class erfenfa {
public static void main(String[] args) {
	
	/**
	 * ���ֲ���
	 *title:commonBinarySearch
	 *@param arr ���������
	 *@param key ��Ҫ���ҵ�λ�á�
	 *@return �ؼ���λ��
	 */
	int[] arr = {1,3,5,7,9,11};
	int key = 7;
	int high=arr.length - 1;
	//���ǵݹ��㷨����ֵ��ʽ
	// ��ȡ�±��λ��
	int position = recursionBinarySearch(arr,key,0,high);
	//int position = Search(arr,key,0,high);
	//����ѭ������ֵ�÷�ʽ��
	//int position = commonBinarySearch(arr, key);

    if(position == -1){
		System.out.println("���ҵ���"+key+",������û�и�����");
	}else{
		System.out.println("���ҵ���"+key+",�ҵ�λ��Ϊ��"+position);
	}
}

// ʹ�õݹ�ʵ�ֵĶ��ֲ���
/**
 * ʹ�õݹ�Ķ��ֲ���
 *title:recursionBinarySearch
 *@param arr ��������
 *@param key �����ҹؼ���
 *@return �ҵ���λ��
 */
public static int recursionBinarySearch(int[] arr,int key,int low,int high){
	
	if(key < arr[low] || key > arr[high] || low > high){
		return -1;				
	}
	
	int middle = (low + high) / 2;			//��ʼ�м�λ��
	if(arr[middle] > key){
		//�ȹؼ��ִ���ؼ�����������
		return recursionBinarySearch(arr, key, low, middle - 1);
	}else if(arr[middle] < key){
		//�ȹؼ���С��ؼ�����������
		return recursionBinarySearch(arr, key, middle + 1, high);
	}else {
		return middle;
	}	
}

public static int Search(int[] arr,int key,int low,int high) {
	//�����������
	if(key <arr[low] || key >arr[high] || low>high) {
		return -1;
	}
	//�����м�λ��
	int middle=(high-low)/2;
	//����м�ֵ����key����ôֵ��λ�������
	if(middle>key) {
		return Search(arr,key,low,middle-1);
		//˵��ֵ��λ�����Ҳ�
	}else if(middle < key) {
		return Search(arr,key,middle + 1,high);
	}else {
		return middle;
	}
	
}

/**
 * ��ʹ�õݹ�Ķ��ֲ���
 *title:commonBinarySearch
 *@param arr
 *@param key
 *@return �ؼ���λ��
 */
public static int commonBinarySearch(int[] arr,int key){
	int low = 0;
	int high = arr.length - 1;
	int middle = 0;			//����middle
	
	if(key < arr[low] || key > arr[high] || low > high){
		return -1;				
	}
	
	/*for(low <= high){
		middle = (low + high) / 2;
		if(arr[middle] > key){
			//�ȹؼ��ִ���ؼ�����������
			high = middle - 1;
		}else if(arr[middle] < key){
			//�ȹؼ���С��ؼ�����������
			low = middle + 1;
		}else{
			return middle;
		}
	}*/
	
	return -1;		//�����Ȼû���ҵ����򷵻�-1
}
}
