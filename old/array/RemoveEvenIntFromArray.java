import java.util.*;

class RemoveEvenIntFromArray{
	public static void main(String [] args){
		 int [] arr = new int [] {1, 2, 4, 5, 10, 6, 3, 7, 9};
       int [] result = removeEven(arr);

       for (int x : result){
           System.out.println(x);
       }
	}


	public static int [] removeEven(int [] arr){

		int evenCount = 0;

		for(int x : arr){

			if(x%2 != 0){
				evenCount++;
			}
		}


		int [] result = new int[evenCount];

		int result_index_count = 0;

		for(int x: arr ){


			if(x%2 != 0){
				result[result_index_count] = x;
				result_index_count++;
			}
		}
		return result;
	}
}