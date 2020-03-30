**1042** **Shuffling Machine** (20分)

Shuffling is a procedure used to randomize a deck of playing cards. Because standard shuffling techniques are seen as weak, and in order to avoid "inside jobs" where employees collaborate with gamblers by performing inadequate shuffles, many casinos employ **automatic shuffling machines**. Your task is to simulate a shuffling machine.

The machine shuffles a deck of 54 cards according to a given random order and repeats for a given number of times. It is assumed that the initial status of a card deck is in the following order:

```
S1, S2, ..., S13, 
H1, H2, ..., H13, 
C1, C2, ..., C13, 
D1, D2, ..., D13, 
J1, J2

      
    
```

where "S" stands for "Spade", "H" for "Heart", "C" for "Club", "D" for "Diamond", and "J" for "Joker". A given order is a permutation of distinct integers in [1, 54]. If the number at the *i*-th position is *j*, it means to move the card from position *i* to position *j*. For example, suppose we only have 5 cards: S3, H5, C1, D13 and J2. Given a shuffling order {4, 2, 5, 3, 1}, the result will be: J2, H5, D13, S3, C1. If we are to repeat the shuffling again, the result will be: C1, H5, S3, J2, D13.

### Input Specification:

Each input file contains one test case. For each case, the first line contains a positive integer *K* (≤20) which is the number of repeat times. Then the next line contains the given order. All the numbers in a line are separated by a space.

### Output Specification:

For each test case, print the shuffling results in one line. All the cards are separated by a space, and there must be no extra space at the end of the line.

### Sample Input:

```in
2
36 52 37 38 3 39 40 53 54 41 11 12 13 42 43 44 2 4 23 24 25 26 27 6 7 8 48 49 50 51 9 10 14 15 16 5 17 18 19 1 20 21 22 28 29 30 31 32 33 34 35 45 46 47

      
    
```

### Sample Output:

```out
S7 C11 C10 C12 S1 H7 H8 H9 D8 D9 S11 S12 S13 D10 D11 D12 S3 S4 S6 S10 H1 H2 C13 D2 D3 D4 H6 H3 D13 J1 J2 C1 C2 C3 C4 D1 S5 H5 H11 H12 C6 C7 C8 C9 S2 S8 S9 H10 D5 D6 D7 H4 H13 C5
```

题意：

有54张牌，编号为1·54，初始按编号从小到大排列，另外，这些牌按初始排列给的花色，即从左往右分别为13张S  13张 H 13张C 13张D 2张J，如下所示：

S1, S2, ..., S13, 
H1, H2, ..., H13, 
C1, C2, ..., C13, 
D1, D2, ..., D13, 
J1, J2接下来执行一种操作，这种操作将牌的位置改变为指定的位置，例如有5张牌S3 H5 C1 D13  J2	,然后给定操作序列 {4 2 5 3 1}即把S3方法哦4号位，把H5放到2号位 C1放到5号位，D13放到3号位  J2放到1号位 变成 J2 H5 D13 S3 C1 

需要将这种操作执行K此，求最后的排列结构

### 思路

题目直接给了每个位置上的牌在操作后的位置，所以不妨设置2个数组，start[] 和end[]  分别用来存放操作前的牌序和执行操作后的牌序，这样在每一次操作中就可以把数组start[]中的每一个位置的牌号存放到数组end[]的对应转换位置中，然后用数组end[]覆盖start[]来给下一次操作使用，这样执行K次后，数组start[]中即存放了最终的顺序。

使用char型数组 {S H C D J}来建立编号与花色的关系，假设牌号为X 那么map[(x-1)/13]为花色，而（x-1）%13+1即为他所在花色下的编号



