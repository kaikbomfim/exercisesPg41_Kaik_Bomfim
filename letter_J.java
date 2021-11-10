/*Programa em Java que efetua a leitura de um valor que esteja entre a faixa de 1 a 9. Após leitura do valor fornecido pelo usuário, o programa indicará uma de duas mensagens: "O valor está na faixa permitida", caso o usuário forneça o valor nesta faixa, ou a mensagem "O valor está fora da faixa permitida", caso o usuário forneça valores menores que 1 ou maiores que 9.*/

import java.util.Scanner;

class letter_J{
  public static void main(){

    Scanner keyboard = new Scanner(System.in);
    double value;

    System.out.print("Informe um valor na faixa de 1 a 9: ");
    value = keyboard.nextDouble();

    if (value >= 1.0 && value <= 9.0){
      System.out.print(value + " está na faixa permitida");
    }
    else{
      System.out.print(value + " está fora da faixa permitida: ");
    }

  }
}