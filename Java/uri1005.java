import java.util.Scanner;
class uri1005{
  public static void main(String[] args) {
    double A,B,media;
    Scanner entrada = new Scanner(System.in);
    A = entrada.nextDouble();
    B = entrada.nextDouble();
    media = (A*3.5 + B*7.5)/11;
    System.out.printf("MEDIA = %.5f%n",media);
  }
}