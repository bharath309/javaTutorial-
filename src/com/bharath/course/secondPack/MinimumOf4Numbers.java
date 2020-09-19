package com.bharath.course.secondPack;

import com.bharath.course.FindPrimeNumbers;

public class MinimumOf4Numbers extends FindPrimeNumbers{
    public static void main(String args[]) {

        String abc[]={"123","2345"};

        Integer ina[]={4,2,1,3};
        int firstNumber=100;
        float fistFloat=100.144f;
        System.out.println(firstNumber);
        System.out.println(fistFloat);

        int minVal=ina[0];
        for(int i=1;i<=ina.length-1;i++){
            if(ina[i]<minVal){
                minVal=ina[i];
            }
        }
        System.out.println(minVal);
    }
    public void some(){
        FindPrimeNumbers prime=new FindPrimeNumbers();
//        getPrimeNumbers();
    }
}
