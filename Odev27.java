import java.util.Scanner;

public class Odev27{

    public static void main(String[] args) {

        
        Scanner scanner =new Scanner(System.in);
        System.out.println("Sayi Giriniz : ");
        int sayi=scanner.nextInt();
        int bolenlerToplami=0;
        for(int i=1;i<sayi;i++){
            if(sayi % i ==0){
                System.out.println(i);
                bolenlerToplami+=i;
            }
        }
        if(bolenlerToplami==sayi){
            System.out.println(sayi+" Mukemmel Sayidir.");
        }
        else
            System.out.println(sayi+" Mukemmel Sayi Degildir.");
   

    }
}