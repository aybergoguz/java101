import java.util.Scanner;

public class Odev16{

    public static void main(String[] args) {

        int n;
        int toplam=0;
        Scanner scanner =new Scanner(System.in);
        do{
            System.out.println("Sayi Giriniz : ");
            n=scanner.nextInt();
            if(n % 4 == 0){
                toplam=toplam+n;
            }
        } while(n % 2 == 0);
        System.out.println(toplam);
    }
}