package old.array;

class ArrangeMaxMins{

public static void main(String [] args){
	int [] arr = {1, 2, 3, 4, 5};

	int [] result = maxMin(arr);

	for(int x : result){
		System.out.println(x);
	}
}
	public static int [] maxMin(int [] a){
		int len = a.length - 1;
		int mid = a.length / 2;
		
		int [] result = new int [a.length] ;
		int indexCounter = 0;

		for(int i = 0; i < mid; i++){


			result[indexCounter] = a[len - i];
			indexCounter++;
			result[indexCounter]  = a[i];
			indexCounter++;
		}

		if(a.length %2 != 0){

			result[indexCounter] = a[mid];
		}

		return result;

	}


	public void deleteAtHead(){
//		if(isEmpty()){
//			return;
//		}
	}
}

// 1, 2, 3, 4, 5
// 0, 1, 2, 3, 4

// 1, 2, 3, 4, 5 , 6
// 0, 1, 2, 3, 4 , 5
