public class ordenador {
    
    public static void main(String args[]) {
        
        int[] arrayX = {15,100,50,87,165,32148,6231,648,30,98,23};

        int min = arrayX[0];
        int aux = arrayX[0];

        for(int x = 0; x < arrayX.length; x++){

            //insere o valor substituido pelo minimo no lugar onde estiver o valor minimo
            for(int y = x; y < arrayX.length; y++){
                if(arrayX[y]==min){
                    arrayX[y]=aux;
                }
            }

            //pega o valor minimo
            min = arrayX[x];
            for(int z = x; z < arrayX.length; z++){
                if(arrayX[z]<min){
                    min = arrayX[z];
                }
            }


            aux = arrayX[x];
            arrayX[x] = min;

            for (int i : arrayX) {
                System.out.print(i + " ");
            }

            System.out.println("\nAuxiliar - "+aux);
            System.out.println("Posicao do array - "+arrayX[x]);
            System.out.println("Minimo - "+min);
        }

        for (int i : arrayX) {
            System.out.print(i + " ");
        }

    }

}
