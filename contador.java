public class contador{
    public static void main(String args[]) {
        
        for(int t = 0; t <= 100; t++){
            if(t%3==0 && t%5==0){
                System.out.println(t + " - BuzzFizz");
                continue;
            }else if(t%5==0){
                System.out.println(t + " - Fizz");
            }else if(t%5==0){
                System.out.println(t + " - Buzz");
            }else{
                System.out.println(t + " - " + t);
            }
        }
    }
}