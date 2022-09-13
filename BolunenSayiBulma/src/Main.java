import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double k, sayac=0;
        double sonuc, toplam=0;

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        k=input.nextDouble();


        for (int i=0; i<=k; i++ ){
            if(i % 3==0 && i % 4==0){
                toplam +=i;
                sayac++;
            }
        }
        sonuc=toplam/(sayac-1);
        System.out.println(sonuc);

    }


}
