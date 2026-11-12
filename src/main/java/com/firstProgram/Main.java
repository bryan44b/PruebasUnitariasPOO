package com.firstProgram;

public class Main {
    public static void main(String[] args){
        Calculadora calc = new Calculadora();
        int[] numeros = {5, 2, 3, 0, 0, 4};

        System.out.println("nose: " + calc.numZero(numeros));
    }
}