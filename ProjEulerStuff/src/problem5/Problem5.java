package problem5;

/**
 * Author: Danny Wilson
 * Purpose: Project Euler problem 4
 *         What is the smallest positive number that is evenly 
 *         divisible by all of the numbers from 1 to 20
 *          
 */
public class Problem5 {

	public static void main(String[] args){
		System.out.println(1%5);
		int number = 0;
		int index = 0;
		boolean divisible = true;
		
		while(divisible == true){
			int i = 1;
			
			for(int j = 10; j > 0; j--){
				if(i%j == 0){
					index ++;
				}
			}
			i++;
		}
	}
}
