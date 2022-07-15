import java.util.Scanner;

public class Odev26{

    public static void main(String[] args) {

        
        Scanner scanner =new Scanner(System.in);
        System.out.println("Kaç Tane Sayi Gireceksiniz : ");
        int girilenSayiAdedi=scanner.nextInt();
        int max=0;
        int min=1000000000;
        for(int i=1;i<=girilenSayiAdedi;i++){
            
            System.out.println(i+". Sayiyi Giriniz");
            int sayi=scanner.nextInt();
            if(sayi>max){
                max=sayi;
            }
            if(sayi<min){
                min=sayi;
            }
        }
        System.out.println("En Buyukk Sayi : "+ max);
        System.out.println("En kucuk Sayi :"+ min);

    }
}