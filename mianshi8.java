package offer;

class TreeLinkNode {  
    int val;  
    TreeLinkNode left = null;  
    TreeLinkNode right = null;  
    TreeLinkNode parent = null;  

    TreeLinkNode(int val) {  
        this.val = val;  
    }  
}  
 

public class mianshi8{
	public static TreeLinkNode GetNext(TreeLinkNode pNode){
		if(pNode==null)
			return null;
		TreeLinkNode tmp = null;
		if(pNode.right!=null){
			tmp=pNode.right;
			while(tmp.left!=null){
				tmp=tmp.left;
			}
			return tmp;
		}else if(pNode.parent!=null){
			tmp=pNode.parent;
			TreeLinkNode tmp2=pNode;
			 while(tmp!=null&&tmp.left!=tmp2){
				 tmp2=tmp;
				 tmp=tmp.parent;
			 }
			 return tmp;
		}
		
		return null;
	}
}