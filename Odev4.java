import java.util.Scanner;

public class Odev4 {
    public static void main(String[] args) {

        double minumumOdemeTutari=20.0,kilometreBasiUcret=2.2,taksiMetreAcilisUcreti=10.0,katedilenKm,odenecekUcret;

        Scanner girilenDeger=new Scanner(System.in);
        System.out.println("Gidilen mesafeyi km olarak giriniz : ");
        katedilenKm=girilenDeger.nextDouble();

        odenecekUcret=taksiMetreAcilisUcreti+katedilenKm*kilometreBasiUcret;

        boolean kosul = odenecekUcret<20;

        double durum = kosul ? minumumOdemeTutari : odenecekUcret;

        System.out.println("Odemeniz Gerken Ucret : "+ durum +"Tl");


    

       
        
        
    }
}