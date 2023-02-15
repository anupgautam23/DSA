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

	// delete from last
	
	public void deleteAtTail(){
		
		Node curr = head;
		Node prev = null ;
		while(curr.next!=null){
			prev  = curr;
			curr= curr.next;
		}
		prev.next = null;
		
	}
	
	//delete particular element

	public void deleteParticular(int ele){
		Node prev = null; 
		Node curr = head;
		while(curr.data!=ele){
			prev=curr;
			curr=curr.next;
		}
		if(prev==null){
			head =curr.next;
			curr.next=null;
		}else{
		prev.next =curr.next;
		}
	}

	// delete before particular element
	public void deleteBeforeEle(int ele){
		Node pprev= null;
		Node prev = null ; 
		Node curr = head;
		
		// while(curr.data!=ele){
		// 	pprev =prev;
		// 	prev=curr;
		// 	curr=curr.next;
		// }
		// if(pprev==null){
		// 	head=curr;
		// 	prev.next=null;
		// }else{
		// 	if(prev==null){

		// 	}
		// }

	}
	public static void main(String[] args) {
		LinkedListImpl list = new LinkedListImpl();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);

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


		// list.deleteAtTail();
		// list.deleteParticular(20);
		// list.prinList();
		list.deleteParticular(20);
		list.deleteParticular(10);
		list.deleteParticular(30);
		list.prinList();
	}

}
