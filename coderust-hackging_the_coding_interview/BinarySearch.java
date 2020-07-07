class BinarySearch{

	public static void main(String [] args){
		    int[] arr = {1, 10, 20, 47, 59, 63, 75, 88, 99, 107, 120, 133, 155, 162, 176, 188, 199, 200, 210, 222};

		    int result = binSearch(arr, 10);
		    System.out.println(result);
	}


	public static int binSearch(int [] arr, int a){

		int mid = arr.length / 2;

		int start = 0; 
		int end =  arr.length -1;

		while(start <= end){

			if(arr[mid] == a){
				return mid;
			}else if(arr[mid] < a){
				end = mid;
				mid =  mid /2;
			}else{

				start = mid; 
				mid = mid + ((end - mid) /2 );
			}


		}

		return -1;
			
	}



}



// 1, 2, 3, 4, 5, 6 , 7 , 8, 9