import java.util.Scanner;

public class Odev14{

    public static void main(String[] args) {

        int yil ;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Yil Giriniz : ");
        yil=scanner.nextInt();

        if(yil % 100==0){
            if(yil % 400==0){
                System.out.println(yil+"artik yildir !");
            }
            else 
                System.out.println(yil+"artik yil değildir !");  
        }
        else if(yil % 4==0){
            System.out.println(yil+"artik yildir !");
        }
        else 
            System.out.println(yil+"artik yil değildir !");
        
    }
}