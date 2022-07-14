import java.util.Scanner;

public class odev13{

    public static void main(String[] args) {

        int ay,gun;
        Scanner girilenDeger =new Scanner(System.in);

        System.out.println("Dogdugunuz Ayi Giriniz : ");
        ay=girilenDeger.nextInt();

        System.out.println("Dogdugunuz Gunu Giriniz : ");
        gun=girilenDeger.nextInt();

        if(ay>0 && ay<=12 ){
            if(ay==1){
                if(gun>0 && gun<=31){
                    if(gun<22)
                    System.out.println("Oglak Burcusunuz.");
                    else
                    System.out.println("Kova Burcusunuz.");
                }
                else
                System.out.println("1-31 arasi gecerli bir gun numarasi giriniz.");
            }
            if(ay==2){
                if(gun>0 && gun<=29){
                    if(gun<20)
                    System.out.println("Kova Burcusunuz.");
                    else
                    System.out.println("Balik Burcusunuz.");
                }
                else
                System.out.println("1-29 arasi gecerli bir gun numarasi giriniz.");
            }
            if(ay==3){
                if(gun>0 && gun<=31){
                    if(gun<22)
                    System.out.println("Balik Burcusunuz.");
                    else
                    System.out.println("Koç Burcusunuz.");
                }
                else
                System.out.println("1-31 arasi gecerli bir gun numarasi giriniz.");
            }
            if(ay==4){
                if(gun>0 && gun<=30){
                    if(gun<21)
                    System.out.println("Koç Burcusunuz.");
                    else
                    System.out.println("Boga Burcusunuz.");
                }
                else
                System.out.println("1-30 arasi gecerli bir gun numarasi giriniz.");
            }
            if(ay==5){
                if(gun>0 && gun<=31){
                    if(gun<22)
                    System.out.println("Boga Burcusunuz.");
                    else
                    System.out.println("Ikizler Burcusunuz.");
                }
                else
                System.out.println("1-31 arasi gecerli bir gun numarasi giriniz.");
            }
            if(ay==6){
                if(gun>0 && gun<=30){
                    if(gun<23)
                    System.out.println("Ikizler Burcusunuz.");
                    else
                    System.out.println("Yengec Burcusunuz.");
                }
                else
                System.out.println("1-30 arasi gecerli bir gun numarasi giriniz.");
            }
            if(ay==7){
                if(gun>0 && gun<=31){
                    if(gun<23)
                    System.out.println("Yengec Burcusunuz.");
                    else
                    System.out.println("Aslan Burcusunuz.");
                }
                else
                System.out.println("1-31 arasi gecerli bir gun numarasi giriniz.");
            }
            if(ay==8){
                if(gun>0 && gun<=31){
                    if(gun<23)
                    System.out.println("Aslan Burcusunuz.");
                    else
                    System.out.println("Basak Burcusunuz.");
                }
                else
                System.out.println("1-31 arasi gecerli bir gun numarasi giriniz.");
            }
            if(ay==9){
                if(gun>0 && gun<=30){
                    if(gun<23)
                    System.out.println("Basak Burcusunuz.");
                    else
                    System.out.println("Terazi Burcusunuz.");
                }
                else
                System.out.println("1-30 arasi gecerli bir gun numarasi giriniz.");
            }
            if(ay==10){
                if(gun>0 && gun<=31){
                    if(gun<23)
                    System.out.println("Terazi Burcusunuz.");
                    else
                    System.out.println("Akrep Burcusunuz.");
                }
                else
                System.out.println("1-31 arasi gecerli bir gun numarasi giriniz.");
            }
            if(ay==11){
                if(gun>0 && gun<=30){
                    if(gun<22)
                    System.out.println("Akrep Burcusunuz.");
                    else
                    System.out.println("Yay Burcusunuz.");
                }
                else
                System.out.println("1-30 arasi gecerli bir gun numarasi giriniz.");
            }
            if(ay==12){
                if(gun>0 && gun<=31){
                    if(gun<22)
                    System.out.println("Yay Burcusunuz.");
                    else
                    System.out.println("Oglak Burcusunuz.");
                }
                else
                System.out.println("1-31 arasi gecerli bir gun numarasi giriniz.");
            }
        }
        else
        System.out.println("1 den 12 ye kadar gecerli bir ay numarasi giriniz");

    }
}