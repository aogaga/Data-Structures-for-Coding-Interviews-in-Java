import java.util.*;
class RotateArray{

	public static void main(String [] args){
		int [] arr = new int[]{1, 10, 20, 0, 59, 86, 32, 11, 9, 40};

		System.out.println("Before Roatation");
		System.out.println(Arrays.toString(arr));


		rorateArray(arr, 2);

		System.out.println("After Roatation");
		System.out.println(Arrays.toString(arr));
	}
	public static void rorateArray(int [] arr, int n){
		
		if(n < 0){
			//left rotate
			for(int i = 0; i < n; i++){

				leftRotation(arr);
				//System.out.println(Arrays.toString(arr));
			} 
		}else{

			for(int i = 0; i < n; i++){
				rightRotation(arr);
			//	System.out.println(Arrays.toString(arr));
			}
		}
	}


	public static void leftRotation(int [] arr ){

			int i  = 0;
			int len = arr.length;
			int first = arr[0];

		while(i <  len){
			arr[i] = arr[i+1];
			i++;
		}

		arr[arr.length -1] = first;
	}


	public static void rightRotation(int [] arr){

		int last = arr[arr.length -1];

		int len = arr.length -2;

		while(len >= 0){

			arr[(len + 1)] = arr[len];

			//System.out.println(len);
			len--;
		}


		arr[0] = last; 
	}
}





// 1, 2, 3, 4, 5






