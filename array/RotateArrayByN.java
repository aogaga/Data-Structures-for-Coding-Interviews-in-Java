class RotateArrayByN{

	public static void main(String [] args){
	int [] a = {1, 2, 3, 4, 5};

		rotateArray(a, 1);


		for (int x: a ) {
			System.out.println(x);
		}

	}

	public static void rotateArray(int [] a, int n){

		

		for( int i = 1; i <= n; i++ ){
			
			int tempLeft = a[n-1];
			int tempRight = a[a.length -n];

			a[n-1] = tempRight ;
			a[a.length -n] = tempLeft;

			}

		
	}
}