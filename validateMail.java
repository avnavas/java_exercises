import javax.swing.*;

// para validar un mail podemos hacerlo de la siguiente forma
//tiene que tener solo 1 @
//tiene que tener al menos 1 punto

public class validateMail {
    public static void main(String[] args) {

        int arroba = 0;
        boolean punto = false;

        String email = JOptionPane.showInputDialog("introduce el email");

        //validar email, vamos a buscar la @ y el punto con un bucle caracter a caracter
        for (int i = 0; i < email.length() ; i++) {

            if (email.charAt(i) == '@') {
                arroba++;
            }
            
            if (email.charAt(i) == '.') {
                punto = true;
            }
        }

        if (arroba == 1 && punto == true) {
            System.out.println("el mail es correcto");
        }
        else{
            System.out.println("el mail no es correcto");
        }

    }

}
