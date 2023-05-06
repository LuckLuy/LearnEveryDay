package jiuye;

public class TreeSet<E extends Comparable<E>> {
	private Node root;
	private class Node{
		E data;
		Node parent;
		Node left;
		Node right;
		
		public Node(E data) {
			super();
			this.data = data;
		}

		public boolean addChild(E e) {
			int  val=e.compareTo(data);//0��ȣ�����e�󣬸���eС��
			
			//�뵱ǰ������ȣ������ȣ�����false�����ʧ��
			if(val==0) {
				return false;
			}
			//���e �ȵ�ǰ����С������ӵ���ࡣ
			if(val<0) {
				if(left==null) {
					left=new Node(e);//�������½ڵ㡣
					left.parent=this;
					return true;
				}else {
					//����ݹ���ӽڵ�
					return left.addChild(e);
				}
			}else {
			//���e �ȵ�ǰ���ݴ�����ӵ��Ҳࡣ
				if(right==null) {
					right=new Node(e);
					right.parent=this;
					return true;
				}else {
					return right.addChild(e);
				}
				
			}
		}
		public String toString() {
			//�����������+�� + ��
			StringBuilder buf=new StringBuilder();
			if(left!=null) {
				buf.append(left.toString());
			}
			buf.append(data).append(",");
			if(right!=null) {
				buf.append(right.toString());
			}
			return buf.toString();
		}
	}
	public boolean add(E e) {
		if(root==null) {
			root=new Node(e);
			return true;
		}
		return root.addChild(e);
	}

	//��������㷨
	public String toString() {
		//3 �������ʽ
		// ����������� left right
		
		// ���������left �� right �������������
		
		// ���������left right ��
		if(root==null) {
			return "[]";
		}
		return "["+root+"]";
		
	}
	
}
