package test;

/**
 * 链表的操作
 * @author royeyu
 *
 */

class Node{
	Node next = null;
	int data;
	public Node(int data){
		this.data = data;
	}
}
public class MyLinkedList {

//	链表的头部
   Node head = null;
   
   public void addNode(int d){
	   Node newNode = new Node(d);
	   
	   if(head == null){
		   head = newNode;
		   return;
	   }
	   
	   Node temp = head;
	   
	   while(temp.next != null){
		   temp = temp.next;
	   }
	   
	   //找到了最终的temp;
	   
	   temp.next = newNode;
	   
   }
   public boolean deleteNode(int index){
	   
//	   判断删除的位置是否合理？
	   
	   if(index == 1){
		   head = head.next;
		   return true;
	   }
	   //其他
	   int i = 1;
	   
	   Node preNode = head;
	   Node curNode = preNode.next;
	   while(curNode != null){
		   //向下遍历
		   if(i == index){
			   preNode.next = curNode.next;
			   return true;
		   }
		   preNode = curNode;
		   curNode = curNode.next;
		   i++;
	   }
	   
	   return true;
	   
   }
    public int length(){
    	int length = 0;
    	Node temp = head;
    	while(temp != null){
    		length ++;
    		temp = temp.next;
    	}
    	return length;
    }
    
    public Node orderList(){
    	
    	Node curNode = head;
    	Node nextNode = null;
    	while(curNode != null){
    		
    		nextNode = curNode.next;
    		while(nextNode != null){
    			
    		   if(curNode.data > nextNode.data){
    			   //交换
    			   int temp = curNode.data;
    			   curNode.data = nextNode.data;
    			   nextNode.data = temp;
    		   }
    		   
    		   nextNode = nextNode.next;
    			
    		}
    		curNode = curNode.next;
    		
    	}
    	return head;
    	
    }
    
    public void deleteDu(Node head){
    	Node p = head;
    	while(p!=null){
    		Node q = p;
    		// 也就是找出当前的节点；
    		while(q.next != null){
    			
    			if(q.data == q.next.data){
    				q.next = q.next.next;
    			}else{
    				q = q.next;
    			}
    		}
    		p = p.next;
    	}
    }
    
    public  void printList(){
    	Node temp = head;
    	while(temp != null){
    		System.out.println(temp.data);
    		temp = temp.next;
    	}
    }
    
    //链表的翻转
//    public void reverse()
    
  public static void main(String[] args) {

	  MyLinkedList my = new MyLinkedList();
	  my.addNode(1);
	  my.addNode(2);
	  my.addNode(3);
	  my.addNode(4);
	  
	  my.printList();
	  
	  
 }
	
}
