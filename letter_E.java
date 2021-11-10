/*Programa em Java que efetua a leitura de três valores (variáveis A, B e C) e efetua o cálculo da equação completa de segundo grau, apresentando as duas raízes, se para os valores informados for possível efetuar o referido cálculo. Para os cálculos, é necessário que a variável A deve ser diferente de zero.*/

import static java.lang.Math.*;
import java.util.Scanner;

class letter_E{
  public static void main(){

    Scanner keyboard = new Scanner(System.in);

    double valueA, valueB, valueC, delta, root1, root2;

    System.out.print("Informe o valor da variável A: ");
    valueA = keyboard.nextDouble();
    
    System.out.print("Informe o valor da variável B: ");
    valueB = keyboard.nextDouble();
    
    System.out.print("Informe o valor da variável C: ");
    valueC = keyboard.nextDouble();
    
    if (valueA != 0){
      delta = (pow(valueB, 2) - (4 * valueA * valueC));
      if (delta < 0){
        System.out.print("Não existe raízes reais para a equação " + valueA + "x² " + valueB + "x " + valueC);
      }
      else{
        if (delta == 0){
          root1 = ((-valueB) + (sqrt(delta)))/(2 * valueA);
          System.out.print("A equação possui duas raízes iguais (x1 = x2), onde: " + "x1 = x2= " + root1);
        }
        else{
          root1 = ((-valueB) + (sqrt(delta)))/(2 * valueA);
          root2 = ((-valueB) - (sqrt(delta)))/(2 * valueA);
          System.out.print("As raízes da equação são: " + "x1 = " + root1 + " e x2 = " + root2); 
        }
      }
    }
  }
 }