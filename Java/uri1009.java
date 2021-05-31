import java.util.Scanner;
class uri1009{
  public static void main(String[] args) {
    String nome;
    double salario,vendas,renda;
    Scanner entrada = new Scanner(System.in);
    nome = entrada.next();
    salario = entrada.nextDouble();
    vendas = entrada.nextDouble();
    renda = salario+vendas*0.15;
    System.out.printf("TOTAL = R$ %.2f%n",renda);
  }
}