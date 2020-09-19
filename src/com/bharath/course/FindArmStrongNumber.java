package com.bharath.course;

public class FindArmStrongNumber {
    public static void main(String args[]) {
        int startingValue;
        int endingValue=1000;

        for(startingValue=2;startingValue<=endingValue;startingValue++){
            int i=startingValue;
            int temp=i;
            int armStrongNumber=0;
            int valSize = 0;
            int j=i;
            while(j>0){
                j=j/10;
                valSize++;
            }
            while(i>0){
                armStrongNumber=i%10;
                i=i/10;
                armStrongNumber=armStrongNumber+(armStrongNumber*armStrongNumber*armStrongNumber);
            }
            if(temp==armStrongNumber){
                System.out.println(armStrongNumber);
            }
        }


    }
}
