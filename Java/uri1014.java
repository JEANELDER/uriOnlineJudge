import java.util.Scanner;
class uri1014{
  public static void main(String[] args) {
    int x;
    double y,consumo;
      Scanner entrada = new Scanner(System.in);
      x = entrada.nextInt();
      y = entrada.nextDouble();
      consumo=x/y;
      System.out.printf("%.3f",consumo);
      System.out.println(" km/l");
  }
}