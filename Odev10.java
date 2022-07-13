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

        int n=5;
        if(matematik>100 || matematik<0){
            matematik=0;
            n--;
        }
        if(fizik>100 || fizik<0){
            fizik=0;
            n--;
        }
        if(kimya>100 || kimya<0){
            kimya=0;
            n--;
        }
        if(turkce>100 || turkce<0){
            turkce=0;
            n--;
        }
        if(muzik>100 || muzik<0){
            muzik=0;
            n--;
        }

        double ortalama=(matematik+fizik+kimya+muzik+turkce)/n;

        if(ortalama<55){
            System.out.println("Kaldınız");}
        else{
            System.out.println("Gectiniz");}
        System.out.println("Ortalamaniz : "+ortalama);

    }
}