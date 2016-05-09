package org.study.collections;

class Entry {
	private int data;
	private Entry next;
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Entry getNext() {
		return next;
	}
	public void setNext(Entry next) {
		this.next = next;
	}
	
	
}

class CircularLinkedList {
	

	Entry head;
	int size;
	
	//WE WILL ADD THE NEW NODE AT THE HEAD AND WILL FLUSH OUT THE LAST NODE
	public void insert(Entry node) {
		if(head == null)
			head = node;
		else {
			node.setNext(head);
			head = node;
			if(this.getActualSize() >= size) {
				this.getSecondLastNode().setNext(head);
			}
			else
				this.getLastNode().setNext(head);
			
		}
	}
	
	//Actual number of elements in the link list
	public int getActualSize() {
		int count = 0;
		if(head == null)
			return 0;
		else {
			Entry temp = head;
			while(temp.getNext()!=null) {
				count++;
				temp = temp.getNext();
				if(temp == head)
					break;
			}
		}
		return count;
	}
	
	public Entry getLastNode() {
		Entry temp = head;
		while(temp.getNext()!=head)
			temp=temp.getNext();
		return temp;
	}
	
	public Entry getSecondLastNode() {
		Entry temp = head;
		while(temp.getNext().getNext()!=head )
			temp=temp.getNext();
		return temp;
	}
	
	public void traverseLinkList() {
		Entry temp = head;
		while(temp!= null) {
			System.out.println(temp.getData());
			temp = temp.getNext();
			if(temp == head)
				break;
		}
	}

	//Getters and setters
	public Entry getHead() {
		return head;
	}

	public void setHead(Entry head) {
		this.head = head;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	
}

public class CircularLinkedListTest {
	public static void main(String[] args) {
		CircularLinkedList cll = new CircularLinkedList();
		cll.setSize(3);
		Entry e1 = new Entry();
		e1.setData(10);
		cll.insert(e1);
		Entry e2 = new Entry();
		e2.setData(20);
		cll.insert(e2);
		Entry e3 = new Entry();
		e3.setData(30);
		cll.insert(e3);
		Entry e4 = new Entry();
		e4.setData(40);
		cll.insert(e4);
		cll.traverseLinkList();
	}
}

