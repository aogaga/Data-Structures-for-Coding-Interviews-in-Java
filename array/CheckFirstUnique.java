class CheckFirstUnique{
	public static void main(String [] args){
	int [] a = {9, 2, 3, 2, 6, 6};
	int [] b = {4, 5, 1, 2, 0, 4, 5};
	int[] arr = {2, 54, 7, 2, 6, 54};
		System.out.println(firstUnique(a));
		System.out.println(firstUnique(b));
		System.out.println(firstUnique(arr));
	
	}


	public static int firstUnique(int [] a){

		for (int x : a ) {
			
			if(uniniqueFound(a, x)){
		
				return x;
		
			}
		}
		return -1;
	}



	public static boolean uniniqueFound(int [] a, int n){
		int result = 0;

		for(int x : a){
			if(x == n){
				result++;
			}
		}

		if(result > 1){
			return false;
		}else{
			return true;
		}
	}
}