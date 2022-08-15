import java.util.Scanner;
import java.util.Stack;

public class StackDemo {

	public static boolean bracketsBalance(String express) {
		Stack<Character> stack = new Stack<>();
		for(int i =0; i<express.length(); i++) {
			char x = express.charAt(i);
			if(x=='(' || x == '[' || x=='{') {
				stack.push(x);
			}
			if(stack.isEmpty()) {
				return false;
			}
			char check;
			switch(x) {
			case')':
				check = stack.pop();
				if(check =='{' || check=='[') {
					return false;
				}
				break;
				
			case '}':
				check = stack.pop();
				if(check == '(' || check == '[') {
					return false;
				}
				break;
				
			case ']':
				check = stack.pop();
				if(check == '(' || check == '{') {
					return false;
				}
				break;
			}
		}
		
		return(stack.isEmpty());
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a parenthesis expression: ");
		String express = scan.nextLine();
		if(bracketsBalance(express)) {
			System.out.println("Balanced");
		}
		else {
			System.out.println("Not Balanced");
		}
		
		scan.close();
	}

}
