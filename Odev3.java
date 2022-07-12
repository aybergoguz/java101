import java.util.Scanner;

public class Odev3 {
    public static void main(String[] args) {
        //ucgen alan hesabi
        double birinciKenar,ikinciKenar,ucuncuKenar;
        Scanner girilenDeger=new Scanner(System.in);
        System.out.println("Lütfen üçgenin 1. kenar uzunluğunu giriniz");
        birinciKenar=girilenDeger.nextDouble();
        System.out.println("Lütfen üçgenin 2. kenar uzunluğunu  giriniz");
        ikinciKenar=girilenDeger.nextDouble();
        System.out.println("Lütfen üçgenin 2. kenar uzunluğunu  giriniz");
        ucuncuKenar=girilenDeger.nextDouble();

        double ucgeninCevresi=birinciKenar+ikinciKenar+ucuncuKenar;

        double u= ucgeninCevresi/2;

        double ucgeninAlani=Math.sqrt(u*(u-birinciKenar)*(u-ikinciKenar)*(u-ucuncuKenar));

        System.out.println("Kenarlarını Girdiğiniz Üçgenin Alanı : "+ ucgeninAlani);






        
    }
}