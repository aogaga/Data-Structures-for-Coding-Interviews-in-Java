class CheckSecondMax{
	public static void main(String [] args){
		int [] a = {9, 2, 7, 3, 6};
		int [] b = {4, 2, 1, 5, 0};

			System.out.println(findSecondMaximum(a));

			System.out.println("----------------------------------");
			System.out.println(findSecondMaximum(b));
	}


	public static int findSecondMaximum(int [] a){

		int max = max(a);
		System.out.println("max : " + max);

		int secondMax = max(a, max);
		return secondMax;
	}



	public static int max(int [] a){
			int max = -214748364;
		for(int x: a){

			if(x > max){
				max = x;
			}
		}

		return max;
	}

	public static int max(int [] a, int z){
		int max = -214748364;
		
		for(int x: a){

			if(x > max && x < z){
				max = x;
			}
		}

		return max;
	}
}