package LinkedList;
class removeNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
      
        int length=getLength(head);
        if(n==length){
            head=head.next;
            return head;
        }
        ListNode prev=getPrevNode(head,length-n);
        prev.next=prev.next.next;
        return head;
    }
    public int getLength(ListNode head){
        ListNode temp=head;
        int length=1;

        while(temp.next != null){
            temp=temp.next;
            length++;
        }
        return length;
    }
    public ListNode getPrevNode(ListNode head,int n){
        ListNode temp=head;
        for(int i=0;i<n-1;i++){
            temp=temp.next;
        }
        return temp;
    }
}