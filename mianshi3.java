package offer;
import java.util.Scanner;

public class mianshi3 {

	public static void changeposition(int []a){
		int tmp=0;
		int i=0;
		for(i=0;i<a.length;i++){
			while(a[i]!=i){
				if(a[i]==a[a[i]]){
					System.out.println(a[i]);
					break;
				}
				tmp=a[i];
				a[i]=a[tmp];
				a[tmp]=tmp;
				
				}
			}
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
	    changeposition(num);
	    }
	    input.close();
		
	}
		
	
}
