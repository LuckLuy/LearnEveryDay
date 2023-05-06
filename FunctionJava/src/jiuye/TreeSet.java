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
			int  val=e.compareTo(data);//0相等，整数e大，负数e小。
			
			//与当前数据相比，如果相等，返回false，添加失败
			if(val==0) {
				return false;
			}
			//如果e 比当前数据小，则添加到左侧。
			if(val<0) {
				if(left==null) {
					left=new Node(e);//左侧添加新节点。
					left.parent=this;
					return true;
				}else {
					//向左递归添加节点
					return left.addChild(e);
				}
			}else {
			//如果e 比当前数据大，则添加到右侧。
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
			//中序遍历：左—+中 + 右
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

	//遍历输出算法
	public String toString() {
		//3 中输出方式
		// 先序输出：中 left right
		
		// 中序输出：left 中 right 输出的是排序结果
		
		// 后序输出：left right 中
		if(root==null) {
			return "[]";
		}
		return "["+root+"]";
		
	}
	
}
