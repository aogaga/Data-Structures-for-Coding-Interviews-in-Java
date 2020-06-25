class SecondMax{

				
	public static void main(String [] args){
	
//		int [] arr = new int[]{2, 54, 7, 2, 6, 54};
	//int result = findSecondMax(arr);
				int[] arr = {-2, -33, -10, -456};

					System.out.println(anoda(arr));
	 
	}

	public static int findSecondMax(int [] arr){

		int firstMax = -214748364;
		int secondMax = -214748364;

		for(int x : arr){
			
				if(x > firstMax){
						
					secondMax = firstMax;
					firstMax = x;
				}

				if (x < firstMax && x > secondMax){
					
						secondMax = x;
				}	
		}
	
		return secondMax;
	}


	public static int anoda(int [] arr){
	
		int first = -23435433;
		int second = -234535454;

		for(int x : arr){
		
			if(x > first){
				
				first = x;
			}
		}


		for(int z : arr){
			
			if(z < first && z > second){
				second = z;
			}
		}

		return second;
	}
}
