package LinkedList;

public class MergeSort {
	   public ListNode sortList(ListNode head) {
	        if (head == null || head.next == null) {
	            return head;
	        }

	        ListNode mid = getMid(head);
	        System.out.println(mid.value);
	        ListNode left = sortList(head);
	        ListNode right = sortList(mid);

	        return merge(left, right);
	    }
	
	 ListNode merge(ListNode list1, ListNode list2) {
	        ListNode dummyHead = new ListNode();
	        ListNode tail = dummyHead;
	        while (list1 != null && list2 != null) {
	            if (list1.value < list2.value) {
	                tail.next = list1;
	                list1 = list1.next;
	                tail = tail.next;
	            } else {
	                tail.next = list2;
	                list2 = list2.next;
	                tail = tail.next;
	            }
	        }
	        tail.next = (list1 != null) ? list1 : list2;
	        return dummyHead.next;
	    }
	 ListNode getMid(ListNode head) {
	        ListNode midPrev = null;
	        while (head != null && head.next != null) {
	            midPrev = (midPrev == null) ? head : midPrev.next;
	            head = head.next.next;
	        }
	        ListNode mid = midPrev.next;
	        midPrev.next = null;
	        
	        return mid;
	    }
	 public class ListNode {
			private int value;
			 ListNode next;
			 
			public ListNode() {
				super();
				// TODO Auto-generated constructor stub
			}
			public ListNode(int value) {
				super();
				this.value = value;
			}
			public ListNode(int value, ListNode next) {
				super();
				this.value = value;
				this.next = next;
			}
			@Override
			public String toString() {
				return "ListNode [value=" + value + ", next=" + next + "]";
			}
			
		}
	 public static void main(String[] args) {
		
	}

}
