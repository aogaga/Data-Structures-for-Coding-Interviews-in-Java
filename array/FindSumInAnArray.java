class FindSumInAnArray{

	public static void main(String [] args){
		int [] a = new int [] {1, 21, 3, 14, 5, 60, 7, 6};

		int [] result = findSum(a, 27);

		for (int x : result) {
			
			System.out.println(x);
		}
	}

	public static int [] findSum(int [] a, int n){

		int [] result = new int[2];

		for(int i = 0; i < a.length; i++){

			for(int j = 0; j < a.length; j++){

				
				if((a[i] + a[j]) == n){

					result[0] = a[i];
					result[1] = a[j];

					return result;
				}
			}
		}
		return result;
	}
}