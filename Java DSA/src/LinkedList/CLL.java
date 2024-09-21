package LinkedList;



public class CLL {
	private Node head;
	private Node tail;
	
   public CLL() {
		super();
		this.head = null;
		this.tail = null;
	}
   
   public void insert(int val) {
	   Node node=new Node(val);
	   if(head == null) {
		   head=node;
		   tail=node;
		   return;
	   }
	   tail.next=node;
	   node.next=head;
	   tail=node;
	   
   }
   public void display() {
       Node node = head;
       if (head != null) {
           do {
               System.out.print(node.value + " -> ");
               if (node.next != null) {
		    node = node.next;
		}
           } while (node != head);
       }
       System.out.println("HEAD");
   }
   public void delete(int val) {
	   Node node=head;
	   if(node == null) {
		   return;
	   }
	   if (head == tail){
           head = null;
           tail = null;
           return;
       }
	   if(node.value == val) {
		   head=head.next;
		   tail.next=head;
		   return;
	   }
	   do {
           Node n = node.next;
           if (n.value == val) {
               node.next = n.next;
               break;
           }
           node = node.next;
       } while (node != head);
	   
   }

private class Node{
	   int value;
	   Node next;
	   public Node(int value) {
			super();
			this.value = value;
		}
		public Node(int value, Node next) {
			super();
			this.value = value;
		
			this.next = next;
		}
   }
}
