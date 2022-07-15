import java.util.Scanner;

public class Odev24{

    public static void main(String[] args) {

        String userName , password;
        Scanner scanner =new Scanner(System.in);
        int girisYapmaHakki=3;
        int bakiye=1500;
        int select;
        while(girisYapmaHakki>0){
            System.out.println("Kullanici Adinizi giriniz : ");
            userName=scanner.nextLine();
            System.out.println("Sifrenizi Giriniz : ");
            password=scanner.nextLine();
            if(userName.equals("kullanici") && password.equals("123456") ){
                System.out.println("Sisteme giris yaptiniz");
                do{
                    System.out.println("Lutfen yapmak istediginiz islemi seciniz"
                +"\n1-)Para Yatirma"
                +"\n2-)Para Cekme"
                +"\n3-)Bakiye Sorgulama"
                +"\n4-)Cikis Yap");
                select=scanner.nextInt();
                switch(select){
                    case 1:
                        System.out.println("Para Miktari: ");
                        int yatirilanPara=scanner.nextInt();
                        bakiye +=yatirilanPara;
                        System.out.println("Yeni Bakiyeniz : "+bakiye);
                    break;
                    case 2:
                        System.out.println("Para Miktari: ");
                        int cekilenPara =scanner.nextInt();
                            if (cekilenPara>bakiye){
                                System.out.println("Bakiye Yetersiz");
                            }
                            else{
                                bakiye-=cekilenPara;
                                System.out.println("Yeni Bakiyeniz : "+bakiye);
                            } 
                    break;
                    case 3:
                            System.out.println("Bakiyeniz : "+bakiye);
                    break;
                }

                }while(select != 4);
            break;
            }
            else{
                girisYapmaHakki--;
                System.out.println("Hatali giris yaptiniz.");
                if(girisYapmaHakki==0){
                    System.out.println("Hesabainiz bloke olmustur.Lutfen banka ile iletisime geciniz");
                }
                else{
                    System.out.println("Kalan Hakkiniz : "+ girisYapmaHakki);
                }
            }
        }

    }
}