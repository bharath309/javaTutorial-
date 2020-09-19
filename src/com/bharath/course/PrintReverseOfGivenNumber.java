package com.bharath.course;

public class PrintReverseOfGivenNumber {
    public static void main(String args[]) {
        int value=1245466;
        int reverseValue=0;
        while(value>0){
            reverseValue=reverseValue*10+value%10;
            value=value/10;
        }
        System.out.println(reverseValue);
    }
}
