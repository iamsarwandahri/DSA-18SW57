class Node{
	public int data;
	public Node next;

	public Node(int data){
	this.data = data;
	}
    public Node(int data,Node next){
    this.data = data;
    this.next = next;
    }


}
public class LinkedListDemo{
    
    public static void main(String args[]){

    Node start = new Node(10);
	start.next = new Node(20);
	start.next.next = new Node(30);
	start.next.next.next = new Node(40);
	start.next.next.next.next = new Node(50);
	printList(start);
}


	public static void printList(Node start){
    Node s=start
    for(; p!=null; p=p.next){     
     System.out.println(s.data+" ");
}
}//printList Method


public static Node insert(Node node,int data){
   
   if(node == null || start.data>data){
   	 node= new Node(data);
     return node;
   }
   //s = start;
   while(s.next!=null)
   {

     if(s.next.data>data)
     	{ break;}
     s.next;
   }
   Node n = new Node(data);
   n.next = s.next;
   s.next = n;
   //p.next = new Node(data,s.next);
   return node;
}//insert


public static Node delete(Node node,int data){
	if(node==null || node.data>x){

		return start;
	}
	else if(node.data==data){
		node.next;
		return node;
	}
    Node s = start;
    while(s.next!=null){
      
      if(s.next.data>data)
      {

        break;

      }
      else if(p.next.data>data){

      	p.next = p.next.next;
      	break;
      }
     p = p.next;
    }
    return p;
}

}//Main class