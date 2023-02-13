package com.masai;



public class LinkedListImpl {
	Node head;
	
	public LinkedListImpl() {
		this.head=null;
	}
	
	//Node class
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next = null;
		}
	}
	
	
	//print list
	public void prinList() {
		Node temp = head;
		if(temp==null) {
			System.out.println("list is empty");
			return;
		}
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	//1.add 
	public void add(int data) {
		Node node = new Node(data);
		Node curr;
		if(head==null) {
			head =node;
		}else {
			curr = this.head;
			while(curr.next!=null) {
				curr = curr.next;
			}
			curr.next = node;
		}
	}
	
	//add at beginning
	public void addBeg(int data) {
		Node temp = new Node(data);
		temp.next = head ;
		head = temp ; 
	}
	
	//add at tail
		public void addTail(int data) {
			Node temp = new Node(data);
			Node current = head ; 
			while(current.next!=null) {
				current =current.next;
			}
			current.next =temp;
		}
	
	// insert after particular	element
		public void  addAfterEle(int ele, int data) {
			Node temp = new Node(data);
			Node curr = head;
			while(curr.next!=null) {
				if(curr.data==ele) {
					Node temp1 = curr.next;
					curr.next=temp;
					temp.next=temp1;
				}
				curr =curr.next;
			}
		}
		
		
	//insert before element
		
		public void addBeforeEle(int ele,int data) {
			Node temp = new Node(data);
			Node curr= head;
			Node prev = null; 
			while(curr.data!=ele) {
				prev =curr;
				curr = curr.next;
			}
			
			prev.next=temp;
			temp.next=curr;
		}

	// delete from beginning
	
	public void deleteBeg(){
		Node temp = head.next;
		head.next = null;
		head=temp;
	}
		
	public static void main(String[] args) {
		LinkedListImpl list = new LinkedListImpl();
		list.add(10);
		list.add(20);
		list.add(30);
		// list.prinList();

		// list.addBeg(05);
		// list.prinList();

		// list.addTail(30);
		// list.prinList();

		// list.addAfterEle(10,15);
		// list.prinList();

		// list.addBeforeEle(20, 15);
		// list.addBeforeEle(30, 25);
		
		// list.deleteBeg();
		list.prinList();
	}

}
