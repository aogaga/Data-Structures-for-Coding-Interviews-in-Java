class SearchRotated{

	public static void main(String [] args){
		 int[] v1 =  {4, 5, 6, 1, 2, 3};
		 System.out.println("Key(3) found at: " + binarySearchRotated(v1, 3));
		  System.out.println("Key(6) found at: " + binarySearchRotated(v1, 6));

		

	}


	public static int binarySearchRotated(int[] arr,int key) {
  			

  		int mid = arr.length /2;

  		int high = arr.length -1;
  		int low = 0;


  		while(low <= high){

  			if(arr[mid] == key){
  				return mid;
  			}else if (arr[low] == key){
  				return low;
  			}
  			else if (arr[high] == key){
  				return high;
  			}
  			else if(key >= arr[mid]  && key <= arr[high]){

  				low = mid;
  				mid = mid + ((high - mid)/2);
  			}else if(key <= arr[mid]){

  					high = mid;
  					mid = low + ( mid /2);

  			}else{
  					high = mid;
  					mid = low + ( mid /2);
  			}


  		}	
    	

    	return -1;
  	}


  		public static int binSearch(int [] arr, int a){

		int mid = (arr.length- 1)/ 2;
		int low = 0;
		int high = arr.length -1;

		
		while( low <= high){


			
			if(a < arr[mid] || a> arr[high]){
				return -1;
			}


			if(arr[mid] == a){
				return mid;
			}

			if(a < arr[mid]){

				high = mid;

				mid = (high - low)/2;
			}


			if(a > arr[mid]){
				low = mid;
				mid = mid + ((high - low) /2);

			}




		}


		System.out.println("done");
	


		return -1;
	}

}