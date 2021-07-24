import javax.swing.plaf.basic.BasicDesktopIconUI;
import java.util.Scanner;

//multiplicate for two dates with for and while

public class multby2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("cuanto numero quieres procesar?");
        int cantidad = entrada.nextInt();

        System.out.printf("ingresa %d datos: \n", cantidad );

        //with for
//        for (int i = 1; i <= cantidad; i++) {
//
//            System.out.printf("dato %d \n", i);
//            int num = entrada.nextInt();
//            int resultado = num * 2;
//            System.out.printf("dato %d procesado, resultado es %d \n",i, resultado);
//        }
//    }


//      with while
        int c = 1;
        while(c <= cantidad){
            System.out.printf("dato %d: \n", c);
            int num = entrada.nextInt();
            int resultado = num * 2;
            System.out.printf("dato %d procesado, resultado es %d \n",c, resultado);
            c++;
        }




    }
}


