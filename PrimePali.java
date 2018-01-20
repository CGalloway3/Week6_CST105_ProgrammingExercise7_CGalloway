//This is my own work. Chad Galloway
/**  Program: Prime Palindromes
*    File: PrimePali.java
*    Summary: Simple Program that loops through 100,000 numbers,
              and displays all the Prime number Palindromes.
*    Author: Chad Galloway
*    Date: Jan. 18, 2018
**/

package prime.palindromes;

public class PrimePali {

    public static void main(String[] args) {
        
        // Initalization of variables
        int iteration = 1; // Loop counter
        int displayCounter = 1;  // Track how many prime palindromes foud
        
        // Main loop
        while (iteration < 100000) {
            
            //Is the current number iteration prime and palindromic
            if (isPrime(iteration) && isPalindrome(iteration)) {
                
                // Display current number and increment the diaplay counter
                displayNumber(displayCounter, iteration);
                displayCounter++;
            }
            
            // increment iteration loop counter
            iteration++;
        }
        
        System.out.println("");
        System.out.println("\nSucessfully found " + displayCounter + " palindromic, prime numbers.") ;
        
    }
    
    private static Boolean isPrime(int number) {
        
        // Initialize variables
        int middle = number / 2;
        
        // Retrun false for 0 and 1
        if ( number == 0 || number == 1 ) {
            return false;
        }
        
        // Iterate through half of the number looking for divisors
        for ( int i = 2; i <= middle; i++ ) {
            
            // Divisor check. Remainder of zero means not prime.
            if ( number % i == 0) {
                return false;
            }
        }
        
        // No reason found for the number not to be prime so by default it is a prime number
        return true;
    }
    
    private static Boolean isPalindrome(int number) {
        
        // Initialize variables
        String s = String.valueOf(number); // Creates a string 's' out of the arg number
        String r = new StringBuffer(s).reverse().toString(); // Reverses the string we just created into 'r'
        
        // Is forwards the same as reversed??
        if ( s.compareTo(r) == 0 ) {
            return true;
        }
        else {
            return false;
        }
    }

    private static Boolean isPalindrome(String s) {
        
        String r = new StringBuffer(s).reverse().toString(); // Reverse the arg s into 'r'
        
        // Is forwards the same as reversed??
        if ( s.compareTo(r) == 0 ) {
            return true;
        }
        else {
            return false;
        }
    }
            
    private static void displayNumber(int position, int number) {
        
        // Display number in tab stop 1-5
        switch ( position % 5 ) {
            case 1: System.out.print(number);
                    break;
            case 2: System.out.print("\t" + number);
                    break;
            case 3: System.out.print("\t" + number);
                    break;
            case 4: System.out.print("\t" + number);
                    break;
            case 0: System.out.println("\t" + number);
                    break;
        }
    }

}
