import java.util.Scanner;
class uri1017{
  public static void main(String[] args) {
    // Consumo de 12 Km/l
    double consumo=12;
    double tempo,velocidade,distancia,litros;
    Scanner entrada = new Scanner(System.in);
    tempo = entrada.nextDouble();
    velocidade = entrada.nextDouble();
    distancia = tempo*velocidade;
    litros = distancia/consumo;
    System.out.printf("%.3f%n",litros);
  }
}