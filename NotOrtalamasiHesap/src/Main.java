import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner input=new Scanner(System.in);

        System.out.println("Lütfen Matematik Notunuzu Giriniz:");
        mat=input.nextInt();

        System.out.println("Lütfen Fizik Notunuzu Giriniz:");
        fizik=input.nextInt();

        System.out.println("Lütfen Kimya Notunuzu Giriniz:");
        kimya=input.nextInt();

        System.out.println("Lütfen Türkçe Notunuzu Giriniz:");
        turkce=input.nextInt();

        System.out.println("Lütfen Tarih Notunuzu Giriniz:");
        tarih=input.nextInt();

        System.out.println("Lütfen Müzik Notunuzu Giriniz:");
        muzik=input.nextInt();

        int toplam=mat+fizik+kimya+turkce+tarih+muzik;
        int sonuc=toplam/6;

        String cikti=sonuc >= 60 ? "Sınıfı Geçtiniz." : "Sınıfı Geçemediniz.";

        System.out.println("Not ortalamanız:" +sonuc+" "+cikti);

    }
}
