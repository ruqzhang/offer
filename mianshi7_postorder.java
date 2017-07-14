package offer;

import offer.mianshi7_creatTree.Node;

public class mianshi7_postorder {

	public static void postOrderTraverse(Node node) {  
        if (node == null)  
            return;  
        postOrderTraverse(node.leftChild);  
        postOrderTraverse(node.rightChild);  
        System.out.print(node.data + " ");  
    }  
	public static int findplace(int []a,int value){
		for(int i=0;i<a.length;i++){
			if(a[i]==value){
				return i;
			}
		}
		return -1;
	}
	
	public static Node initTree(int[]preorder,int start1,int end1,int[]inorder,
			int start2,int end2){
		if(start1>end1||start2>end2)
			return null;
		int rootdata=preorder[start1];
		Node head=new Node(rootdata);
		int inorder_index=findplace(inorder,rootdata);
		int offset=inorder_index-start2-1;
		Node left=initTree(preorder,start1+1,start1+1+offset,inorder,start2,start2+offset);
		Node right=initTree(preorder,start1+offset+2,end1,inorder,inorder_index+1,end2);
		head.leftChild=left;
		head.rightChild=right;
		return head;

	}
	public static Node initTree(int[]a,int[]b){
		Node root=initTree(a,0,a.length-1,b,0,b.length-1);
		return root;
	}
	public static void main(String[] args) {
		int[]a={1,2,4,8,9,5,10,3,6,7};
		int[]b={8,4,9,2,10,5,1,6,3,7};
		Node root=initTree(a,b);
		postOrderTraverse(root);
	}
}
