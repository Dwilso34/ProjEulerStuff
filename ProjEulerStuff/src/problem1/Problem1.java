package problem1;

/**
 * Author: Danny Wilson
 * Purpose: Project Euler problem 1
 *          Find the sum of the multiples of 3 and 5 up to 1000
 */
public class Problem1 {
   
    public static void main(String[] args) {
        int max = 1000;
        int multiple1 = 3;
        int multiple2 = 5;
        int sum=0;
        int j = 0;
        
        for(int i = 1; i < max; i++){   //loop to check up to max
            if (i%multiple1 == 0 || i%multiple2 == 0){ //checks for multiples
                sum = sum + i; //adds confirmed multiple to sum
                j++;
                System.out.println("sum " + j+ " = " + sum);
            }
        }
    }
}

