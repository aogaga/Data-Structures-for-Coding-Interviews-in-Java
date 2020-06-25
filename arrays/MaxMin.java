class MaxMin{
		

		public static void main(String [] args){
			int [] aa = new int[] {1, 2, 3, 4, 5};
			int [] bb = new int[]{1, 2, 3, 4, 5, 6, 7}; 
			mM(aa);
			mM(bb);

			for(int a : aa){
				System.out.println(a);
			}

			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			for(int b : bb){
				System.out.println(b);
			}

		}


		public static void mM(int [] arr){
			int mid = arr.length /2;
			int [] result = new int[arr.length];
			int len = arr.length -1;
			int arrayIndexCounter = 0;
			for(int i = 0; i < mid; i++){
						
					result[arrayIndexCounter] = arr[len -i];
					arrayIndexCounter++;
					result[arrayIndexCounter] = arr[i];
					arrayIndexCounter++;
			}

			if(arr.length % 2 != 0){
			
				result[arrayIndexCounter] = arr[mid];
			}
			

    	for(int x = 0; x < result.length; x++){
					
				arr[x] = result[x];

			}
		

		}
}
