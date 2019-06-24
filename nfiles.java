import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class exp_sq { 
    static long N = 1000000007L; // prime modulo value 
    public static void main(String[] args) 
    { 
        long base = 5; 
        long exp = 100000; 
  
        long modulo = exponentiation(base, exp); 
        System.out.println(modulo); 
    } 
  
    static long exponentiation(long base, long exp) 
    { 
        long t = 1L; 
        while (exp > 0) { 
  
            // for cases where exponent 
            // is not an even value 
            if (exp % 2 != 0) 
                t = (t * base) % N; 
  
            base = (base * base) % N; 
            exp /= 2; 
        } 
        return t % N; 
    } 
} 
/**********************************************************************************************************************
/*ans(n) = n + (0.5+sqrt(n)) .

// Iterative C program to compute modular power 
#include <stdio.h> 
  
/* Iterative Function to calculate (x^y)%p in O(log y) 
int power(int x, unsigned int y, int p) 
{ 
    int res = 1;      // Initialize result 
  
    x = x % p;  // Update x if it is more than or  
                // equal to p 
  
    while (y > 0) 
    { 
        // If y is odd, multiply x with result 
        if (y & 1) 
            res = (res*x) % p; 
  
        // y must be even now 
        y = y>>1; // y = y/2 
        x = (x*x) % p;   
    } 
    return res; 
} 
  
// Driver program to test above functions 
int main() 
{ 
   int x = 2; 
   int y = 5; 
   int p = 13; 
   printf("Power is %u", power(x, y, p)); 
   return 0; 
}
***************************************************************************************************
int modInverse(int a, int m) 
{ 
    int m0 = m; 
    int y = 0, x = 1; 
  
    if (m == 1) 
      return 0; 
  
    while (a > 1) 
    { 
        // q is quotient 
        int q = a / m; 
        int t = m; 
  
        // m is remainder now, process same as 
        // Euclid's algo 
        m = a % m, a = t; 
        t = y; 
  
        // Update y and x 
        y = x - q * y; 
        x = t; 
    } 
  
    // Make x positive 
    if (x < 0) 
       x += m0; 
  
    return x; 
} 
  
// Driver program to test above function 
int main() 
{ 
    int a = 3, m = 11; 
  
    printf("Modular multiplicative inverse is %d\n", 
          modInverse(a, m)); 
    return 0; 
} *************************************************************

// CPP program to check if given n is 
// k-rough or not. 
# include <bits/stdc++.h> 
using namespace std; 
  
// Returns true if n is k rough else false 
bool isKRough(int n, int k) 
{ 
    // If n is even, then smallest prime 
    // factor becomes 2. 
    if (n % 2 == 0) 
        return (k <= 2); 
  
    // n must be odd at this point.  So we 
    // can skip one element (Note i = i +2) 
    for (int i = 3; i*i <= n; i = i+2) 
        if (n%i == 0) 
            return (i >= k); 
  
   return (n >= k); 
} 
  
/* Driver program to test above function 
int main() 
{ 
    int n = 75, k = 3; 
    if (isKRough(n, k)) 
        cout << n << " is a "
             << k << "-rough number\n"; 
    else
        cout << n << " is not a "
             << k << "-rough number\n"; 
    return 0; 
}

*************
# Python program to print Stormer numbers 
  
from __future__ import print_function 
  
# Function to find largest prime factor 
  
def maxPrimeFactors(n): 
    # Initialize the maximum prime factor 
    # variable with the lowest one 
    maxPrime = -1
  
    # Print the number of 2's that divide n 
    while n % 2 == 0: 
        maxPrime = 2
        n /= 2
  
    # n must be odd at this point, thus skip 
    # the even numbers and iterate only for 
    # odd integers 
    for i in range(3, int(n**0.5)+1, 2): 
        while n % i == 0: 
            maxPrime = i 
            n /= i 
  
    # This condition is to handle the case when 
    # n is a prime number greater than 2 
    if n > 2: 
        maxPrime = n 
  
    return int(maxPrime) 
  
# Function to generate Stormer Numbers 
  
def stormer(n): 
    i = 1
    # Stores the number of Stormer numbers found 
    count = 0
    while(count < n): 
        t = i * i + 1
        if maxPrimeFactors(t) >= 2 * i: 
            print(i, end =' ') 
            count += 1
        i += 1
  
# Driver Method 
  
if __name__=='__main__': 
    n = 10
    stormer(n) 
 */

