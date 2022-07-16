import java.util.Scanner;

public class Odev30 {

    public static void main(String[] args) {
        // 0'dan baslanmasi istenen fibonacci
        Scanner scanner=new Scanner(System.in);
        System.out.println("Kac elemanlı bir fibronacci serisi yaratmak istiyorsunuz? ");
        int n =scanner.nextInt();

        int a=0;
        int b=1;
        int c=a+b;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=1;i<=(n-2);i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }


    }
}