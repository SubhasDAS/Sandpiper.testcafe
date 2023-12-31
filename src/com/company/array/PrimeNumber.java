package com.company.array;
import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        input.close();
        
        boolean isPrime = true;
        
        if(num < 2){
            isPrime = false;
        }
        else{
            for(int i=2; i<num-1; i++){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        
        if(isPrime){
            System.out.println(num + " is a prime number.");
        }
        else{
            System.out.println(num + " is not a prime number.");
        }
    }
}
