public class Odev29 {

    public static void main(String[] args) {

        for (int i=1;i<=100;i++) {
            int kontrol=0;
            for (int j = 1; j <= i; j++) {
                if ( i % j != 0) {
                    kontrol++;
                }
            }
            if(kontrol== i-2){
                System.out.print(i+" ");
            }
        }
    }
}