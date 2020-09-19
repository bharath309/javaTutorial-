package com.bharath.course;
// child class always inherits super class
public class PrintOddNumbersFrom1To100 extends FindPrimeNumbers {
    public static void main(String args[]) {
        for(int i=1;i<=100;i++){
            int remainder=i%2;
                    if(remainder==1){
                        System.out.print(i+" ");
                    }
        }
    }
    public void some(){
//        FindPrimeNumbers primeNumbers=new FindPrimeNumbers();
        getPrimeNumbers();
    }
}
