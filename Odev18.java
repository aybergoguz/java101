import java.util.Scanner;

public class Odev18{

    public static void main(String[] args) {

        int n,r;
        Scanner scanner =new Scanner(System.in);
        System.out.println("n sayisini Giriniz : ");
        n=scanner.nextInt();
        System.out.println("r sayisini Giriniz : ");
        r=scanner.nextInt();

        int nFaktoriyel=1,rFaktoriyel=1,nrFaktoriyel=1;
        for(int i=1;i<=n;i++){
           nFaktoriyel*=i;
        }
        for(int j=1;j<=r;j++){
            rFaktoriyel*=j;
        }
        for(int k=1;k<=(n-r);k++){
            nrFaktoriyel*=k;
        }
        int kombinasyon=nFaktoriyel/(rFaktoriyel*nrFaktoriyel);
        System.out.println("C("+n+","+r+")="+kombinasyon);
    }
}