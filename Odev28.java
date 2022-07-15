import java.util.Scanner;

public class Odev28 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Satir Sayısı Giriniz:");
        int sayi=scanner.nextInt();

        for (int i=sayi; i >0 ; i--){

            for (int k=sayi-i; k>0; k--){
                System.out.print(" ");
            }

            for (int j=(2*i)-1; j>0; j--){
                System.out.print("*");
            }

            System.out.println(" ");
        }
    }
}