int maxProductSubset(int a[], int n) 
{ 
    if (n == 1) 
        return a[0]; 
  
    // Find count of negative numbers, count  
    // of zeros, maximum valued negative number 
    // and product of non-zero numbers 
    int max_neg = INT_MIN; 
    int count_neg = 0, count_zero = 0; 
    int prod = 1; 
    for (int i = 0; i < n; i++) { 
  
        // If number is 0, we don't 
        // multiply it with product. 
        if (a[i] == 0) { 
            count_zero++; 
            continue; 
        } 
  
        // Count negatives and keep 
        // track of maximum valued negative. 
        if (a[i] < 0) { 
            count_neg++; 
            max_neg = max(max_neg, a[i]); 
        } 
  
        prod = prod * a[i]; 
    } 
  
    // If there are all zeros 
    if (count_zero == n) 
        return 0; 
  
    // If there are odd number of 
    // negative numbers 
    if (count_neg & 1) { 
  
        // Exceptional case: There is only 
        // negative and all other are zeros 
        if (count_neg == 1 &&  
            count_zero > 0 &&  
            count_zero + count_neg == n) 
            return 0; 
  
        // Otherwise result is product of  
        // all non-zeros divided by maximum 
        // valued negative. 
        prod = prod / max_neg; 
    } 
  
    return prod; 
} 

/*
int minproduct(int a[], int b[], int n, int k) 
{ 
    int diff = 0, res = 0; 
    int temp; 
    for (int i = 0; i < n; i++) { 
  
        // Find product of current elements and update 
        // result. 
        int pro = a[i] * b[i]; 
        res = res + pro; 
  
        // If both product and b[i] are negative, 
        // we must increase value of a[i] to minimize 
        // result. 
        if (pro < 0 && b[i] < 0) 
            temp = (a[i] + 2 * k) * b[i]; 
  
        // If both product and a[i] are negative, 
        // we must decrease value of a[i] to minimize 
        // result. 
        else if (pro < 0 && a[i] < 0) 
            temp = (a[i] - 2 * k) * b[i]; 
  
        // Similar to above two cases for positive 
        // product. 
        else if (pro > 0 && a[i] < 0) 
            temp = (a[i] + 2 * k) * b[i]; 
        else if (pro > 0 && a[i] > 0) 
            temp = (a[i] - 2 * k) * b[i]; 
  
        // Check if current difference becomes higher 
        // than the maximum difference so far. 
        int d = abs(pro - temp); 
        if (d > diff) 
            diff = d;         
    } 
  
    return res - diff; 
} */