class Minimum{
	public static void main(String [] args){
	
				int [] arr = new int[]{9, 2, 3, 6};

				System.out.println(findMin(arr));
	}

	
	public static int findMin(int [] arr){
	
		int min = arr[0];
		
		for(int x : arr){
				if(min > x){
					min = x;
				}
		}

		return min;
	}
}
