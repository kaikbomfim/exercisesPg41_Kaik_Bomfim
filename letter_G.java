/*Programa em Java que efetua a leitura de quatro números inteiros e apresenta os números que são divisíveis por 2 e 3.*/

import java.util.Scanner;

class letter_G{
  public static void main(){

    Scanner keyboard = new Scanner(System.in);
    int value1, value2, value3, value4;

    System.out.print("Informe o primeiro valor inteiro: ");
    value1 = keyboard.nextInt();

    System.out.print("Informe o segundo valor inteiro: ");
    value2 = keyboard.nextInt();

    System.out.print("Informe o terceiro valor inteiro: ");
    value3 = keyboard.nextInt();

    System.out.print("Informe o quarto valor inteiro: ");
    value4 = keyboard.nextInt();

    if ((value1 % 2 == 0) && (value1 % 3 == 0)){
      System.out.println("\n" + value1 + " é divisível por 2 e 3.");
    }
    else{
      System.out.println("\n" + value1 + " não é divisível por 2 e 3.");
    }
    if ((value2 % 2 == 0) && (value2 % 3 == 0)){
      System.out.println(value2 + " é divisível por 2 e 3.");
    }
    else{
      System.out.println(value2 + " não é divisível por 2 e 3.");
    }
    if ((value3 % 2 == 0) && (value3 % 3 == 0)){
      System.out.println(value3 + " é divisível por 2 e 3.");
    }
    else{
      System.out.println(value3 + " não é divisível por 2 e 3.");
    }
    if ((value4 % 2 == 0) && (value4 % 3 == 0)){
      System.out.println(value4 + " é divisível por 2 e 3.");
    }
    else{
      System.out.println(value4 + " não é divisível por 2 e 3.");
    }     
  }
}