/*Programa em Java que efetua a leitura de um número inteiro e apresenta uma mensagem informando se o número é par ou ímpar.*/

import java.util.Scanner;

class letter_I{
  public static void main(){

    Scanner keyboard = new Scanner(System.in);
    int number, rest; 

    System.out.print("Informe um número inteiro qualquer: ");
    number = keyboard.nextInt();

    rest = number % 2;
    
		if (rest == 0){
			System.out.print("O número " + number + " é par!");	
		}
		else{
			System.out.print("O número " + number + " é ímpar!");
		}
  }
}