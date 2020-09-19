package com.bharath.course;

public class FindPrimeNumbers {
    public static void main(String args[]) {
        FindPrimeNumbers prime=new FindPrimeNumbers();
        prime.getPrimeNumbers();
    }
    void getPrimeNumbers(){
        for(int i=3;i<=100;i++){
            int otherReminder = 0;
            int evenReminder =0;
            for(int j=2;j<i;j++){
                int remainder=i%j;
                if(remainder==0){
                    evenReminder++;
                    break;
                }else{
                    otherReminder++;
                }
            }
            if(otherReminder>=1&&evenReminder==0){
                System.out.print(i+" ");
            }
        }
    }

}
