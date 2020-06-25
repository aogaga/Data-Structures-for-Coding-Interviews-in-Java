class RemoveEven{
	public static void main(String [] args){
		int []	arr = new int[]{1, 2, 4, 5, 10, 6, 3};

		int [] result = deEven(arr);

		for(int x : result){
			System.out.println(x);
		}
	}

	public static int[] deEven(int [] arr){
		int count = 0;

		for(int x : arr){
			
			if(x%2 != 0){
				count++;
			}
		}			

		int [] result = new int[count]; 
		
		int indexCounter = 0; 
		
		for(int x : arr){
			
			if(x%2 > 0 ){

				result[indexCounter] = x;
				indexCounter++;
			}
		}	

		return result;
	}
}
