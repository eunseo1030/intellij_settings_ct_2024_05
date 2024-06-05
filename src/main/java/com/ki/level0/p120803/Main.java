package com.ki.level0.p120803;

public class Main {
    public static void main(String[] args){
        System.out.println(new Solution().solution(3,27));
        System.out.println(new Solution().solution(3,2));
        System.out.println(new Solution().solution(-1,98));

    }
}
 class Solution{
    static int solution(int num1 , int num2){
      return num1-num2;
    }
 }
