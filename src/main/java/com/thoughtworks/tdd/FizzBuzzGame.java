package com.thoughtworks.tdd;

public class FizzBuzzGame {

    public FizzBuzzGame(){}

    public String fizzBuzz(int num){

        if (isMultiple(num, 3)){
            return sayFizz();
        } else if (isMultiple(num, 5)) {
            return sayBuzz();
        } else if (isMultiple(num, 7)) {
            return sayWhizz();
        } else if (isMultiple(num, 3) && isMultiple(num, 5)) {
            return sayFizzBuzz();
        } else if (isMultiple(num, 3) && isMultiple(num, 7)) {
            return sayFizzWhizz();
        } else if (isMultiple(num, 5) && isMultiple(num, 7)) {
            return sayBuzzWhizz();
        } else if (isMultiple(num, 3) && isMultiple(num, 5) && isMultiple(num, 7)) {
            return sayFizzBuzzWhizz();
        }

        return num + "";
    }



    private String sayFizz(){
        return "Fizz";
    }

    private String sayBuzz(){
        return "Buzz";
    }

    private String sayWhizz(){
        return "Whizz";
    }

    private String sayFizzBuzz() {
        return "FizzBuzz";
    }

    private String sayFizzWhizz() {
        return "FizzWhizz";
    }

    private String sayBuzzWhizz() {
        return "FizzBuzz";
    }

    private String sayFizzBuzzWhizz(){
        return "FizzBuzzWhizz";
    }

    private boolean isMultiple(int num, int divisor){
        return num % divisor == 0;
    }
}
