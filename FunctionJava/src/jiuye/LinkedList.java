package jiuye;

public class LinkedList<E> {
	private Node head;
	private int size;
	// Node :�ڵ����˼��
	// prev ����һ��
	// next ����һ��
	private class Node{
		E data;
		Node prev;
		Node next;
		public Node(E e) {
			data=e;
		}
	
	}
	//�뼯����׷��Ԫ��
	public boolean add(E e) {
		if(head==null) {
			head=new Node(e);
			//����˫��ѭ����ϵ
			head.next=head;
			head.prev=head;
			
		}else {//�ڶ����Ժ�Ľڵ�
			Node last=head.prev;
			Node node=new Node(e);
			last.next=node;
			node.next=head;
			head.prev=node;
			node.prev=last;
			
		}
		
		size++;
		return true;
	}
	public int size() {
		return size;
	}
	public String toString() {
		//[]
		//[8,9,5,6,3]
		if(head==null) {
			return "[]";
		}		
		StringBuilder buf =new StringBuilder("[");
		buf.append(head.data);
		Node node=head.next;
		for(node!=head) {
			buf.append(",").append(node.data);
			node=node.next;
		
		}
		return buf.append("]").toString();
	}
	
	public boolean add(int index,E e) {
		if(index<0||index>size) {
			throw new IndexOutOfBoundsException("Խ��"+index);
		}
		if(index==size) {
			return add(e);
		}
		Node node = findByIndex(index);
		
		Node prev=node.prev;
		Node next=node;
		Node n=new Node(e);
		prev.next=n;
		n.next=next;
		next.prev=n;
		n.prev=prev;
		
		if(index==0) {
			n=node.next;
		}
		size++;
		return true;
	}

	private Node findByIndex(int index) {
		Node node=head;
		if(index<size/2) {
			node=head;
			for(int i=0;i<index;i++) {
				node=node.next;
			}
		}else {
			node=head.prev;
			for(int i=size-1;i>index;i--) {
				node=node.prev;
			}
		}
		return node;
	}
	
	public E remove(int index) {
		if(index<0|| index>size-1) {
			throw new IndexOutOfBoundsException("Խ�磺"+index);
		}
		if(size==1&& index==0) {
			E e=head.data;
			head=null;
			size=0;
			return e;
		}
		Node node=findByIndex(index);
		Node prev =node.prev;
		Node next=node.next;
		prev.next=next;
		node.next=null;
		node.prev=null;
	
		size--;
		return node.data;
	}
	
	public E get(int index) {
		if(index<0||index>size-1) {
			throw new IndexOutOfBoundsException("Խ�磡"+index);
		}
		return findByIndex(index).data;
	}
	
	
}