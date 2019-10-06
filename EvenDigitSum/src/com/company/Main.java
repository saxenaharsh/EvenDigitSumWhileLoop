package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        getEvenDigitSum(-22);
    }
    public static int  getEvenDigitSum(int number){
        if(number < 0){
            return -1;
        }
        int evenSum = 0;
        if ((number < 10) && (number % 2 == 0)){
            System.out.println(evenSum + number);
            return evenSum + number;
        }
        while(number > 0){
            int remainder = 0;
            remainder = number % 10;
            if(remainder % 2 == 0){
                evenSum = evenSum + remainder;
            }
            number /= 10;
        }
        return evenSum;
    }
}
