class CheckReArrange{
	public static void main(String [] args){
		int [] arr = {10, -1, 20, 4, 5, -9, -6};

		int [] result = reArrange(arr);

		for(int x: result){
			System.out.println(x);
		}
	}


	public static int [] reArrange(int [] a){

		int [] result = new int[a.length];
		int resultIndexCounter =0;


		for(int i = 0; i < a.length; i++){

			if(a[i] < 0){

				result[resultIndexCounter] = a[i];
				resultIndexCounter++;
			}
		}



		for(int i = 0; i < a.length; i++){

			if(a[i] > 0){

				result[resultIndexCounter] = a[i];
				resultIndexCounter++;
			}
		}

		return result;
	}
}