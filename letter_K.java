/*Programa em Java que efetua a leitura de um determinado valor inteiro, e efetua a sua apresentação, caso o valor não seja maior que três. */

import java.util.Scanner;

class letter_K{
  public static void main(){

    Scanner keyboard = new Scanner(System.in);
    int value;

    System.out.print("Informe um valor inteiro qualquer: ");
    value = keyboard.nextInt();

    if (value <=3){
      System.out.print("O valor " + value + " pode ser apresentado");
    }
    else{
      System.out.print("O valor não pode ser apresentado");
    }

  }
}