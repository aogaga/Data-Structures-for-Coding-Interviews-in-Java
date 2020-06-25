import java.util.*;

class FirstUnique{

	public static void main(String [] args){
		int [] arr = new int[]{9, 2, 3, 2, 6, 6};;

		System.out.println(firstUnique(arr));
	}

	public static int firstUnique(int [] arr){
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for(int x : arr){
				if(map.containsKey(x)){
					int temp = (int) map.get(x);
					map.replace(x, temp + 1);
				}	else{
		
					map.put(x, 1);

				}

//				System.out.println(x);
		}


		Iterator  iterator = map.entrySet().iterator();


		while(iterator.hasNext()){
		
			Map.Entry elem = (Map.Entry) iterator.next();
			int num = (int) elem.getValue();
			int  key = (int) elem.getKey();
	
				if(num == 1){
						return key;
					}
		  }

		return -1;
	}

}
