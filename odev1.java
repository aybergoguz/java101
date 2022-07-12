import java.util.Scanner;

public class odev1 {
    public static void main(String[] args) {
        int matematik,fizik,kimya,turkce,tarih,muzik;
         
        Scanner girilenDeger =new Scanner(System.in);

        System.out.println("Matematik Notunuzu Giriniz:");
        matematik=girilenDeger.nextInt();

        System.out.println("Fizik Notunuzu Giriniz:");
        fizik=girilenDeger.nextInt();

        System.out.println("Kimya Notunuzu Giriniz:");
        kimya=girilenDeger.nextInt();

        System.out.println("Turkce Notunuzu Giriniz:");
        turkce=girilenDeger.nextInt();

        System.out.println("Tarih Notunuzu Giriniz:");
        tarih=girilenDeger.nextInt();

        System.out.println("Muzik Notunuzu Giriniz:");
        muzik=girilenDeger.nextInt();

        int toplam=matematik+fizik+kimya+turkce+tarih+muzik;
        double ortalama=toplam/6;
        boolean kosul= ortalama >=60;
        String durum= kosul ?"Geçti":"Kaldı";
        System.out.println("Not Ortalamanız: "+ortalama);
        System.out.println("Gecme Durmunuz: "+durum);



        
    }
}