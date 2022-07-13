import java.util.Scanner;

/*
Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
*/
public class Odev9{

    public static void main(String[] args) {

        String sifre,kullaniciAdi;

        Scanner girilenDeger=new Scanner(System.in);

        System.out.println("Kullanici Adinizi Giriniz :");
        kullaniciAdi=girilenDeger.nextLine();

        System.out.println("Sifrenizi Giriniz :");
        sifre=girilenDeger.nextLine();

        if(kullaniciAdi.equals("kullanici") && sifre.equals("123456")){
            System.out.println("Sisteme Hoşgelediniz");
        }
        else {
            System.out.println("Sifrenizi Sıfırlamak İstiyor musunuz?\n1-)Evet\n2-)Hayır");
            int tercih=girilenDeger.nextInt();
            if(tercih==1){
                System.out.println("Lütfen Yeni Şifrenizi giriniz :");
                girilenDeger.nextLine();
                String yeniSifre=girilenDeger.nextLine();
                    if(yeniSifre.equals("123456")){
                        System.out.println("Şifre Oluşturulamadı.\nLütfen Başka Şifre Giriniz.");
                    }
                    else{
                    sifre=yeniSifre;
                    System.out.println("Şifreniz Oluşturuldu.");}
            }
            else 
                System.out.println("iyi günler.");
                
        
             }
            

            
        }
        
}