public class JumpSearch{
	public static void main(String[] args){
		//int[] inputs = {9,8,7,6,5,4,3,2,1,19,18,17,16,15,14,13,12,11,29,28,27,26,25,24,23,22,21,39,38,37,36,35,34,33,31};
		int[] inputs = {1,2,3,4,5,6,7,8,9};
		int jump = 5;
		int search = 10;
		for(int i=0;i<inputs.length;i+=jump){
			if((i+jump)<inputs.length){
				if(inputs[i]<=search && search<=inputs[i+jump]){
					for(int j=i;j<(i+jump);j++){
						if(inputs[j]==search){
							System.out.println("Found "+ inputs[j]);
							return ;
						}
					}
				}
			}else{
				if(inputs[i]<=search && search<=inputs[inputs.length-1]){
						for(int j=i;j<inputs.length;j++){
						if(inputs[j]==search){
							System.out.println("Found "+ inputs[j]);
							return ;
						}
					}
			}
		}
	}
	System.out.println("Not Found");
   }
}