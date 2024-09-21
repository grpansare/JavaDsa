package LinkedList;

public class GetDecimalValue {
	 public int getDecimalValue(ListNode head) {
	        String binaryString="";
	        ListNode node=head;
	        while(node != null){
	            binaryString+=node.value;
	            node=node.next;

	        }
	        return Integer.parseInt(binaryString,2);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	}

}
