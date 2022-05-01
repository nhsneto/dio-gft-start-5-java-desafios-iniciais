// Abaixo segue um exemplo de código que você pode ou não utilizar
import java.util.Scanner;

public class CoxinhaDeBueno {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();

    String[] inputSplit = input.split(" ");
//TODO: Complete os espaços em branco com uma possível solução para o desafio
    double coxinhas = Double.parseDouble(inputSplit[0]);
    double participantes = Double.parseDouble(inputSplit[1]);
    
    if ((coxinhas < 1 || coxinhas > 1000) || (participantes < 1 || participantes > 1000))
      return;
    
    double media = coxinhas / participantes;

    System.out.printf("%.2f", media);
  }
}