package suanfa_fuxi;

import java.util.HashSet;
import java.util.Set;

/**
 *    1~ 100 ֮�����
 */
public class suijishu {
public static void main(String[] args) {
	Set<Integer> s=new HashSet();
	//������ﶨ�� д��һ����ֵ ����˵100��
	 //������ֵ��100��ѭ���ͻ���ֹ��������ɵ������޷���֤��
	for(int i=0;;i++) {
		s.add(1+(int)(Math.random()*100));
		if(s.size() ==100) {
			break;
		}
	}
	for(Integer i:s) {
		System.out.print(i+",");
	}
	System.out.println();
	System.out.println("�����һ����"+ s.size());
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
