import java.util.Scanner;
class Main {
  public static void uri1007(String[] args) {
    int A,B,C,D,diferenca;
    Scanner entrada = new Scanner(System.in);
    A = entrada.nextInt();
    B = entrada.nextInt();
    C = entrada.nextInt();
    D = entrada.nextInt();
    diferenca = A*B-C*D;
    System.out.printf("DIFERENCA = %d%n",diferenca);
  }
}