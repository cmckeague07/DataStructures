package LinkedList;

public class LinkedList {

	Node head;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.append(48);
		ll.append(54);
		ll.append(69);
		
		
	}
	
	public void append(int data) {
		
		if(head == null) {
			head = new Node(data);
			return;
		}
		//starting point
		Node current = head;
		while(current.next != null) {
			current = current.next;
		}
		current.next = new Node(data);
		System.out.println(current.data);
	}
	

}

 class Node{
	 Node next;
	 int data;
	 public Node(int data) {
		 this.data=data;
	 }
}