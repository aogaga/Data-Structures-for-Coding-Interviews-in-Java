class RotateByN{

		public static void main(String [] args){

			System.out.println("In".length());
			int [] arr = new int[]{1, 2, 3, 4, 5};
			rotate(arr);
			
			for(int x : arr){
			
					System.out.println(x);
			}
		}

		public static void  rotate(int [] arr){
						
					int last = arr[arr.length-1];
						int len = arr.length -1;
					for(int i = len; i > 0; i--){
							
							arr[i] = arr[i-1];
					}				


					arr[0] = last;
		}

}
