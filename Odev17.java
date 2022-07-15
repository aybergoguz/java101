import java.util.Scanner;

public class Odev17{

    public static void main(String[] args) {

        int n;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Sayi Giriniz : ");
        n=scanner.nextInt();
        for(int i=0;i<=n;i++){
            if(i % 4==0 || i % 5==0){
                System.out.println(i);
            }

        }
    }
}