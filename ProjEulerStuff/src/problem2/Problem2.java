package problem2;

/**
 * Author: Danny Wilson
 * Purpose: Project Euler problem 2
 *          Find the sum of the even Fibonacci numbers whose values do not 
 *          exceed four million
 */
public class Problem2 {
    public static void main(String[] args) {
        int fib1 = 1;
        int fib2 = 2;
        int fibNext = 0;
        int fibSumEvens = 0;
                
        while(fibNext < 4000000){
	        if(fib2%2 == 0){
	            fibSumEvens = fibSumEvens + fib2;
	            System.out.println("The current sum of the even Fibonacci numbers: " + fibSumEvens);
	        }
	        fibNext = fib1 + fib2;
	        fib1 = fib2;
	        fib2 = fibNext;
        }
    }
}
