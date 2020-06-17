class ProductArray{
	public static void main(String [] args){
		int [] a = {1,2,3,4};

		int [] result = findProduct(a);

		for (int x: result) {
			System.out.println(x);
		}
	}

	public static int [] findProduct(int [] ar){
		int [] result = new int[ar.length];


		for(int i = 0; i < ar.length; i++){

			result[i]  = productWithNumberToSkip(ar, i);
		}

		return result;
	}

	public static int productWithNumberToSkip(int [] a, int n){

		int result = 1;

		for(int i = 0; i < a.length; i++){

			if(i != n){
				result  = result * a[i];
			}
		}

		return result;
	}
}