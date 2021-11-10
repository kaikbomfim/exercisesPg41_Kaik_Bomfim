/*Programa em Java que lê dois valores numéricos inteiros e apresenta o resultado da diferença do maior pelo menor valor.*/

import java.util.Scanner;

class letter_A{
  public static void main(){
    
    Scanner keyboard = new Scanner(System.in);
    int valueA, valueB, larger, dif; 

    System.out.print("Informe o primeiro valor: ");
    valueA = keyboard.nextInt();

    System.out.print("Informe o segundo valor: ");
    valueB = keyboard.nextInt();

    larger = valueB;

    if (larger > valueA){
      dif = valueB - valueA;
      System.out.print("A diferença entre o maior e menor valor é: " + dif);
    }
    else{
      if (larger < valueA){
        dif = valueA - valueB;
        System.out.print("A diferença entre o maior e menor valor é: " + dif);
      }
      else{
        System.out.print("Não é possível efetuar a diferença entre o maior e menor valor, pois ambos são iguais.");
      }
    }

  }
}