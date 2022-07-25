import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        double ucret;
        double kdvOran;
        double kdv;
        double kdvli;
        boolean kdvKontrol;

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen Fiyat Giriniz:");
        ucret=input.nextDouble();

        kdvKontrol=(0<ucret) && (ucret<1000);
        kdvOran=kdvKontrol ? 0.18: 0.08;


        System.out.println("KDV'siz Fiyat:"+ucret);
        System.out.println("KDV Oranı:"+kdvOran);
        kdv=kdvOran*ucret;
        System.out.println("KDV Tutarı:"+kdv);
        kdvli=ucret+kdv;
        System.out.println("KDV'li Fiyat:"+kdvli);


    }

}
