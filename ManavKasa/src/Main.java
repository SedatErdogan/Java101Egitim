import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        double armut=2.14;
        double elma=3.67;
        double domates=1.11;
        double muz=0.95;
        int patlıcan=5;
        double sonuc;
        double a,b,c,d,e;

        Scanner input=new Scanner(System.in);

        System.out.println("Kaç Kilo Armut Alındı:");
        a=input.nextDouble();
        System.out.println("Kaç Kilo Elma Alındı:");
        b=input.nextDouble();
        System.out.println("Kaç Kilo Domates Alındı:");
        c=input.nextDouble();
        System.out.println("Kaç Kilo Muz Alındı:");
        d=input.nextDouble();
        System.out.println("Kaç Kilo Patlıcan Alındı:");
        e=input.nextDouble();

        sonuc=(a*armut)+(b*elma)+(c*domates)+(d*muz)+(e*patlıcan);

        System.out.println("Toplam Tutar:"+sonuc);


    }

}
