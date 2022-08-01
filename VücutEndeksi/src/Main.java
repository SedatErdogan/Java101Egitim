import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        int kilo;
        double boy;
        double sonuc;

        Scanner input= new Scanner(System.in);

        System.out.println("Lütfen kilonuzu giriniz:");
        kilo=input.nextInt();
        System.out.println("Lütfen boyunuzu giriniz:");
        boy=input.nextDouble();

        sonuc=kilo/(boy*boy);

        System.out.println("Vücut kitle endeksiniz:" +sonuc);


    }




}
