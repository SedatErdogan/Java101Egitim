import java.util.Scanner;

public class Main {


        public static void main(String[] args) {
            int sayi , toplam = 0;
            do {
                Scanner input = new Scanner(System.in);
                System.out.print("Lütfen Sayı Giriniz: ");
                sayi = input.nextInt();
                if ( sayi % 2 == 0 && sayi % 4 == 0){

                    toplam +=sayi;

                }

            } while (sayi % 2 ==0);
            System.out.println(" Sonuç =   " + toplam);


        }
    }

