package com.math;


@FunctionalInterface
interface MathFunction{
    public int Calculate(int a, int b);

    static void printResult(int a, int b, String Function, MathFunction fobj){
        System.out.println("Result of"+Function+" is "+fobj.Calculate(a, b));
    }
}
public class MathOperation {

    public static void main(String[] args) {

        MathFunction add = (a,b) -> a+b;
        MathFunction subtraction = (a,b) -> a-b;
        MathFunction multiply = (a,b) -> a*b;
        MathFunction division = (a,b) -> a/b;

        System.out.println("Addition of two numbers="+add.Calculate(6,3));
        System.out.println("Subtraction of two numbers="+subtraction.Calculate(6,3));
        System.out.println("Addition of two numbers="+multiply.Calculate(6,3));
        System.out.println("Addition of two numbers="+division.Calculate(6,3));

        //passing lambda expression as function parameter to print result using static function
        MathFunction.printResult(6,3,"Addition",add);
        MathFunction.printResult(6,3,"Subtraction",subtraction);
        MathFunction.printResult(6,3,"Multiplication",multiply);
        MathFunction.printResult(6,3,"Division",division);
    }
}
