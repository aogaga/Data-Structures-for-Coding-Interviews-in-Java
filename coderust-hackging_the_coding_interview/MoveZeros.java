import java.util.*;

class MoveZeros{

public static void main(String[] args) {
     int[] v = new int[]{1, 10, 20, 0, 59, 63, 0, 88, 0};
    System.out.println("Original Array: " + Arrays.toString(v));
    
    moveZerosToLeft(v);
    
    System.out.println("After Moving Zeroes to Left: " + Arrays.toString(v));
  }  

	 public static void moveZerosToLeft(int[] a) {

	 	if(a.length < 1){
	 		return;
	 	}

	 	int readIndex = a.length -1;
	 	int writeIndex = a.length -1;

	 	while(readIndex >= 0){

      System.out.println("Read Index : " + a[readIndex]);
        System.out.println("wrinte index : " + a[writeIndex]);


	 		if(a[readIndex] != 0){
	 			a[writeIndex] = a[readIndex];

  
	 			writeIndex--;
	 		}

	 		readIndex--;
	 	}

	 	while(writeIndex >= 0){
	 		a[writeIndex] = 0;
	 		writeIndex--;
	 	}
	 }
}