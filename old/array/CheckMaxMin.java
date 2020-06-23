class CheckMaxMin{

	public static void main(String [] args){
		int [] arr = {1, 2, 3, 4, 5};
		int [] result = maxMin(arr);
      

      System.out.println("-----------------------");
       for(int x: result){
			System.out.println(x);
		}

	}

	public static int [] maxMin(int [] a){

		int [] result = new int[a.length];

		int mid = (a.length / 2);
		System.out.println("mid is " + mid);
		int indexCounter = 0;

		for(int i = 0; i < mid; i++){

			result[indexCounter] = a[a.length - 1 -i];
			result[indexCounter++] = a[i];
			indexCounter++;

			System.out.println("indexCounter : " +indexCounter);
			System.out.println("1 : " + a[a.length - 1 -i]);
			System.out.println("1 : " + a[i]);


			System.out.println("start end -----------------------");

			  for(int x: result){
			System.out.println(x);

				System.out.println("start end -----------------------");
		}


		}

		if (a.length %2 != 0){

			result[mid+1] = a[mid+1];
		}

		return result;
	}
}
