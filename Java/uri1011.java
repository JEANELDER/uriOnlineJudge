import java.util.Scanner;
class uri1011{
  public static void main(String[] args) {
    double pi = 3.14159;
    double R,volume;
    Scanner entrada = new Scanner(System.in);
      R = entrada.nextDouble();
      volume = (4.0/3.0)*pi*Math.pow(R,3);
    System.out.printf("VOLUME = %.3f%n",volume);
  }
}