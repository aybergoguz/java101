import java.util.Scanner;

public class Odev8{

    public static void main(String[] args) {

        int ilkSayi , ikinciSayi , yapilacakIslem;

        Scanner girilenDeger=new Scanner(System.in);

        System.out.println("Lütfen hangi islemi yapacigini seciniz");

        System.out.println("1-)Toplama\n2-)Cıkartma\n3-)Carpma\n4-)Bolme");
        yapilacakIslem=girilenDeger.nextInt();

        System.out.println("Birinci Sayiyi Giriniz :");
        ilkSayi=girilenDeger.nextInt();

        System.out.println("İkinci Sayiyi Giriniz :");
        ikinciSayi=girilenDeger.nextInt();

        switch(yapilacakIslem){
            case 1 :
            System.out.println("Toplama Sonucu :"+(ilkSayi+ikinciSayi));
            break;
            case 2 :
            System.out.println("Cıkartma Sonucu :"+ (ilkSayi-ikinciSayi));
            break;
            case 3 :
            System.out.println("Carpma Sonucu :"+ (ilkSayi*ikinciSayi));
            break;
            case 4:
            System.out.println("Bolme Sonucu :"+(ilkSayi/ikinciSayi));
            break;
            default:
            System.out.println("Tekrar deneyiniz");

        }
        
    }
}