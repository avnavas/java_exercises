public class arrayBidimensional {

    public static void main(String[] args) {

        int [][] arrayBi = new int [4][5];

        for (int i = 0; i < 4 ; i++) {

            for (int j = 0; j < 5; j++) {
                arrayBi[i][j]= (int)(Math.random()*100);
            }
        }


        // como ponerlo con la longitud del array ????

        for(int [] fila:arrayBi){
            System.out.println();
            for(int z: fila){
                System.out.println(z + "");
            }











        }



    }
}
