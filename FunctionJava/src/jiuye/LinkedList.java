package jiuye;

public class LinkedList<E> {
	private Node head;
	private int size;
	// Node :节点的意思。
	// prev ：上一个
	// next ：下一个
	private class Node{
		E data;
		Node prev;
		Node next;
		public Node(E e) {
			data=e;
		}
	
	}
	//想集合中追加元素
	public boolean add(E e) {
		if(head==null) {
			head=new Node(e);
			//建立双向循环关系
			head.next=head;
			head.prev=head;
			
		}else {//第二个以后的节点
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
			throw new IndexOutOfBoundsException("越界"+index);
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
			throw new IndexOutOfBoundsException("越界："+index);
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
			throw new IndexOutOfBoundsException("越界！"+index);
		}
		return findByIndex(index).data;
	}
	
	
}