package stacks;

import java.util.ArrayList;

public class StackImpl_AL {

	static ArrayList<Integer> ar = new ArrayList<Integer>();
	
	public boolean isEmpty() {
		
		if(ar.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
	public void push(int data) {
		
		ar.add(data);
	}
	
	public int pop() {
		
		if(isEmpty()) {
		return -1;	
		}
		
		int top = ar.get(ar.size()-1);
		ar.remove(ar.size()-1);
		return top;
		
	}
	
	public int peek() {
		
		if(isEmpty()) {
			return -1;	
			}
			
		int peek = ar.get(ar.size()-1);
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

		StackImpl_AL s = new StackImpl_AL();
		s.push(60);
		s.push(70);
		s.push(80);
		s.push(90);
		s.push(100);
		
		s.display();
		
	}

}
