package offer;

class Node{
	Node next=null;
	int data;
	public Node(int data){
		this.data=data;
	}
}
public class mianshi6 {
	Node head=null;
	public void add(int d){
		
		Node newnode=new Node(d);
		if(head==null){
			head=newnode;
			return;
		}
		Node tmp=head;
		while(tmp.next!=null){
			tmp=tmp.next;
		}
		tmp.next=newnode;
		
	}
	public void reverse(Node head){
		if(head!=null){
			reverse(head.next);
			System.out.println(head.data);
		}
	}
	public void print(){
		Node tmp=head;
		while(tmp!=null){
			System.out.println(tmp.data);
			tmp=tmp.next;
		}
	}
	public static void main(String[] args) {
		mianshi6 list=new mianshi6();
		list.add(5);
		list.add(3);
		list.add(1);
		list.add(3);
		
		list.reverse(list.head);
		
	}

}
