package offer;
import java.util.Scanner;
import java.util.Stack;

public class mianshi5 {

	public static String replacespace(String str){
		Stack<Character>str1=new Stack<Character>();
		Stack<Character>str2=new Stack<Character>();
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==' '){
				str1.push('%');
				str1.push('2');
				str1.push('0');
			}
			else
				str1.push(str.charAt(i));
		}
		if(str2.isEmpty()){
			while(!str1.isEmpty()){
				str2.push(str1.pop());
			}
		}
		String output="";
		while(!str2.isEmpty())
			output+=String.valueOf(str2.pop());
		return output;
	}
	     public static void main(String[] args) {
	    	 Scanner input=new Scanner(System.in);
	 	    System.out.println("Please input one String: ");
	 	    while(input.hasNextLine()){
	 	         String str=input.nextLine();
	 	         System.out.println(replacespace(str));
	 	    }
	 	    input.close();
		}
}
