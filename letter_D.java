/*Programa em Java que lê quatro valores referentes a quatro notas escolares de um aluno e imprime uma mensagem dizendo que o aluno foi aprovado, se o valor da média escolar for maior ou igual a 7. Se o valor da média for menor que 7, solicite a nota de exame, soma com o valor da média e obtem nova média. Se a nova média for maior ou igual a 5, apresenta uma mensagem dizendo que o aluno foi aprovado em exame. Se o aluno não foi aprovado, indica uma mensagem informando esta condição. Apresenta com as mensagens o valor da média do aluno, para qualquer condição.*/

import java.util.Scanner;

class letter_D{
  public static void main(){

    Scanner keyboard = new Scanner(System.in);

    double value1, value2, value3, value4, average, examNote, newAverage;

    System.out.print("Informe a nota do aluno(a) na 1ª unidade: ");
    value1 = keyboard.nextDouble();

    System.out.print("Informe a nota do aluno(a) na 2ª unidade: ");
    value2 = keyboard.nextDouble();

    System.out.print("Informe a nota do aluno(a) na 3ª unidade: ");
    value3 = keyboard.nextDouble();

    System.out.print("Informe a nota do aluno(a) na 4ª unidade: ");
    value4 = keyboard.nextDouble();

    average = (value1 + value2 + value3 + value4)/4;

    if (average >= 7){
      System.out.print("Aluno(a) aprovado(a) com média escolar: " + average);
    }
    else{
      System.out.print("====== RECUPERAÇÃO ======");
      System.out.print("\nInforme a nota de exame: ");
      examNote = keyboard.nextDouble();

      newAverage = (examNote + average)/2;
      if (newAverage >=5){
        System.out.print("Aluno(a) aprovado(a) em exame com média: " + newAverage);
      }
      else{
        System.out.print("Aluno(a) reprovado(a) em exame com média: " + newAverage);
      }

    }        
  }
}