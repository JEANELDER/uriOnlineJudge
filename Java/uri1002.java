import java.util.Scanner;
class uri1002 {
  public static void main(String[] args) {
    double n=3.14159;
    double raio, area;
    Scanner entrada = new Scanner(System.in);
    raio = entrada.nextDouble();
    area = n*Math.pow(raio,2);
    System.out.printf("A=%.4f%n",area);
  }
}