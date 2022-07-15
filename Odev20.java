/*Armstrong Sayı Nedir ?
N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.*/
import java.util.Scanner;

public class Odev20{

    public static void main(String[] args) {

        int numara,basamakSayisi=0;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Sayiyi Giriniz : ");
        numara=scanner.nextInt();
        int tempNumara=numara; //gecici degisken
        int basamakDegeri;
        while(tempNumara!=0){
            tempNumara/=10;  
            basamakSayisi++; //basamak sayisini bulma
        }
        System.out.println(basamakSayisi);
        tempNumara=numara;
        System.out.println(tempNumara);
        int amstrongSayisi=0;
        
        while(tempNumara!=0){
            basamakDegeri=tempNumara % 10;
            System.out.println(basamakDegeri);
            int basamaginUssu=1;
            for(int i=1;i<=basamakSayisi;i++){
                basamaginUssu *= basamakDegeri;
                System.out.println(basamaginUssu);
            }
            amstrongSayisi+=basamaginUssu;
            System.out.println(amstrongSayisi);
            tempNumara/=10;
        }
        
        if (amstrongSayisi==numara){
            System.out.println(numara +": amstorng sayisidir.");
        }
        else

            System.out.println(numara+"amstron saiyisi degildir.");

    }
}