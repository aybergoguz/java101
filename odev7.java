import java.util.Scanner;

public class odev7{

    public static void main(String[] args) {

        double armutFiyat=2.14,elmaFiyat=3.67,domatesFiyat=1.11,
        muzFiyat=0.95,patlicanFiyat=5.00,armutMiktar,elmaMiktar,domatesMiktar,muzMiktar,patlicanMiktar,toplamTutar;
        // hayatında pazara gitmemis

        Scanner girilenDeger= new Scanner(System.in);

        System.out.println("Kac kilo armut aldınız : ");
        armutMiktar=girilenDeger.nextDouble();

        System.out.println("Kac kilo elma aldınız : ");
        elmaMiktar=girilenDeger.nextDouble();

        System.out.println("Kac kilo domates aldınız : ");
        domatesMiktar=girilenDeger.nextDouble();

        System.out.println("Kac kilo muz aldınız : ");
        muzMiktar=girilenDeger.nextDouble();

        System.out.println("Kac kilo patlıcan aldınız : ");
        patlicanMiktar=girilenDeger.nextDouble();

        toplamTutar=armutFiyat*armutMiktar+elmaFiyat*elmaMiktar+
        domatesFiyat*domatesMiktar+muzFiyat*muzMiktar+patlicanFiyat*patlicanMiktar;

        System.out.println("Armut Kaç Kilo : "+armutMiktar+"\n"+
                    "Elma Kaç Kilo : "+elmaMiktar+"\n"+
                    "Domates Kaç kilo : "+domatesMiktar+"\n"+
                    "Muz Kaç Kilo : "+muzMiktar+"\n"+
                    "Patlıcan Kaç Kilo : "+elmaMiktar+"\n"+
                    "Toplam Tutar : "+ toplamTutar);



        
    }
}