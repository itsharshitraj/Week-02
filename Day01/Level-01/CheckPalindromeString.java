import java.util.*;

public class CheckPalindromeString{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a text to check");
		String text = sc.nextLine();
		
		// object palindromechecker
		PalindromeChecker checker = new PalindromeChecker(text);
		checker.displayResult();
		
	}}
	
	class PalindromeChecker{
		String text;
		
		// constructor
		PalindromeChecker(String text){
			this.text=text;
		}
		
		// method check palindrome
		
		public boolean isPalindrome(){
			int left = 0;
			int right = text.length()-1;
			
			while(left<right){
				if(text.charAt(left) != text.charAt(right)){
					return false;
				}
				left++;
				right--;
			}
			return true;
		}
		// method to display result
		public void displayResult(){
			if(isPalindrome()){
				System.out.println("The text : " + text + " is a palindrome");
				}else{
				System.out.println("The text : " + text + " is not a palindrome");
			}
		}
		
	}	