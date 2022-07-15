import java.util.Scanner;

public class Odev25{

    public static void main(String[] args) {

        
        Scanner scanner =new Scanner(System.in);
        System.out.println("Birinci Sayiyi Giriniz : ");
        int birinciSayi=scanner.nextInt();

        System.out.println("Ikinci Sayiyi Giriniz : ");
        int ikinciSayi=scanner.nextInt();

        int temp;
        if(birinciSayi>ikinciSayi){
            temp=ikinciSayi;
        }
        else
            temp=birinciSayi;
        
        int ebob=1;

        int i=1;
        while(i<=temp){
            if(birinciSayi % i==0 && ikinciSayi % i==0){
                ebob=i;
            }
            i++;
        }
        System.out.println(birinciSayi+" ve "+ikinciSayi+" sayilarinin ebobu :"+ ebob);

        int ekok= (birinciSayi*ikinciSayi)/ebob;

        System.out.println(birinciSayi+" ve "+ikinciSayi+" sayilarinin ekok :"+ ekok);

        




    }
}