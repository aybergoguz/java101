import java.util.Scanner;

public class Odev11{

    public static void main(String[] args){

        int sicaklik;
        
        Scanner girilenDeger=new Scanner(System.in);

        System.out.println("Sicaklik Degerini Giriniz : ");
        sicaklik=girilenDeger.nextInt();

        if(sicaklik<5){
            System.out.println("Kayak yapabilirsiniz.");
        }
        else if(sicaklik>=5 && sicaklik<15){
            System.out.println("Sinemaya gidebilirsiniz.");
        }
        else if(sicaklik>=15 && sicaklik<25){
            System.out.println("Piknik yapabilirsiniz.");
        }
        else
        System.out.println("Yüzmeye gidebilirsiniz");

    }
}