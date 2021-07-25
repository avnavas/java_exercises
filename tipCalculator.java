import java.util.Scanner;

public class tipCalculator {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("esto es un calculador de propinas");
        System.out.println("ingresa la cantidad a pagar");
        double cantidad = entrada.nextDouble();
        System.out.println("ingresa el % de la propina");
        int porcentaje = entrada.nextInt();


        if (porcentaje <= 15){
            System.out.println("el servicio no fue muy bueno");
        } else if(porcentaje > 15 && porcentaje < 30){
            System.out.println("el servicio fue bueno");
        } else {
            System.out.println("el servicio fue excelente");
        }


        double totalPagar = (cantidad * porcentaje /100) + cantidad;
        System.out.printf("el total a pagar con propina es %.1f", totalPagar);



        


    }



}
