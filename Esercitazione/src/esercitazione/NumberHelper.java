/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercitazione;

/**
 *
 * @author informatica
 */
public class NumberHelper {

    private int number;

    public NumberHelper(int n) {
        number = n;
    }

    public boolean isEven() {

        if(number==0){
        
        return false;
        }
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public boolean isOdd() {

        if(number==0){
        
        return false;
        }
        if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public int sum(int n) {

        int somma;

        somma = number + n;
        return somma;
    }

    public boolean isPrime() {

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {

                return false;
            } 
               if(number<2){
               
                   return true;
               }
                   
        }

        return true;
    }

    
    public boolean isDivisibleBy(int n) {

        if (number % n == 0) {

            return true;
        } else {
            return false;
        }

    }

}
