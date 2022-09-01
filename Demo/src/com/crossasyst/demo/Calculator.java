package com.crossasyst.demo;
/* Lambda Expression
    () -> {body};   syntax

 */

public interface Calculator {
//    void switchOn();
  //  void sum(int input);
    int substract(int i1,int i2);
}
class CalculatorImpl {

    public static void main(String[] args) {
//      Calculator calculator = () -> System.out.println("Switch on");
//      calculator.switchOn();

//        Calculator calculator = (input) -> System.out.println("sum :"+input);
//        calculator.sum(304);

        Calculator calculator =(i1, i2) -> {
            return i2-i1;
        };
        System.out.println(calculator.substract(2,10) );
    }



}
