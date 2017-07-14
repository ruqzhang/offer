package offer;

public class mianshi3_2 {

	public static int findcount(int[]a,int start,int end){
		int length=a.length;
		int count=0;
		for(int i=0;i<length;i++)
			if(a[i]>=start&&a[i]<=end)
				++count;
		
		return count;
	}
	
	public static void findrepead(int []array){
		int leng=array.length;
		int start=1;
		int end=leng-1;
		while(end>=start){
			
			int mid=(end-start)/2+start;
			int count=findcount(array,start,mid);
			
			if(count>mid-start+1)
				end=mid;
			else
				start=mid+1;
			
			if(end==start){
				if(count>1){
					System.out.println(start);
				   break;}
				else{
					
				    break;
				}
			}
			
		}
		
	}
	public static void main(String[] args) {
		int []a={2,3,5,4,7,2,6,6};
		findrepead(a);
		
	}
}
