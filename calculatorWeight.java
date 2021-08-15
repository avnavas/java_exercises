import javax.swing.*;
import java.util.Scanner;

/*
ejercicio
que pregunte
    hombre o mujer
    altura
    peso

te diga cuantos kilos te sobran
    hombre peso ideal altura - 105kg
    mujer peso ideal altura - 110

*/

public class calculatorWeight {
    public static void main(String[] args) {

        String sexo;
        int altura;
        int peso;

        //recoleccion de datos
        do{
            sexo = JOptionPane.showInputDialog("introduce tu sexo (h/m)");
        }
        while(sexo.equalsIgnoreCase("h")== false && sexo.equalsIgnoreCase("M")== false);


        do{
            altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm"));
        }
        while(altura <50 || altura > 250 );


        do{
            peso = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm"));
        }
        while(peso <0 || peso > 500 );



        // resultado de operaciones
        if (sexo.equals("h")) {

            int pesoIdealHombre = altura - (100+5);
            int kilosSobran = peso - pesoIdealHombre;
            System.out.printf("tu peso ideal es %d, te sobran %d kilos", pesoIdealHombre, kilosSobran);

        } else if (sexo.equals("m")) {
            int pesoIdealMujer = altura - (100+10);
            int kilosSobran = peso - pesoIdealMujer;
            System.out.printf("tu peso ideal es %d, te sobran %d kilos", pesoIdealMujer, kilosSobran);

        } else {
            System.out.println("sexo introducido incorrecto");
        }








    }


}
