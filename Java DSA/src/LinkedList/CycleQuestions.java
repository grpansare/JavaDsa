package LinkedList;
public class CycleQuestions {
    public boolean hasCycle(ListNode head) {
      ListNode fast=head;
      ListNode slow=head;
      while(fast != null && fast.next != null){
        fast=fast.next.next;
        slow=slow.next;
        if(fast == slow){
            return true;
        }
      }  
      return false;
    }
    
    //length of  cylce
    public int lengthofCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast != null && fast.next != null){
          fast=fast.next.next;
          slow=slow.next;
          if(fast == slow){
        	  ListNode temp=slow;
        	  int length=0;
        	  do {
        		  temp=temp.next;
        		  length++;
        	  }while(temp != slow);
        	  
              return length;
          }
        }  
        return 0;
      }
    
  public ListNode detectCycle(ListNode head) {
        int length=0;
        ListNode fast=head;
        ListNode slow=head;
        while(fast != null && fast.next != null){
          fast=fast.next.next;
          slow=slow.next;
          if(fast == slow){
             length=lengthofCycle(slow);
             break;
          }
        } 
        if(length == 0) {
        	return null;
        }
        //find the start node
        ListNode f=head;
        ListNode s=head;
        while(length>0) {
        	s=s.next;
        	length--;
        }
        while(f != s) {
        	f=f.next;
        	s=s.next;
        	
        }
        return f;
        
        
    }
  
  
  //hapyy
  public boolean isHappy(int n) {
	  
	  int slow=n;
	  int fast=n;
	  do {
		  slow=findSquare(slow);
		  fast=findSquare(findSquare(fast));
		  
	  }while(slow != fast);
	  if(slow==1) {
		  return true;
	  }
	  return false;
      
  }
  private int findSquare(int n) {
	  int ans=0;
	  while(n>0) {
		  int rem=n%10;
		  ans+=rem*rem;
		  n/=10;
	  }
	  return ans;
  }
   
  public ListNode middleNode(ListNode head) {
	  ListNode slow=head;
	  ListNode fast=head;
	  while(fast != null && fast.next != null) {
		  slow=slow.next;
		  fast=fast.next.next;
	  }
	  return slow;
  }
}


