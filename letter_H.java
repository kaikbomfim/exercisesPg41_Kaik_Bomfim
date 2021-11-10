/*Programa em Java que efetua a leitura de cinco números inteiros e identifica o maior e o menor valores.*/

import java.util.Scanner;

class letter_H{
  public static void main(){
    Scanner keyboard = new Scanner(System.in);

    int num1, num2, num3, num4, num5, larger, lower;

    System.out.print("Informe o primeiro número inteiro: ");
    num1 = keyboard.nextInt();
    
    lower = num1;

    System.out.print("Informe o segundo número inteiro: ");
    num2 = keyboard.nextInt();
    
    larger = num2;


    if (num2 < lower){
      lower = num2;
    }
    System.out.print("Informe o terceiro número inteiro: ");
    num3 = keyboard.nextInt();
    if (num3 < lower){
      lower = num3;
    }
    if (num3 > larger){
      larger = num3;
    }
    System.out.print("Informe o quarto número inteiro: ");
    num4 = keyboard.nextInt();
    if  (num4 < lower){
      lower = num4;
    }
    if (num4 > larger){
      larger = num4;
    }
    System.out.print("Informe o quinto número inteiro: ");
    num5 = keyboard.nextInt();
    if (num5 < lower){
      lower = num5;
    }
    if (num5 > larger){
      larger = num5;
    }
    if (num1 > larger){
      larger = num1;
    }
    System.out.print("\nO menor valor é: " + lower);
    System.out.print("\nO maior valor é: " + larger);
  }
}