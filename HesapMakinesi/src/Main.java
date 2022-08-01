import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       int sayi1,sayi2;
       int sonuc;

        Scanner input=new Scanner(System.in);

        System.out.println("Lütfen Birinci Sayıyı Giriniz:");
        sayi1=input.nextInt();
        System.out.println("Lütfen İkinci Sayıyı Giriniz:");
        sayi2=input.nextInt();
        System.out.println("Lütfen Yapmak İstediğiniz İşlemi Seçiniz");
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        sonuc=input.nextInt();

        switch (sonuc){
            case 1:
                System.out.println("Toplama İşleminin Sonucu:" +(sayi1+sayi2));
                break;
            case 2:
                System.out.println("Çıkarma İşleminin Sonucu:" +(sayi1-sayi2));
                break;
            case 3:
                System.out.println("Çarpma İşleminin Sonucu:" +(sayi1*sayi2));
                break;
            case 4:
                System.out.println("Bölme İşleminin Sonucu:" +(sayi1/sayi2));
                break;
            default:
                System.out.println("Hatalı Bir Seçim Yaptınız!");
                break;
        }



    }

}
