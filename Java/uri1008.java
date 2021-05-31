import java.util.Scanner;
class uri1008{
  public static void main(String[] args) {
    int nroFuncionario,nroHorasTrabalhadas;
    double valorPorHora,salario;
    Scanner entrada = new Scanner(System.in);
    nroFuncionario = entrada.nextInt();
    nroHorasTrabalhadas = entrada.nextInt();
    valorPorHora = entrada.nextDouble();
    salario = nroHorasTrabalhadas*valorPorHora;
    System.out.printf("NUMBER = %d%n",nroFuncionario);
    System.out.printf("SALARY = U$ %.2f%n",salario);
  }
}