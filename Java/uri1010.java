import java.util.Scanner;
class uri1010{
  public static void main(String[] args) {
    int codPeca,nroPeca;
    double vlrPeca,vlrTotal;
    Scanner entrada = new Scanner(System.in);
    vlrTotal = 0;
    for(int i=1;i<=2;i++){
      codPeca = entrada.nextInt();
      nroPeca = entrada.nextInt();
      vlrPeca = entrada.nextDouble();
      vlrTotal = vlrTotal+nroPeca*vlrPeca;
    }
    System.out.printf("VALOR A PAGAR: R$ %.2f%n",vlrTotal);
  }
}