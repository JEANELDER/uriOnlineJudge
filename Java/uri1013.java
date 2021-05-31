import java.util.Scanner;
class uri1013{
  public static void main(String[] args) {
    int a,b,c,maior;
      Scanner entrada = new Scanner(System.in);
      a = entrada.nextInt();
      b = entrada.nextInt();
      c = entrada.nextInt();
      maior=(a+b+Math.abs(a-b))/2;
      maior=(maior+c+Math.abs(maior-c))/2;

      System.out.println(maior+" eh o maior");
  }
}