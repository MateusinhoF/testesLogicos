public class fibonacci {
    
    public static void main(String[] args) {
    
        long a1 = 0;
        long a2 = 1;
        long aux = 0;

        for(int x = 0; x <= 100;x++){

            System.out.println(a1);

            aux = a1+a2;
            a2 = a1;
            a1 = aux;

        }
        
    }

}
