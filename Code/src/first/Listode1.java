package first;
import java.util.List;

public class Listode1 {
	
public static void main(String[] args) {
	Listode1 l1=new Listode1();
		Solution sol=	l1.new Solution();
		ListNode l11=new ListNode();
		l11.val=2;
		
		ListNode l12=new ListNode();
		l12.val=3;
		l11.next=l12;
				
		ListNode l13=new ListNode();
		l13.val=3;
		l12.next=l13;
		
		ListNode l14=new ListNode();
		l14.val=2;
		l13.next=l14;
		
		
		ListNode l15=new ListNode();
		l15.val=2;
		
		ListNode l16=new ListNode();
		l16.val=2;
		l15.next=l16;
		
		ListNode l17=new ListNode();
		l17.val=2;
		l16.next=l17;
		
		ListNode list=sol.addTwoNumbers(l11, l15);
		System.out.println(list);
		
	}
	
	class Solution {
	    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        
	    int[] val1=	getValue(l1);
	    System.out.println(val1);
	    int[] val2=getValue(l2);
	    System.out.println(val2);
	    int length=0;
	    if(val1.length>val2.length)
	    {
	    	length=val1.length;
	    }
	    
	    
	   
	    
			return l2;
	       
	    }

		private int[] getValue(ListNode l1) {
			int value=0;
			int i=0;
			int arr[] = null;
			 while(null !=l1)
		        {
				 
		          value=  (int) (value*10 + l1.val);
		          l1=l1.next;
		          arr[i]=value;
		          i++;
		          
		        }
			return arr;
		        
			
		}
	    
	    
	}

}
