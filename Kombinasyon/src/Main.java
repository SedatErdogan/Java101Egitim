import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int n,r,nEksiR;
        long toplamN=1, toplamR=1, toplamNR=1, sonuc;

        System.out.print("C(n,r) Lütfen n sayısını giriniz: ");
        n=input.nextInt();

        System.out.print("C(n,r) Lütfen r sayısını giriniz: ");
        r=input.nextInt();


        for (int i=1; i<=n; i++){
            toplamN=toplamN*i;

        }
        for (int j=1; j<=r; j++){
            toplamR=toplamR*j;

        }

        nEksiR=n-r;

        for (int k=1; k<=nEksiR; k++){
            toplamNR=toplamNR*k;


        }

        sonuc=toplamN/(toplamR*toplamNR);

        if (n>r){
            System.out.println("Kombinasyon sonucu: "+sonuc);

        }else {
            System.out.println("Yanlış bir giriş yaptınız! R sayısı N sayısından büyük olamaz!");
        }

    }

}
