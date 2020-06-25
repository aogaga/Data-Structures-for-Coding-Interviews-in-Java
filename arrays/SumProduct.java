class SumProduct{
	public static void main(String [] args){
	 int [] arr = new int[]{1, 2, 3, 4};

	 int [] result = findProduct(arr);

	 for(int x : result){
	
			System.out.println(x);

	 }
	}


	public static int [] findProduct(int [] arr){
		
		int [] result = new int[arr.length];


		for(int i = 0; i < arr.length; i++){
	
				result[i] = sumExcept(arr, i); 

		}

		return result;

	}


	public static int sumExcept(int [] arr, int index){
		int result = 1;

		for(int i = 0; i < arr.length; i++){
			
						if(i != index){
							result = result * arr[i];
						}
		}
	
		return result;
	}	
}
