class FindMin{
	public static void main(String [] args){

		int [] a = {9, 2, 3, 6};
		int [] b = {4, 2, 1, 5, 0};

		System.out.println(min(a));
		System.out.println(min(b));
	}


	public static int min(int [] a){
		int result = a[0];


		for(int x : a){

			if(result > x){
				result = x;
			}
		}

		return result;
	}
}