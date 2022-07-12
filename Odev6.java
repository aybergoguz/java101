import java.util.Scanner;

public class Odev6{

    public static void main(String[] args) {

        double boy,kilo,vucutKitleEndeksi;

        Scanner girilenDeger=new Scanner(System.in);

        System.out.println("Lütfen Boyunuzu Giriniz : ");
        boy=girilenDeger.nextDouble();
        System.out.println("Lütfen Kilonuzu Giriniz : ");
        kilo=girilenDeger.nextDouble();

        vucutKitleEndeksi=kilo/(boy*boy);

        System.out.println("Vücut Kitle Endeksiniz : "+vucutKitleEndeksi);

        
    }
}
