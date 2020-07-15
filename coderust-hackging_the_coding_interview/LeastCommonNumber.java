class LeastCommonNumber{

	public static void main(String [] args){
		 int[] v1 = new int[]{6, 7, 10, 25, 30, 63, 64};
   			 int[] v2 = new int[]{1, 4, 5, 6, 7, 8, 50};
    int[] v3 = new int[]{1, 6, 10, 14};

    int result = findLeastCommonNumber(v1, v2, v3);
    System.out.println(result);
	}

	public static int findLeastCommonNumber(int [] arr1, int [] arr2, int [] arr3){

		int first = 0; int second = 0; int third = 0;

		while(first < arr1.length && second < arr2.length && third < arr3.length){


			if(arr1[first] == arr2[second] && arr3[third] == arr2[second]){
				return arr1[first];
			}


			if(arr1[first] <= arr2[second] && arr1[first] <= arr3[third]){
				first++;
			}


			else if(arr2[second] <= arr1[first] && arr2[second] <= arr3[third]){
				second++;
			}


			else if(arr3[third] <= arr1[first] && arr3[third] <= arr2[second]){
				third++;
			}
		}


			return -1;


	}
}