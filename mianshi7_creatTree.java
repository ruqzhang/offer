package offer;

import java.util.LinkedList;  
import java.util.List;  
import java.util.Scanner;
	  
	/** 
	 * 功能：实现二叉顺序树 
	 *  
	 * 参考资料0:数据结构(C语言版)严蔚敏 
	 *  
	 * 参考资料1：http://zhidao.baidu.com/question/81938912.html 
	 *  
	 * 参考资料2：http://cslibrary.stanford.edu/110/BinaryTrees.html#java 
	 *  
	 * @author ocaicai@yeah.net @date: 2011-5-17 
	 *  
	 */  
	public class mianshi7_creatTree {  
	  
	    
	    private static List<Node> nodeList = null;  
	  
	
	    public static class Node {  
	        Node leftChild;  
	        Node rightChild;  
	        int data;  
	  
	        Node(int newData) {  
	            leftChild = null;  
	            rightChild = null;  
	            data = newData;  
	        } 
	    }  
	  
	  
	    public static Node createBinTree(int []array) {  
	        nodeList = new LinkedList<Node>();  
	        // 将一个数组的值依次转换为Node节点  
	      
	        for (int nodeIndex = 0; nodeIndex < array.length; nodeIndex++)   
	            nodeList.add(new Node(array[nodeIndex]));
	        Node root = nodeList.get(0);
	        for(int i = 1; i < array.length; i++){
	        	insert(root,nodeList.get(i));
	        }
	            return root;	        
	        }
	    
	    private static Node insert(Node root, Node value) {
	        //二叉排序树插入节点
	        if(root == null){
	            root = value;
	        }else{
	            if(value.data <= root.data){
	                //插入到左子树
	                root.leftChild = insert(root.leftChild, value);
	            }else{
	                //插入到右子树
	                root.rightChild = insert(root.rightChild, value);
	            }
	        }

	        return root;
	    }
	    
	    public static void preOrderTraverse(Node node) {  
	        if (node == null)  
	            return;  
	        System.out.print(node.data + " ");  
	        preOrderTraverse(node.leftChild);  
	        preOrderTraverse(node.rightChild);  
	    }  
	  
	    /** 
	     * 中序遍历 
	     *  
	     * 这三种不同的遍历结构都是一样的，只是先后顺序不一样而已 
	     *  c         
	     * @param node 
	     *            遍历的节点 
	     */  
	    public static void inOrderTraverse(Node node) {  
	        if (node == null)  
	            return;  
	        inOrderTraverse(node.leftChild);  
	        System.out.print(node.data + " ");  
	        inOrderTraverse(node.rightChild);  
	    }  
	  
	    /** 
	     * 后序遍历 
	     *  
	     * 这三种不同的遍历结构都是一样的，只是先后顺序不一样而已 
	     *  
	     * @param node 
	     *            遍历的节点 
	     */  
	    public static void postOrderTraverse(Node node) {  
	        if (node == null)  
	            return;  
	        postOrderTraverse(node.leftChild);  
	        postOrderTraverse(node.rightChild);  
	        System.out.print(node.data + " ");  
	    }  
	  
	    public static void main(String[] args) {  
	    	Scanner input=new Scanner(System.in);
		    System.out.println("请输入一串整数并以逗号隔开: ");
		    while(input.hasNextLine()){
		    String str=input.nextLine();
		    String []tmp=str.split(",");
		    int []num=new int[tmp.length];
		    for(int i=0;i<tmp.length;i++){
		    	num[i]=Integer.parseInt(tmp[i]);
		    }
	  
		    Node root=createBinTree(num);
	        System.out.println("先序遍历：");  
	        preOrderTraverse(root);  
	        System.out.println();  
	  
	        System.out.println("中序遍历：");  
	        inOrderTraverse(root);  
	        System.out.println();  
	  
	        System.out.println("后序遍历：");  
	        postOrderTraverse(root);  
	        System.out.println(); 
	    }  
	  
	}  
	}
	
