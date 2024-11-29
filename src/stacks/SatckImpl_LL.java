package stacks;

public class SatckImpl_LL {

	public static Node head;
	
	class Node{
		
		int data;
		Node next;
		
		Node(int data){
			
			this.data = data;
			this.next = null;
		}
		
	}
	
	public boolean isEmpty() {
		
		if(head == null) {
			return true;
		}else {
			return false;
		}
	}
	
	public void push(int data) {
		
		Node node = new Node(data);
		
		if(isEmpty()) {
			head = node;
			return;
		}
		
		 node.next = head;
		 head = node;
	}
	
	public int pop() {
		
		if(isEmpty()) {
			return -1;
		}
		
		int top = head.data;
		head = head.next;
		return top;
		
	}
	
	public int peek() {
		
		if(isEmpty()) {
			return -1;
		}
		
		int peek = head.data;
		return peek;
	}
	
	public void display() {
		
		if(isEmpty()) {
			System.out.println("Nothing to display");
		}
		
		while(!isEmpty()) {
			System.out.println(peek());
			pop();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SatckImpl_LL l = new SatckImpl_LL();
		l.push(10);
		l.push(20);
		l.push(30);
		l.push(40);
		l.push(50);
		
		l.display();
	}

}
