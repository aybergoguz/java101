import java.util.Scanner;

public class Odev21{

    public static void main(String[] args) {

        int numara,basamakDegeri=0;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Sayiyi Giriniz : ");
        numara=scanner.nextInt();
        int basamakDegeriToplami=0;
        
        while(numara!=0){
            
            basamakDegeri=numara % 10;
            basamakDegeriToplami+=basamakDegeri;
           
            numara/=10;
        }
        System.out.println(basamakDegeriToplami);

    }
}