import java.util.Scanner;

public class Main {

    public static void main(String[] args){


        int acilisUcreti=10;
        double kmUcreti=2.20;
        int km;
        double toplam;
        double sonuc;

        Scanner input=new Scanner(System.in);

        System.out.println("Lütfen kilometreyi giriniz:");
        km=input.nextInt();

        toplam=acilisUcreti+(km*kmUcreti);


        sonuc=(toplam<20) ? 20 : toplam;
        System.out.println("Toplam ödenecek tutar:"+sonuc);


    }

}
