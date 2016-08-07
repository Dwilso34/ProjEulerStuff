package problem3;

import java.util.*; 
/**
 * Author: Danny Wilson
 * Purpose: Project Euler problem 3
 *          Find the largest prime factor of the number 600851475143
 */
public class Problem3 {

    static List<Long> factors(long num){
        
        ArrayList<Long> factors = new ArrayList<Long>();
        
        for(long i = 2; i <= num; i++){
            while(num%i == 0){
                factors.add(i);
                
                num /= i;
            }
        }
        return factors;
    }
        
    public static void main(String[] args) {
        
        for(Long lon : factors(600851475143L)){
            
            System.out.println(lon);
        }
    }
}