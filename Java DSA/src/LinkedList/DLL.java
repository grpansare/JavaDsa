package LinkedList;



public class DLL {
	
	Node head;
	int size;
	public DLL() {
		this.size=0;
	}
	public void insertFirst(int value) {
		Node node =new Node(value);
		node.next=head;
		node.prev=null;
		if(head != null) {
			head.prev=node;
		}
		head=node;
		size++;
		
	}
	public void display() {
		Node node=head;
		Node last=head;
		while(node != null) {
			System.out.print(node.value+"-> ");
			last=node;
			node=node.next;
		}
		System.out.println("END");
		while(last != null) {
			System.out.print(last.value+"-> ");
		
			last=last.prev;
		}
		System.out.println("END");
		
	}
	
	public void insertLast(int val) {
		Node node=new Node(val);
		node.next=null;
		if(head == null) {
			node.prev=null;
		
			head=node;
		}
		Node last=head;
	   while(last.next != null) {
		   last=last.next;
	   }
	   last.next=node;
	   node.prev=last;
	   
	   size++;
	}
	
	public void insert(int after,int value) {
		Node p=find(after);
		if(p == null) {
			System.out.println("does not exist");
		}
		Node node=new Node(value);
		node.next=p.next;
		p.next=node;
		node.prev=p;
		if(node.next != null) {
			node.next.prev=node;
		}
		size++;
		
	}
	
	public int deleteFirst() {
		int value=head.value;
		head=head.next;
		if(head != null) {
		head.prev=null;
		
		}
		return value;
		
	}
	public int deleteLast() {
		if(size<=1) {
    		return deleteFirst();
    	}
    	Node secondLast=get(size-2);
    	int value=secondLast.next.value;
    	
    	secondLast.next=null;
    	
    	return value;
		
	}
	
	public int delete(int ind) {
		if(ind==0) {
			return deleteFirst();
		}
		if(ind == size-1) {
			return deleteLast();
		}
		Node p=get(ind-1);
		Node n=p.next.next;
		int val=p.next.value;
		p.next=n;
		if(n != null) {
			n.prev=p;
		}
		return val;
	}
	public Node get(int ind) {
		Node node=head;
		for(int i=0;i<ind;i++) {
			node=node.next;
		}
		return node;
	}
	public Node find(int after) {
		Node node=head;
		while(node != null) {
			if(node.value == after) {
				return node;
			}
			node=node.next;
		}
		return null;
	}
   private class Node{
	   int value;
	   Node prev;
	   Node next;
	public Node(int value) {
		super();
		this.value = value;
	}
	public Node(int value, Node prev, Node next) {
		super();
		this.value = value;
		this.prev = prev;
		this.next = next;
	}
	
	
   }
   public static void main(String[] args) {
	DLL list=new DLL();
	list.insertFirst(10);
	list.insertFirst(100);
	list.insertFirst(2000);
	list.insertLast(3);
	list.insert(10, 30);
	list.display();
//	list.deleteFirst();
//	list.deleteLast();
	list.delete(2);
	list.display();
}
}
