// Abaixo segue um exemplo de código que você pode ou não utilizar

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AlbumDaCopa {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    int numTotal = scan.nextInt();
    if (numTotal < 1 || numTotal > 100) return;
    
    int numFigCompradas = scan.nextInt();
    if (numFigCompradas < 1 || numFigCompradas > 300) return;
    
    Set<Integer> setFig = new HashSet<>();
//TODO: Complete os espaços em branco com uma solução possível para o problema
    for (int i = 0; i < numFigCompradas; i++) {
      int fig = scan.nextInt();
      if (fig < 1 || fig > numTotal) return;
      setFig.add(fig);
    }
    System.out.println(numTotal - setFig.size());
  }
}