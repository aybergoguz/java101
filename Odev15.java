import java.util.Scanner;

public class Odev15{

    public static void main(String[] args) {

        double sayi;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen Sayi giriniz : ");
        sayi=scanner.nextDouble();
        int toplam=0;
        int sayac=0;
        for(int i=1;i<=sayi;i++){
            if(i % 12==0){
                toplam +=i;
                sayac++;
            }
        }
        double ortalama=toplam/sayac;
        System.out.println(ortalama);
    }
}