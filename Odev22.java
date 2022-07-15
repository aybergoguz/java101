import java.util.Scanner;

public class Odev22{

    public static void main(String[] args) {

        
        Scanner scanner =new Scanner(System.in);
        System.out.println("Sayiyi Giriniz : ");
        double n=scanner.nextInt();
        double harmonikSayiToplami= 0.0;
       
        for (double i=1;i<=n;i++){
            harmonikSayiToplami += (1/i);
            System.out.println(harmonikSayiToplami);
        }
        System.out.println(harmonikSayiToplami);
    }
}