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

        if(toplamDersSayisi != 0){
            double ortalama=(matematik+fizik+kimya+muzik+turkce)/toplamDersSayisi;
            if (toplamDersSayisi != 5){
                System.out.print("Bir veya birden fazla dersi 0-100 araligi disinda girdiniz.Lutfen Tekrar giriniz.\nSu anki ortalamaniz"+ortalama);
            }
            else{
                if(ortalama<55){
                    System.out.println("Kaldiniz \nOrtalmaniz : "+ortalama);}
                else{
                    System.out.println("Gectiniz\nOrtalamaniz : "+ ortalama);}
            }
        }
        else
        System.out.println("Bütün girdiginiz notlar 0-100 arasinda degil"); //0'a bolme hatası
        

    }

}