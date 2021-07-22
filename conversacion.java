import java.util.Scanner;

public class conversacion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("cual es tu nombre");
        String nombre = entrada.nextLine();


        System.out.println("cual es tu edad");
        int edad = entrada.nextInt();

        System.out.println("cual es tu numero de telefono");
        int tlf = entrada.nextInt();

        System.out.printf("tu nombre es %s tu edad es %d y tu numero de telefono es %d", nombre, edad, tlf);


        







    }

}

