package offer;
import java.util.Scanner;

public class mianshi4 {
	public static boolean findnum(int [][]array,int num){
		boolean flag=false;
		int rows=array.length;
		int columns=array[0].length;
		if(rows>0&&columns>0){
			int row=0;
			int column=columns-1;
			while(row<rows&&column>=0){
			if(array[row][column]==num){
				flag=true;
				break;
			}
			else if(array[row][column]>num)
				--column;
			else
				++row;
		}
		}
		return flag;
		
	}
	public static void main(String[] args) {
		int[][]a={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		Scanner input=new Scanner(System.in);
	    System.out.println("请输入一个整数: ");
	    while(input.hasNextLine()){
	         int num=input.nextInt();
	         if(findnum(a,num))
	 			System.out.println("数组中存在该数字。");
	 		else
	 			System.out.println("数组中不存在该数字。");
	    }
	    input.close();
	
	}

}
