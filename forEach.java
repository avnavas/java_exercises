public class forEach {

    public static void main(String[] args) {

        //array de tipo string
        // recorrer esa matriz con bucle for each
        // rellenar matriz con un joption pane

        String [] nombrePaises = new String [5];

       nombrePaises  [0] = "españa";
       nombrePaises  [1] = "francia";
       nombrePaises  [2] = "alemania";
       nombrePaises  [3] = "holanda";
       nombrePaises  [4] = "rusia";

        for (String i: nombrePaises){
            System.out.println(i);
        }


    }
}
