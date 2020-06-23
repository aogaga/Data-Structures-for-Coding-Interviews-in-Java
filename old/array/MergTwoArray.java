class MergTwoArray{

	public static void main(String [] args){
		int [] arr1 = new int []{1, 3, 4, 5}  ;
		int [] arr2 = new int [] {2, 6, 7, 8};

		int [] result = merge(arr1, arr2);

		for(int x : result){
			System.out.println(x);
		}
	}


	public static int [] merge(int [] a, int [] b){

		int [] result = new int[a.length + b.length];
		int indexCounter = 0;
		int i =0;
		int j = 0;

		while(i < a.length && j < b.length ){

			if(a[i] < b[j]){
				result[indexCounter] = a[i];
				i++;
				indexCounter++;
			}else{
				result[indexCounter] = b[j];
				j++;
				indexCounter++;

			}
		}


	

		while(i < a.length){
			result[indexCounter] = a[i];
				i++;
				indexCounter++;
		}

		

		while(j < b.length){
			result[indexCounter] = b[j];
				j++;
				indexCounter++;
		}

		System.out.println("=======");

		return result;
	}
}