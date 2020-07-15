class BinarySearch{

	public static void main(String [] args){

		    int[] arr = {1, 10, 20, 47, 59, 63, 75, 88, 99, 107, 120, 133, 155, 162, 176, 188, 199, 200, 210, 222};

		    int result = binSearch(arr, 199);
		    System.out.println(result);
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

2 