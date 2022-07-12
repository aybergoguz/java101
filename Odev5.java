import java.util.Scanner;

public class Odev5{

    public static void main(String[] args) {

        double pi=3.14,yariCap,merkezAcisi,daireDilimininAlani;

        Scanner girilenDeger= new Scanner(System.in);
        
        System.out.println("Dairenin Yarıçapını Giriniz :");
        yariCap=girilenDeger.nextDouble();

        System.out.println("Kaç Derecelik Bir Daire Dilimi Seçmek İstiyorsunuz ?");
        merkezAcisi=girilenDeger.nextDouble();
        
        daireDilimininAlani=pi*yariCap*yariCap*merkezAcisi/360;

        System.out.println("Seçtiğiniz Daire Diliminin Alani : " + daireDilimininAlani);


        


        
    }
}