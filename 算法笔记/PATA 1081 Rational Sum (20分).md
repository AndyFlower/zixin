Given *N* rational numbers in the form `numerator/denominator`, you are supposed to calculate their sum.

### Input Specification:

Each input file contains one test case. Each case starts with a positive integer *N* (≤100), followed in the next line *N* rational numbers `a1/b1 a2/b2 ...` where all the numerators and denominators are in the range of **long int**. If there is a negative number, then the sign must appear in front of the numerator.

### Output Specification:

For each test case, output the sum in the simplest form `integer numerator/denominator` where `integer` is the integer part of the sum, `numerator` < `denominator`, and the numerator and the denominator have no common factor. You must output only the fractional part if the integer part is 0.

### Sample Input 1:

```in
5
2/5 4/15 1/30 -2/60 8/3

      
    
```

### Sample Output 1:

```out
3 1/3

      
    
```

### Sample Input 2:

```in
2
4/3 2/3

      
    
```

### Sample Output 2:

```out
2

      
    
```

### Sample Input 3:

```in
3
1/3 -1/6 1/8

      
    
```

### Sample Output 3:

```out
7/24

      
    
```

作者: CHEN, Yue

单位: 浙江大学

时间限制: 400 ms

内存限制: 64 MB