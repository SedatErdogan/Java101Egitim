import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int k, toplam=1, n;

        System.out.println("Lütfen bir sayı giriniz: ");
        k=input.nextInt();
        System.out.println("Lütfen üs giriniz: ");
        n=input.nextInt();


        for(int i=1; i<=n; i++ ){

            toplam *=k;




        }
        System.out.println("Cevap: " +toplam);

    }



}
