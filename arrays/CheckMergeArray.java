class CheckMergeArray{

	public static void main(String [] args){
		
	int [] arr1 = new int []  {1, 3, 4, 5};	
	int [] arr2 = new int [] {2, 6, 7, 8};
	
		int [] result = mergeArrays(arr1, arr2);

		for(int x : result){
			System.out.println(x);
		}
	}

	public static int[] mergeArrays(int [] a, int [] b){
	
		int [] result = new int[a.length + b.length];
		
		int aIndexCounter = 0;
		int bIndexCounter = 0;
		int resultIndexCounter  = 0;
		

			while(aIndexCounter < a.length && bIndexCounter < b.length){
			
					if(a[aIndexCounter] < b[bIndexCounter]){
						result[resultIndexCounter] = a[aIndexCounter];
					 	aIndexCounter++;	
					}else{

						result[resultIndexCounter] = b[bIndexCounter];
						bIndexCounter++;
					}
				
					resultIndexCounter++;
			}	


			while(aIndexCounter < a.length){
				
				result[resultIndexCounter] = a[aIndexCounter];
				resultIndexCounter++;
				aIndexCounter++;
			
			}

			
			while(bIndexCounter < b.length){

				result[resultIndexCounter] = b[bIndexCounter];
				resultIndexCounter++;
				bIndexCounter++;
			}

			return result;
	}
}
