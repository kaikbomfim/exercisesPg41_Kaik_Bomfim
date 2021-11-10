/*Programa em Java que efetua a leitura do nome e do sexo de uma pessoa, apresentando com saída uma das seguintes mensagens: "Ilmo Sr.", se o sexo informado como masculino, ou a mensagem "Ilma Sra.", para o sexo informado como feminino. Apresenta também junto da mensagem de saudação o nome previamente informado.*/

import java.util.Scanner;

class letter_L{
  public static void main(){

    Scanner keyboard = new Scanner(System.in);
    String name, genre;

    System.out.print("Informe o seu nome: ");
    name = keyboard.nextLine();

    System.out.print("Informe o seu sexo (masculino/feminino): ");
    genre = keyboard.nextLine();

    if (genre.equals("Masculino") || genre.equals("masculino") || genre.equals("MASCULINO")){
      System.out.print("Ilmo Sr. " + name);
    }
    else{
      if (genre.equals("Feminino") || genre.equals("feminino") || genre.equals("FEMININO")){
        System.out.print("Ilma Sra. " + name);
      }
      else{
        System.out.print("Sexo inválido. Informe o sexo novamente ");
      }
    }

  }
}