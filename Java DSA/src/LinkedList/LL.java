package LinkedList;

import LinkedList.MergeSort.ListNode;

public class LL {
     
	
	private Node head;
	private Node tail;
	private int size;
	
	public LL() {
		super();
		this.size=0;
	}
    public void insertFirst(int n) {
    	Node node=new Node(n);
    	node.next=head;
    	head=node;
    	if(tail == null) {
    		tail=head;
    	}
    	size++;
    }
    
    public void insertLast(int n) {
    	if(tail == null) {
    		insertFirst(n);
    		return;
    	}
    	Node node=new Node(n);
    	tail.next=node;
    	tail=node;
    	size++;
    	
    }
    public void insertRec(int val,int index) {
    	head=insertRec(val,index,head);
    }
    
    private Node insertRec(int val,int index,Node node) {
    	if(index == 0) {
    		Node temp =new Node(val,node);
    		size++;
    		return temp;
    	}
    	node.next=insertRec(val,index-1,node.next);
    	return node;
    }
    public void insert(int value,int index) {
    	if(index == 0) {
    		insertFirst(value);
    		return;
    	}
    	if(index == size) {
    		insertLast(value);
    	}
    	Node temp=head;
    	for(int i=1;i<index;i++) {
    		temp=temp.next;
    	}
    	Node node=new Node(value,temp.next);
    	temp.next=node;
    	size++;
    }
    public int deleteFirst() {
    	int val=head.value;
    	head=head.next;
    	if(head == null) {
    		tail=null;
    	}
    	size--;
    	return val;
    }
    public int deleteLast() {
    	if(size<=1) {
    		return deleteFirst();
    	}
    	Node secondLast=get(size-2);
    	int value=tail.value;
    	tail=secondLast;
    	tail.next=null;
    	return value;
    	
    }
    public int delete(int index) {
    	if(index == 0) {
    		return deleteFirst();
    	}
    	if(index == size-1) {
    		return deleteLast();
    	}
    	Node prev=get(index-1);
    	int val=prev.next.value;
    	prev.next=prev.next.next;
    	return val;
    }
    
    public Node find(int val) {
    	Node node=head;
    	while(node != null) {
    		if(node.value == val) {
    			return node;
    		}
    		node=node.next;
    	}
    	return null;
    }
    public Node get(int index) {
    	Node node=head;
    	for(int i=0;i<index;i++) {
    		node=node.next;
    	}
    	return node;
    }
    public void display() {
    	Node temp=head;
    	while(temp != null) {
    		System.out.print(temp.value+" ->");
    		temp=temp.next;
    	}
    	
    	System.out.print("END");
    }
	private class Node{
		private int value;
		private Node next;
		public Node(int value) {
			super();
			this.value = value;
		}
		public Node(int value, Node next) {
			super();
			this.value = value;
			this.next = next;
		}
		@Override
		public String toString() {
			return "Node [value=" + value + ", next=" + next + "]";
		}
		
		
	}
	
	
	
	// Questions 
	
	public void duplicates() {
		Node node=head;
		while(node.next != null) {
			if(node.value == node.next.value) {
				node.next=node.next.next;
				size--;
			}
			else {
				node=node.next;
			}
		}
		tail=node;
		tail.next=null;
	}
	
	// merge
	public static LL merge(LL first,LL second) {
		Node f=first.head;
		Node s=second.head;
		LL ans=new LL();
		while(f != null && s != null) {
			if(f.value < s.value) {
				ans.insertLast(f.value);
				f=f.next;
			}else {
				ans.insertLast(s.value);
				s=s.next;
			}
		}
		while(f != null) {
			ans.insertLast(f.value);
			f=f.next;
		}
		while(s != null) {
			ans.insertLast(s.value);
			s=s.next;
		}
		return ans;
		
	}
	
	//bubble sort
	 public void bubbleSort() {
	        bubbleSort(size - 1, 0);
	    }

