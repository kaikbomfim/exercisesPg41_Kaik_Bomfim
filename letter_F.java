/*Programa em Java que efetua a leitura de três valores (variáveis A, B e C) e os apresenta dispostos em ordem crescente.*/

import java.util.Scanner;

class letter_F{
  public static void main(){
    Scanner keyboard = new Scanner(System.in);

    double valueA, valueB, valueC;

    System.out.print("Informe o primeiro valor: ");
    valueA = keyboard.nextDouble();

    System.out.print("Informe o segundo valor: ");
    valueB = keyboard.nextDouble();

    System.out.print("Informe o terceiro valor: ");
    valueC = keyboard.nextDouble();

    if (valueA > valueB && valueB > valueC){
      System.out.print("Os valores em ordem crescente são: " + valueC + ", " + valueB + ", " + valueA);
    }
    else{
      if (valueA > valueC && valueC > valueB){
        System.out.print("Os valores em ordem crescente são: " + valueB + ", " + valueC + ", " + valueA);
      }
      else{
        if (valueB > valueC && valueC > valueA){
          System.out.print("Os valores em ordem crescente são: " + valueA + ", " + valueC + ", " + valueB);
        }
        else{
          if (valueB > valueA && valueA > valueC){
            System.out.print("Os valores em ordem crescente são: " + valueC + ", " + valueA + ", " + valueB);
          }
          else{
            if  (valueC > valueA && valueA > valueB){
              System.out.print("Os valores em ordem crescente são: " + valueB + ", " + valueA + ", " + valueC);
            }
            else{
              if (valueC > valueB && valueB > valueA){
                System.out.print("Os valores em ordem crescente são: " + valueA + ", " + valueB + ", " + valueC);
              }
            }
          }
        }
      }
    }
    
  }
}