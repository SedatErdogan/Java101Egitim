import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        int mat, fizik, kimya, turkce, muzik;

        Scanner input=new Scanner(System.in);

        System.out.println("Lütfen Matematik Notunuzu Giriniz:");
        mat=input.nextInt();

        System.out.println("Lütfen Fizik Notunuzu Giriniz:");
        fizik=input.nextInt();

        System.out.println("Lütfen Kimya Notunuzu Giriniz:");
        kimya=input.nextInt();

        System.out.println("Lütfen Türkçe Notunuzu Giriniz:");
        turkce=input.nextInt();

        System.out.println("Lütfen Müzik Notunuzu Giriniz:");
        muzik=input.nextInt();

        if((0 <= mat && mat <= 100) && (0 <= fizik && fizik <= 100) && (0 <= turkce && turkce <= 100) && (0 <= muzik && muzik <= 100) && (0 <= kimya && kimya <= 100)) {


            int toplam=mat+fizik+kimya+turkce+muzik;
            int sonuc=toplam/5;

            String cikti=sonuc >= 55 ? "Sınıfı Geçtiniz." : "Sınıfı Geçemediniz.";

            System.out.println("Not ortalamanız:" +sonuc+" "+cikti);

        } else {
            System.out.println("Hatalı bir not girişi yaptınız. Lütfen 0 ile 100 arasında not giriniz.");

        }

    }
}
