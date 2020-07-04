class FindBinChallenge{

	public static void main(String [] args){
		
		String [] result = findBinary(3);
		System.out.println("new approach");
		for(String x : result){
			System.out.println(x);
		}	
	
	}

	
	public static String [] findBin(int n){
		
		String  [] result = new String[n];

		for(int i = 1; i <= n; i++){
			
			int binary = convertToBinary(i);
			result[i-1] = Integer.toString(binary);
		}

		return result;
	}


	public static String [] findBinary(int n){
		String [] result = new String[n];
		Queue<String> que = new Queue(n+1);

		que.enqueue("1");

		for(int i = 0; i < n; i++){
			result[i] = que.dequeue();
		   String s1 = (result[i] + "0");
	   	   String s2 = (result[i] +  "1");
			
			que.enqueue(s1);
	 		que.enqueue(s2);		
		}
		
		return result;
	}

	public static int convertToBinary(int n){
	
		String result = "";
		int reminder = 0;
		int quotient = n;

		while(quotient > 0){
			reminder = quotient % 2;
			quotient = quotient / 2;
			result = reminder + result;
		}

		return Integer.parseInt(result);

	}
}
