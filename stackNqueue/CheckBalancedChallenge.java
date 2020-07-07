class CheckBalancedChallenge{
	public static void main(String [] args){
		 System.out.println(isBalanced("{[()]}"));
        System.out.println(isBalanced("[{(}]"));
	}


	public static boolean isBalanced(String exp){
		Stack<Character> stack = new Stack<Character>(exp.length());

		for(int i = 0; i < exp.length(); i++){
			char  temp = exp.charAt(i);
			if(temp == ']' || temp == '}' || temp == ')'){
				if(stack.isEmpty()){
					return false;
				}

			if(temp == '}' && stack.pop() == '{' || temp == ')' && stack.pop() == '(' || temp == ']' && stack.pop() == '['){
				return false;
			}

			}else{

				stack.push(temp);
			}
		}

		return true;
	}
}