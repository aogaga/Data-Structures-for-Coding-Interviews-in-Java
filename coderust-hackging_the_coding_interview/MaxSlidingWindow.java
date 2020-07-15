import java.util.*;
class MaxSlidingWindow{


public static void main(String [] args){
	int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int [] result = findMaxSlidingWindow(array, 3);

	System.out.println(Arrays.toString(result));
}
   public static int [] findMaxSlidingWindow(int[] arr, int windowSize) {
   		List<Integer> result = new ArrayList<Integer>();

   		int i  = 0;

   		while((i + windowSize) <= arr.length){
   			System.out.println(i);
   			int high = -23453545;

   			for(int x = 0; x < windowSize; x++){

   				if(arr[i + x] > high){
   					high = arr[i+x];
   				}
   			}

   			result.add(high);
   			i++;
   		}


   		int [] ans = new int[result.size()];

   		int index  = 0;

   		for(int x : result){
   			ans[index] = x;
   			index++;
   		}

   		return ans;
   }


}





// 123   3
// 234  4
// 345  5
// 456  6
// 567  7
// 678  8
// 789  9
// 8910  10