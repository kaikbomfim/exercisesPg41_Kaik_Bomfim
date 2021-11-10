/*Programa em Java que efetua a leitura de um valor inteiro positivo ou negativo e apresenta o número lido como sendo um valor positivo, ou seja, o programa apresentará o módulo de um número fornecido. O programa deve verificar se o número fornecido é menor que zero; sendo, multiplicará ele por -1.*/

import java.util.Scanner;

class letter_B{
  public static void main(){
    
    Scanner keyboard = new Scanner(System.in);

    int value, module;

    System.out.print("Informe um valor inteiro (positivo ou negativo): ");
    value = keyboard.nextInt();

    if (value < 0){
      module = (value * (-1));
      System.out.print("O módulo de " + value  + " é: " + "|" + module + "|");
    }
    else{
      System.out.print("O módulo de " + value + " é o próprio valor " + value);
    }


    
  }
}