import javax.swing.*;
import java.util.Scanner;

/*
que pregunte si eres hombre o mujer
que pregunte los datos
    altura
    peso

te diga cuantos kilos te sobran
    hombre peso ideal altura - 10kg
    mujer peso ideal altura - 10kg

desarrolla el calculo
    180-(100+10) = kg
*/

public class calculatorWeight {
    public static void main(String[] args) {

        String sexo;

        do{
            sexo = JOptionPane.showInputDialog("introduce tu sexo (h/m)");
        }
        while(sexo.equalsIgnoreCase("h")== false && sexo.equalsIgnoreCase("M")== false);

        int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm"));

        int peso = Integer.parseInt(JOptionPane.showInputDialog("tu peso"));

        System.out.println(sexo);



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
