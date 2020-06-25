class AddsUpTo{

	public static void main(String [] args){
		
//		int []	arr = new int[]{1, 21, 3, 14, 5, 60, 7, 6};
	//	int [] result = findSum(arr, 27);



		//for(int x : result){
			
			//			System.out.println(x);
	//	}


		int [] a  = new int[]{1, 3, 5, 6, 7, 14, 21, 60};
		int [] ans = findSumV2(a, 27);
		

		for(int x : ans){
			System.out.println(x);
		}
	
	}

	public static int [] findSum(int [] arr, int n){
	
			int [] result = new int[2];
			for(int i = 0; i < arr.length; i++){

					for(int j = 0; j < arr.length; j++){
						
									if((arr[i] + arr[j]) == n){

										result[0] = arr[i];
										result[1] = arr[j];
										return result; 

									}
					}
			}
		
		return result;
	}

	public static int [] findSumV2(int [] arr, int n){
					int [] result = new int[2];
					int low = 0;
					int high = arr.length -1;
					int sum = 0;
					while(low != high){
						
						 sum = arr[low] + arr[high];
//					System.out.println(sum);	
						if( sum < n){
							
								low++;

						}else if(sum > n){
							 high--;
						}else{
								result[0] = arr[low];
								result[1] = arr[high];
								return result;
							}
					}
			
					return result;
	}
}
