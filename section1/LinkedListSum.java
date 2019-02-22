package section1;

import org.w3c.dom.css.ElementCSSInlineStyle;

public class LinkedListSum {
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2){	    
	      ListNode head=null;
	      int remainder=0;
          ListNode p;
	       while(l1!=null || l2!=null){	          
	           ListNode n=null;
	           int sum=0;	          
	    //if the two linked list have the same length of element
	           if(l1!=null&& l2!=null){
	             sum=l1.val + l2.val+remainder;
	               if(sum/10==0){
	                n= new ListNode(sum);
                      remainder=0;
                  }
	               else{
	                    n= new ListNode(sum%10);
	                   remainder=sum/10;
	               }
	             l1=l1.next;
	   	        l2=l2.next; 
	           }
	           else if(l1!=null && l2==null) {
	        	   sum=l1.val +remainder;
	               if(sum/10==0){
	               n= new ListNode(sum);
                       remainder=0;
                  }
	               else{
	                   n= new ListNode(sum%10);
	                   remainder=sum/10;
	               }
	               l1=l1.next;
	           }   
	           else if(l2!=null && l1==null) {
	        	   sum=l2.val+remainder;
	               if(sum/10==0){
	               n= new ListNode(sum);
                       remainder=0;
                  }
	               else{
	                  n= new ListNode(sum%10);
	                   remainder=sum/10;
	               }
	               l2=l2.next; 
	           }  	       
	               
	          //if head of the returned linked list is null the new node is inserted by head  
	               if(head==null)
	               head=n;
	           else{
                  p=head;
	    while(p.next!=null){  //if the head node of the returned linkedlist is not null, traverse to insert the  node
	                   p=p.next;
	               }
	               p.next=n;
	           }
	       } 
        if(remainder!=0){
	    	   p=head;
	   	    while(p.next!=null){  //if the head node of the returned linkedlist is not null, traverse to insert the      node
	   	                   p=p.next;
	   	               }
	   	               p.next=new ListNode(remainder);
	   	           } 
        
        
	       return head;       
	 }
}
class ListNode{
    int val;
   ListNode next;
    ListNode(int x) { val = x; }
}


