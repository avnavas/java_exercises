import java.util.Scanner;


public class adivinaNumero {
    public static void main(String[] args) {
 
        int aleatorio = (int)(Math.random()*100);

        System.out.println(aleatorio);

        Scanner entrada = new Scanner(System.in);

        int numero = 0;
        int intentos = 0;

        while(aleatorio != numero ){

            System.out.println("introduce un numero por favor");
            numero = entrada.nextInt();


            //consejos adivinar
            if (numero < aleatorio ) {
                System.out.println("mas alto");
            } else if (numero > aleatorio) {
                System.out.println("mas bajo");
            }

            intentos++;
            System.out.println("llevas " + intentos + " intentos");
            
        }
        System.out.println("has acertado");




















    }


}
