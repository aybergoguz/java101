import java.util.Scanner;

public class Odev10{
    
    public static void main(String[] args) {

        int matematik,fizik,kimya,turkce,muzik;
       
        Scanner girilenDeger= new Scanner(System.in);

        System.out.println("Matematik Notunuzu Giriniz : ");
        matematik=girilenDeger.nextInt();

        System.out.println("Fizik Notunuzu Giriniz : ");
        fizik=girilenDeger.nextInt();

        System.out.println("Kimya Notunuzu Giriniz : ");
        kimya=girilenDeger.nextInt();

        System.out.println("Muzik Notunuzu Giriniz : ");
        muzik=girilenDeger.nextInt();

        System.out.println("Turkce Notunuzu Giriniz : ");
        turkce=girilenDeger.nextInt();

        int toplamDersSayisi=5;
        if(matematik>100 || matematik<0){
            matematik=0;
            toplamDersSayisi--;
        }
        if(fizik>100 || fizik<0){
            fizik=0;
            toplamDersSayisi--;
        }
        if(kimya>100 || kimya<0){
            kimya=0;
            toplamDersSayisi--;
        }
        if(turkce>100 || turkce<0){
            turkce=0;
            toplamDersSayisi--;
        }
        if(muzik>100 || muzik<0){
            muzik=0;
            toplamDersSayisi--;
        }

        double ortalama=(matematik+fizik+kimya+muzik+turkce)/toplamDersSayisi;

        if(ortalama<55){
            System.out.println("Gecerli giris yaptığınız derslerden kaldınız");}
        else{
            System.out.println("Gecerli giris yaptığınız derslerden gectiniz");}
        System.out.println("Ortalamaniz : "+ortalama);

    }
}