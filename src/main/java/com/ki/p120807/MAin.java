package com.ki.p120807;

public class MAin {
    public static void main(String[] args) {
        System.out.println(new Solution().soluation(2, 3));
        System.out.println(new Solution().soluation(11, 11));
        System.out.println(new Solution().soluation(7, 99));
    }
}

class Solution {
    public int soluation(int num1, int num2) {
        if (num1 == num2) {
            return 1;
        }
        return -1;
    } }

