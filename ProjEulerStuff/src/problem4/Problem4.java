package problem4;

/**
 * Author: Danny Wilson
 * Purpose: Project Euler problem 4
 *          Find the largest palindrome made from the product of two 3-digit numbers.
 *          
 */
public class Problem4 {
	
	public static boolean Palindrome(int i){
		boolean palin = false;
		String forward = Integer.toString(i);
		String reverse = new StringBuilder(forward).reverse().toString();
		
		if(forward.equals(reverse))
		{
			palin = true;
		}
		return palin;
	}
	
	public static void main(String[] args){
		int product = 0;
		int max = 0;
		
		for(int a = 100; a < 1000; a++){
			for(int b = 100; b < 1000; b++){
				product = a * b;				
				if(Palindrome(product) == true && product > max){
					max = product;
					System.out.println("The largest Palindrome Found so Far: " + max);
				}
			}
		}
		System.out.println("The Largest Palindrome is: " + max);
		}
}
