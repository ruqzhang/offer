package offer;

import java.util.LinkedList;  
import java.util.List;  
import java.util.Scanner;
	  
	/** 
	 * ���ܣ�ʵ�ֶ���˳���� 
	 *  
	 * �ο�����0:���ݽṹ(C���԰�)��ε�� 
	 *  
	 * �ο�����1��http://zhidao.baidu.com/question/81938912.html 
	 *  
	 * �ο�����2��http://cslibrary.stanford.edu/110/BinaryTrees.html#java 
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
	        // ��һ�������ֵ����ת��ΪNode�ڵ�  
	      
	        for (int nodeIndex = 0; nodeIndex < array.length; nodeIndex++)   
	            nodeList.add(new Node(array[nodeIndex]));
	        Node root = nodeList.get(0);
	        for(int i = 1; i < array.length; i++){
	        	insert(root,nodeList.get(i));
	        }
	            return root;	        
	        }
	    
	    private static Node insert(Node root, Node value) {
	        //��������������ڵ�
	        if(root == null){
	            root = value;
	        }else{
	            if(value.data <= root.data){
	                //���뵽������
	                root.leftChild = insert(root.leftChild, value);
	            }else{
	                //���뵽������
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
	     * ������� 
	     *  
	     * �����ֲ�ͬ�ı����ṹ����һ���ģ�ֻ���Ⱥ�˳��һ������ 
	     *  c         
	     * @param node 
	     *            �����Ľڵ� 
	     */  
	    public static void inOrderTraverse(Node node) {  
	        if (node == null)  
	            return;  
	        inOrderTraverse(node.leftChild);  
	        System.out.print(node.data + " ");  
	        inOrderTraverse(node.rightChild);  
	    }  
	  
	    /** 
	     * ������� 
	     *  
	     * �����ֲ�ͬ�ı����ṹ����һ���ģ�ֻ���Ⱥ�˳��һ������ 
	     *  
	     * @param node 
	     *            �����Ľڵ� 
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
		    System.out.println("������һ���������Զ��Ÿ���: ");
		    while(input.hasNextLine()){
		    String str=input.nextLine();
		    String []tmp=str.split(",");
		    int []num=new int[tmp.length];
		    for(int i=0;i<tmp.length;i++){
		    	num[i]=Integer.parseInt(tmp[i]);
		    }
	  
		    Node root=createBinTree(num);
	        System.out.println("���������");  
	        preOrderTraverse(root);  
	        System.out.println();  
	  
	        System.out.println("���������");  
	        inOrderTraverse(root);  
	        System.out.println();  
	  
	        System.out.println("���������");  
	        postOrderTraverse(root);  
	        System.out.println(); 
	    }  
	  
	}  
	}
	
