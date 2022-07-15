import java.util.Scanner;

public class Odev19{

    public static void main(String[] args) {

        int n,r;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Sayiyi Giriniz : ");
        n=scanner.nextInt();
        System.out.println("Sayinin Üssünü Giriniz : ");
        r=scanner.nextInt();

        int sayininUssu=1;
        for(int i=1;i<=r;i++){
           sayininUssu*=n;
        }
        
        System.out.println(n+" üzeri "+r+" = "+sayininUssu);
    }
}