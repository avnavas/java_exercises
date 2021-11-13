import javax.swing.*;



public class introduceInformationArray {

    public static void main(String[] args) {

        //array de tipo string
        // recorrer esa matriz con bucle for each
        // rellenar matriz con un joption pane



        String [] paises = new String [5];

        for (int i = 0; i < paises.length; i++) {
            paises[i] = JOptionPane.showInputDialog("introduce el pais");

        }



        for (String i: paises){
            System.out.println(i);
        }


    }
}
