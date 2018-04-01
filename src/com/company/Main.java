package com.company;

public class Main {

    public static void main(String[] args) {
    int[ ] array = new int [12];
    int max = 0; int maxInd = 0;

        for (int i = 0; i <array.length ; i++) {
            array[i] =  (int)(Math.round(Math.random()*30-15));
            System.out.print(array[i] + " ");
            if(i ==0){
                max = array[i];
                maxInd=i;
                }
                if (i>1 && array[i]>max){
                max=array[i];
                maxInd=i;

            }
            
        }
        System.out.println("\nmax= "+ max +" index=" + maxInd);
    }
}
