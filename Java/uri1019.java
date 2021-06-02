import java.util.Scanner;
class uri1019{
  public static void main(String[] args) {
    double segundos,minutos,horas;
    Scanner entrada = new Scanner(System.in);
    segundos = entrada.nextDouble();
    if(segundos>60){
      minutos = (int)segundos/60;
      segundos = segundos%60;
      if(minutos>60){
        horas = (int)minutos/60;
        minutos=minutos%60;
        segundos=int(segundos);
        System.out.println(horas+":"+minutos+":"+segundos);
      }
      else{
        System.out.println("0:"+minutos+":"+segundos);
      }
    }
    else{
      System.out.println("0:0:"+segundos);
    }
  }
}