	    private void bubbleSort(int row, int col) {
	        if (row == 0) {
	            return;
	        }

	        if (col < row) {
	            Node first = get(col);
	            Node second = get(col + 1);

	            if (first.value > second.value) {
	                // swap
	                if (first == head) {
	                    head = second;
	                    first.next = second.next;
	                    second.next = first;
	                } else if (second == tail) {
	                    Node prev = get(col - 1);
	                    prev.next = second;
	                    tail = first;
	                    first.next = null;
	                    second.next = tail;
	                } else {
	                    Node prev = get(col - 1);
	                    prev.next = second;
	                    first.next = second.next;
	                    second.next = first;
	                }
	            }
	            bubbleSort(row, col + 1);
	        } else {
	            bubbleSort(row - 1, 0);
	        }
	    }
	    
	    //reverse 
	    public void reverse() {
	    	Node prev=null;
	    	Node present =head;
	    	Node next=head.next;
	    	while(present != null) {
	    		present.next=prev;
	    		prev=present;
	    		present=next;
	    		if(next != null) {
	    			next=next.next;
	    			
	    		}
	    		
	    	}
	    	head=prev;
//	    	return prev;
	    }
	    //middleNode
	    public Node middleNode(Node head) {
	        Node s = head;
	        Node f = head;

	        while (f != null && f.next != null) {
	            s = s.next;
	            f = f.next.next;
	        }
	        return s;
	    }
	    // https://leetcode.com/problems/reverse-linked-list/submissions/
	    // google, apple, amazon, microsoft
	    public Node reverseList(Node head) {
	        if (head == null) {
	            return head;
	        }
	        Node prev = null;
	        Node present = head;
	        Node next = present.next;

	        while (present != null) {
	            present.next = prev;
	            prev = present;
	            present = next;
	            if (next != null) {
	                next = next.next;
	            }
	        }
	        return prev;
	    }
	    
	    // recursion reverse
	    private void reverse(Node node) {
	        if (node == tail) {
	            head = tail;
	            return;
	        }
	        reverse(node.next);
	        tail.next = node;
	        tail = node;
	        tail.next = null;
	    }
	    
	    //reverse 2
	    public Node reverseBetween(Node head, int left, int right) {
	        if(left == right) {
	        	return head;
	        }
	        //skip the left-1 nodes
	        
	        Node current=head;
	        Node prev=null;
	        for(int i=0; current != null && i<left-1;i++) {
	        	prev=current;
	        	current=current.next;
	        }
	        Node last=prev;
	        Node newEnd=current;
	        Node next=current.next;
	        //reverse between left and right
	        for(int i=0;current != null &&i<(right-left)+1;i++) {
	        	current.next=prev;
	        	prev=current;
	        	current=next;
	        	if(next != null) {
	        		next=next.next;
	        		
	        	}
	        	
	        	
	        	
	        }
	        if(last != null) {
	        	last.next=prev;
	        	
	        }
	        else {
	        	head=prev;
	        }
	        newEnd.next=current;
	        return head;
	    }
	    
	    //isPalindrome
	    public boolean isPalindrome(Node head) {
	         
	    	Node mid=middleNode(head);
	    	Node headSecond=reverseList(mid);
	    	Node reverseHead=headSecond;
	    	  // compare both the halves
	        while (head != null && headSecond != null) {
	            if (head.value != headSecond.value) {
	                break;
	            }
	            head = head.next;
	            headSecond = headSecond.next;
	        }
	        reverseList(reverseHead);

	        return head == null || headSecond == null;
	    	
	    }
	   Node getMid() {
		   Node fast=head;
	        Node midPrev = null;
	        while (fast != null && fast.next != null) {
	            midPrev = (midPrev == null) ? head : midPrev.next;
	            fast = fast.next.next;
	        }
	        Node mid = midPrev.next;
	        midPrev.next = null;
	        System.out.println(midPrev);
	        return mid;
	    }
	    
