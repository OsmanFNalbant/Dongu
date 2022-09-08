import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int toplam =0;
        int a=0;
        while(a%2==0){
        System.out.println("Sayi giriniz:");
        a = sc.nextInt();
        if(a%4==0){
        toplam +=a;}
                     }
        System.out.println("Sonuc:"+toplam);
    }
}