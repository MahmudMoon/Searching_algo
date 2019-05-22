public class Binary_search{
	public static void main(String[] args){
		int[] test = {0,1,2,3,4,5,6,7,8,9};
		int search_element = -1;
		int start,end,mid;
		start = 0;
		end = test.length;
		mid = (start+end)/2;
		while(search_element!=test[mid] && start<end){
			if(search_element>test[mid])
				start = mid+1;
			else
				end = mid-1;
			
			mid = (start+end)/2;
		}
		
		if(search_element==test[mid]){
			System.out.println("Found");
		}else
			System.out.println("Not Found");
	}
}