	    //reorder list
	    public void reorderList(Node head) {
	        if(head == null || head.next==null) {
	        	return;
	        }
	        Node mid=middleNode(head);
	        Node hs=reverseList(mid);
	        Node hf=head;
	        while(hf != null && hs != null) {
	        	Node temp=hf.next;
	        	hf.next=hs;
	        	hf=temp;
	        	
	        	
	        	temp=hs.next;
	        	hs.next=hf;
	        	hs=temp;
	        	
	        }
	        if (hf != null) {
	            hf.next = null;
	        }
	    }
	    // google, amazon, facebook, microsoft: https://leetcode.com/problems/reverse-nodes-in-k-group/
	    public ListNode reverseKGroup(ListNode head, int k) {
	        if (k <= 1 || head == null) {
	            return head;
	        }

	        ListNode current = head;
	        ListNode prev = null;

			int length = getLength(head);
			int count = length / k;
	        while (count > 0) {
	            ListNode last = prev;
	            ListNode newEnd = current;

	            ListNode next = current.next;
	            for (int i = 0; current != null && i < k; i++) {
	                current.next = prev;
	                prev = current;
	                current = next;
	                if (next != null) {
	                    next = next.next;
	                }
	            }

	            if (last != null) {
	                last.next = prev;
	            } else {
	                head = prev;
	            }

	            newEnd.next = current;

	            prev = newEnd;
				count--;
	        }
	        return head;
	    }
	    public int getLength(ListNode head) {
			ListNode node = head;
			int length = 0;
			while (node != null) {
				length++;
				node = node.next;
			}
			return length;
		}
	    
	 // https://www.geeksforgeeks.org/reverse-alternate-k-nodes-in-a-singly-linked-list/
	    public ListNode reverseAlternateKGroup(ListNode head, int k) {
	        if (k <= 1 || head == null) {
	            return head;
	        }

	        // skip the first left-1 nodes
	        ListNode current = head;
	        ListNode prev = null;

	        while (current != null) {
	            ListNode last = prev;
	            ListNode newEnd = current;

	            // reverse between left and right
	            ListNode next = current.next;
	            for (int i = 0; current != null && i < k; i++) {
	                current.next = prev;
	                prev = current;
	                current = next;
	                if (next != null) {
	                    next = next.next;
	                }
	            }

	            if (last != null) {
	                last.next = prev;
	            } else {
	                head = prev;
	            }

	            newEnd.next = current;

	            // skip the k nodes
	            for (int i = 0; current != null && i < k; i++) {
	                prev = current;
	                current = current.next;
	            }
	        }
	        return head;
	    }
	    
	    
	    public ListNode rotateRight(ListNode head, int k) {
	        if (k <= 0 || head == null || head.next == null) {
	            return head;
	        }

	        ListNode last = head;
	        int length = 1;
	        while (last.next != null) {
	            last = last.next;
	            length++;
	        }

	        last.next = head;
	        int rotations = k % length;
	        int skip = length - rotations;
	        ListNode newLast = head;
	        for (int i = 0; i < skip - 1; i++) {
	            newLast = newLast.next;
	        }
	        head = newLast.next;
	        newLast.next = null;

	        return head;
	    }
	    
	    
	    
	    
	    
	    
	public static void main(String[] args) {
//		LL l1=new LL();
//		l1.insertFirst(1);
//         l1.insertFirst(10);
//         l1.insertLast(11);
//         l1.insertLast(11);
//         l1.insert(100, 2);
//         l1.insertRec(200, 3);
//         l1.display();
////         System.out.println(l1.deleteFirst());
////         System.out.println(l1.deleteLast());
//         
//         l1.duplicates();
//         l1.display();
////         System.out.println(l1.find(10));
		LL first=new LL();
		first.insertLast(1);
		first.insertLast(3);
		first.insertLast(5);
		
//		LL second=new LL();
//		second.insertLast(1);
//		second.insertLast(2);
//		second.insertLast(3);
//		second.insertLast(5);
//		second.insertLast(9);
//		second.insertLast(14);
////		LL ans=LL.merge(first, second);
		
		LL second=new LL();
		second.insertLast(10);
		second.insertLast(5);
		second.insertLast(11);
		second.insertLast(3);
		second.insertLast(4);
		second.insertLast(14);
		
//		second.bubbleSort();
		second.display();
		second.getMid();
	second.display();
		
	}

}
