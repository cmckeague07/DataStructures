package binaryTree;

public class BinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Node node = new Node(10);
			node.insert(9);
			node.insert(4);
			node.insert(6);
			node.printInOrder();
			
			System.out.println(node.contains(6));
	}

}

class Node{
	Node left, right;
	int data;
	public Node(int data) {
		this.data=data;
	}
	public void insert(int value) {
		//left node is always smaller than the right
		if(value<=data) {
			if(left==null) {
				left = new Node(value);
			}else {
				left.insert(value);
			}
			
		}else {
			if(right == null) {
				right = new Node(value);
			}else {
				right.insert(value);
			}
		}
	}
	
	public boolean contains(int value) {
		if(value == data) {
			return true;
		}else if(value < data) {
			if(left == null) {
				return false;
			}else {
				return left.contains(value);
			}
		}else {
			if(right == null) {
				return false;
			}else {
				return right.contains(value);
			}
		}
	}
	
	public void printInOrder() {
		if(left != null) {
			left.printInOrder();
		}
		System.out.println(data);
		if(right != null) {
			right.printInOrder();
		}
	}
}