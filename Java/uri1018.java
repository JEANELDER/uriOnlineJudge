import java.util.Scanner;
class uri1018{
  public static void main(String[] args) {
    double valor;
    int cedulas;
    Scanner entrada = new Scanner(System.in);
    valor = entrada.nextDouble();
    System.out.printf("%.0f%n",valor);
    if(valor>=100){
      cedulas=(int)(valor/100);
      System.out.println(cedulas+" nota(s) de R$ 100,00");
      valor = valor%100;
    }
    else{
      System.out.println("0 nota(s) de R$ 100,00");
    }
    if(valor>=50){
      cedulas=(int)(valor/50);
      System.out.println(cedulas+" nota(s) de R$ 50,00");
      valor = valor%50;
    }
    else{
      System.out.println("0 nota(s) de R$ 50,00");
    }
    if(valor>=20){
      cedulas=(int)(valor/20);
      System.out.println(cedulas+" nota(s) de R$ 20,00");
      valor = valor%20;
    }
    else{
      System.out.println("0 nota(s) de R$ 20,00");
    }
    if(valor>=10){
      cedulas=(int)(valor/10);
      System.out.println(cedulas+" nota(s) de R$ 10,00");
      valor = valor%10;
    }
    else{
      System.out.println("0 nota(s) de R$ 10,00");
    }
    if(valor>=5){
      cedulas=(int)(valor/5);
      System.out.println(cedulas+" nota(s) de R$ 5,00");
      valor = valor%5;
    }
    else{
      System.out.println("0 nota(s) de R$ 5,00");
    }
    if(valor>=2){
      cedulas=(int)(valor/2);
      System.out.println(cedulas+" nota(s) de R$ 2,00");
      valor = valor%2;
    }
    else{
      System.out.println("0 nota(s) de R$ 2,00");
    }
    if(valor==1){
      System.out.println("1 nota(s) de R$ 1,00");
    }
    else{
      System.out.println("0 nota(s) de R$ 1,00");
    }
  }
}