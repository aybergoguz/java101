import java.util.Scanner;

public class Odev2 {

    public static void main(String[] args) {
        
        double tutar,kdvOrani8=0.08,kdvOrani18=0.18;

        Scanner girilenDeger =new Scanner(System.in);
        System.out.println("Ücret tutarını giriniz : ");
        tutar=girilenDeger.nextDouble();

        if(tutar<=1000)
            tutar=(tutar*kdvOrani18)+tutar;
        else if(tutar>1000)
            tutar=(1000*kdvOrani18)+((tutar-1000)*kdvOrani8)+tutar;
        else 
            System.out.println("Lütfen geçerli bir değer giriniz");
        System.out.println(tutar);
    
    }
}